package TextUtilities;

import java.awt.Color;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Editor {

	public static void ponerEnNegrita(StyledDocument doc, int inicioSeleccion, int finSeleccion, boolean poner) {
		//Si poner es true pone en negrita, si es falso quita la negrita


		SimpleAttributeSet atributos = new SimpleAttributeSet();

		StyleConstants.setBold(atributos, poner);

		doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}

	public static void ponerEnCursiva(StyledDocument doc, int inicioSeleccion, int finSeleccion, boolean poner) {
		//Si poner es true pone en cursiva, si es falso quita la cursiva

		SimpleAttributeSet atributos = new SimpleAttributeSet();

		StyleConstants.setItalic(atributos, poner);

		doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
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

	public static void ponerColor(StyledDocument doc, int inicioSeleccion, int finSeleccion, int tamanho) {
		//Si poner es true pone en cursiva, si es falso quita la cursiva

		SimpleAttributeSet atributos = new SimpleAttributeSet();

		StyleConstants.setFontSize(atributos, tamanho);

		doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}

	public static void alinearTextoCentro(StyledDocument doc, int inicioSeleccion, int finSeleccion) {

		SimpleAttributeSet centrar = new SimpleAttributeSet();

		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_CENTER);

		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}

	public void alinearTextoIzquierda(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
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
