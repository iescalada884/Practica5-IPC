package TextUtilities;

import java.awt.Color;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;

public class Editor {
	public enum Alienamientos{CENTRAR, DERECHA, IZQUIERDA}

public static void ponerEnNegrita(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		
		Element element = doc.getCharacterElement(inicioSeleccion);
	    AttributeSet attributes = element.getAttributes();
	    boolean NoesNegrita = !(StyleConstants.isBold(attributes));
	    
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
		    attributes = element.getAttributes();

			StyleConstants.setItalic(atributos, StyleConstants.isItalic(attributes));

		    StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));

	    	StyleConstants.setBold(atributos, NoesNegrita);

	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	public static void ponerSubrayado(StyledDocument doc, int inicioSeleccion, int finSeleccion) {

		Element element = doc.getCharacterElement(inicioSeleccion);
	    AttributeSet attributes = element.getAttributes();
	    boolean NoesSubrayado = !(StyleConstants.isUnderline(attributes));
	    
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
		    attributes = element.getAttributes();

			StyleConstants.setItalic(atributos, StyleConstants.isItalic(attributes));

		    StyleConstants.setUnderline(atributos,NoesSubrayado);

	    	StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));

	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	public static void ponerTipoLetra(StyledDocument doc, int inicioSeleccion, int finSeleccion, String family) {
		//Si poner es true pone en negrita, si es falso quita la negrita


		SimpleAttributeSet atributos = new SimpleAttributeSet();

		StyleConstants.setFontFamily(atributos, family);

		doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}
	
	public static void ponerTamanhoLetra(StyledDocument doc, int inicioSeleccion, int finSeleccion, int tamanho) {

		SimpleAttributeSet atributos = new SimpleAttributeSet();

		StyleConstants.setFontSize(atributos, tamanho);

		doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}

	public static void ponerEnCursiva(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		Element element = doc.getCharacterElement(inicioSeleccion);
	    AttributeSet attributes = element.getAttributes();
	    boolean NoesCursiva = !(StyleConstants.isItalic(attributes));
	    
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
		    attributes = element.getAttributes();

			StyleConstants.setItalic(atributos, NoesCursiva);

		    StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));

	    	StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));

	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}

	public static void ponerColor(StyledDocument doc, int inicioSeleccion, int finSeleccion, Color color) {
		//Si poner es true pone en cursiva, si es falso quita la cursiva

		SimpleAttributeSet atributos = new SimpleAttributeSet();

		StyleConstants.setForeground(atributos, color);

		doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}

	public static void ponerColorFondo(StyledDocument doc, int inicioSeleccion, int finSeleccion, Color color) {
		//Si poner es true pone en cursiva, si es falso quita la cursiva

		SimpleAttributeSet atributos = new SimpleAttributeSet();

		StyleConstants.setBackground(atributos, color);

		doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}

	public static void alinearTextoCentro(StyledDocument doc, int inicioSeleccion, int finSeleccion) {

		SimpleAttributeSet centrar = new SimpleAttributeSet();

		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_CENTER);

		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}

	public static void alinearTextoIzquierda(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		SimpleAttributeSet centrar = new SimpleAttributeSet();

		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_LEFT);

		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}

	public static void alinearTextoDerecha(StyledDocument doc, int inicioSeleccion, int finSeleccion) {

		SimpleAttributeSet centrar = new SimpleAttributeSet();

		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_RIGHT);

		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}

	public static void justificarTexto(StyledDocument doc, int inicioSeleccion, int finSeleccion) {

		SimpleAttributeSet centrar = new SimpleAttributeSet();

		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_JUSTIFIED);

		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}


}
