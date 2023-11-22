package TextUtilities;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

public class TextUtilities {
	/**
	 * Busca y reemplaza un texto
	 * @param objetivo
	 * @param cambio
	 * @param todo TRUE reemplza todas las coincidencias
	 * 			   FALSE reemplza la primera coincidencia a partir de la seleccion y coloca el cursor en la siguiente
	 * @return TRUE si quedan palabras para sustituir o se ha sustituido con exito
	 */
	public static boolean buscaYReemplaza(JTextPane texto,String objetivo, String cambio, boolean todo) {
		String text = texto.getText();
		boolean hayReemplazo = false;
		
		//Elegir entre todo o a partir del cursor 1 a 1
		if (todo) {
			if (text.contains(objetivo)) {
				texto.setText(text.replaceAll(objetivo, cambio));
				hayReemplazo = true;
			}

		} else {
			int cPos = texto.getSelectionStart();;

			try {
				text = texto.getText(cPos, text.length() - cPos);
			} catch (BadLocationException e) {
				e.printStackTrace();
			}


			text = text.replaceFirst(objetivo, cambio);

			//Anadimos texto con la sustitucion
			try {
				text = texto.getText(0, cPos) + text;
			} catch (BadLocationException e) {
				e.printStackTrace();
			}

			texto.setText(text);

			//Buscamos si hay mas palabras para marcar con el cursor
			int newpos = text.indexOf(objetivo, cPos);
			if (newpos >= 0) {
				texto.setSelectionStart(newpos);
				texto.setSelectionEnd(newpos + objetivo.length());

				hayReemplazo = true;
			} else {
				//vuelta a revisar desde el principio 
				newpos = text.indexOf(objetivo);
				if (newpos >= 0) {
					texto.setSelectionStart(newpos);
					texto.setSelectionEnd(newpos + objetivo.length());
					hayReemplazo = true;
				}
			}
		}

		return hayReemplazo;
	}

}
