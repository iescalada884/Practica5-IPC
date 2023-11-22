package TextUtilities;

import java.awt.Color;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.Element;

public class Editor {
	public enum Alienamientos{CENTRAR, DERECHA, IZQUIERDA}
	
	/**
	 * Pone en negrita el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void ponerEnNegrita(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		//primera letra, la que indica el formato del cambio
		Element element = doc.getCharacterElement(inicioSeleccion);
	    AttributeSet attributes = element.getAttributes();
	    //boolean que indica si poner en true o false el parametro deseado
	    boolean NoesNegrita = !(StyleConstants.isBold(attributes));
	    
	    //bucle for que recorre todas las letras a modificar
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
	    	//atributos antiguos de cada letra
		    attributes = element.getAttributes();
		    
		    /********************************************************************
	    	 * 
	    	 * COPIAR ATTRIBUTES EN ATRIBUTOS Y MODIFICAR EL CAMPO CORRESPONDIENTE
	    	 * 
	    	 ********************************************************************/
		    
		    StyleConstants.setBackground(atributos, StyleConstants.getBackground(attributes));
		    
		    StyleConstants.setForeground(atributos, StyleConstants.getForeground(attributes));
		    
		    StyleConstants.setFontSize(atributos, StyleConstants.getFontSize(attributes));

			StyleConstants.setItalic(atributos, StyleConstants.isItalic(attributes));

		    StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));

	    	StyleConstants.setBold(atributos, NoesNegrita);

	    	StyleConstants.setFontFamily(atributos, StyleConstants.getFontFamily(attributes));
	    	
	    	//aplicar cambio de formato
	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	/**
	 * Subraya el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void ponerSubrayado(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		//primera letra, la que indica el formato del cambio
		Element element = doc.getCharacterElement(inicioSeleccion);
	    AttributeSet attributes = element.getAttributes();
	    //boolean que indica si poner en true o false el parametro deseado
	    boolean NoesSubrayado = !(StyleConstants.isUnderline(attributes));
	    
	    //bucle for que recorre todas las letras a modificar
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
	    	//atributos antiguos de cada letra
		    attributes = element.getAttributes();
		    
		    /********************************************************************
	    	 * 
	    	 * COPIAR ATTRIBUTES EN ATRIBUTOS Y MODIFICAR EL CAMPO CORRESPONDIENTE
	    	 * 
	    	 ********************************************************************/
		    
		    StyleConstants.setBackground(atributos, StyleConstants.getBackground(attributes));
		    
		    StyleConstants.setForeground(atributos, StyleConstants.getForeground(attributes));
		    
		    StyleConstants.setFontSize(atributos, StyleConstants.getFontSize(attributes));

			StyleConstants.setItalic(atributos, StyleConstants.isItalic(attributes));

		    StyleConstants.setUnderline(atributos,NoesSubrayado);

		    StyleConstants.setFontFamily(atributos, StyleConstants.getFontFamily(attributes));

	    	StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));
	    	
	    	//aplicar cambio de formato
	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	/**
	 * Cambia el tipo de letra en el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void ponerTipoLetra(StyledDocument doc, int inicioSeleccion, int finSeleccion, String family) {
		//bucle for que recorre todas las letras a modificar
    	for (int i = inicioSeleccion; i <= finSeleccion; i++) {
    		//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
    		SimpleAttributeSet atributos = new SimpleAttributeSet();
    		element = doc.getCharacterElement(inicioSeleccion);
    		//atributos antiguos de cada letra
	    	attributes = element.getAttributes();
	    	
	    	/********************************************************************
	    	 * 
	    	 * COPIAR ATTRIBUTES EN ATRIBUTOS Y MODIFICAR EL CAMPO CORRESPONDIENTE
	    	 * 
	    	 ********************************************************************/
	    	
	    	StyleConstants.setBackground(atributos, StyleConstants.getBackground(attributes));
	    	
	    	StyleConstants.setForeground(atributos, StyleConstants.getForeground(attributes));
	    	
	    	StyleConstants.setFontSize(atributos, StyleConstants.getFontSize(attributes));

			StyleConstants.setItalic(atributos, StyleConstants.isItalic(attributes));
	
			StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));
	
			StyleConstants.setFontFamily(atributos, family);
	
		    StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));
	
		    //aplicar cambio de formato
		    doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	/**
	 * Cambia el tamanho de letra del texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void ponerTamanhoLetra(StyledDocument doc, int inicioSeleccion, int finSeleccion, int tamanho) {
		//bucle for que recorre todas las letras a modificar
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
	    	//atributos antiguos de cada letra
		    attributes = element.getAttributes();
		    
		    /********************************************************************
	    	 * 
	    	 * COPIAR ATTRIBUTES EN ATRIBUTOS Y MODIFICAR EL CAMPO CORRESPONDIENTE
	    	 * 
	    	 ********************************************************************/
		    
		    StyleConstants.setBackground(atributos, StyleConstants.getBackground(attributes));
		    
		    StyleConstants.setForeground(atributos, StyleConstants.getForeground(attributes));
		    
		    StyleConstants.setFontSize(atributos, tamanho);

			StyleConstants.setItalic(atributos, StyleConstants.isItalic(attributes));

			StyleConstants.setFontFamily(atributos, StyleConstants.getFontFamily(attributes));

		    StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));

	    	StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));

	    	//aplicar cambio de formato
	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	/**
	 * Pone en cursiva el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void ponerEnCursiva(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		//primera letra, la que indica el formato del cambio
		Element element = doc.getCharacterElement(inicioSeleccion);
	    AttributeSet attributes = element.getAttributes();
	    //boolean que indica si poner en true o false el parametro deseado
	    boolean NoesCursiva = !(StyleConstants.isItalic(attributes));
	    //bucle for que recorre todas las letras a modificar
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
	    	//atributos antiguos de cada letra
		    attributes = element.getAttributes();
		    
		    /********************************************************************
	    	 * 
	    	 * COPIAR ATTRIBUTES EN ATRIBUTOS Y MODIFICAR EL CAMPO CORRESPONDIENTE
	    	 * 
	    	 ********************************************************************/
		    
		    StyleConstants.setBackground(atributos, StyleConstants.getBackground(attributes));
		    
		    StyleConstants.setForeground(atributos, StyleConstants.getForeground(attributes));
		    
		    StyleConstants.setFontSize(atributos, StyleConstants.getFontSize(attributes));

			StyleConstants.setItalic(atributos, NoesCursiva);

			StyleConstants.setFontFamily(atributos, StyleConstants.getFontFamily(attributes));

		    StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));

	    	StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));

	    	//aplicar cambio de formato
	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	/**
	 * Cambia el color del texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void ponerColor(StyledDocument doc, int inicioSeleccion, int finSeleccion, Color color) {
		//bucle for que recorre todas las letras a modificar
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
	    	//atributos antiguos de cada letra
		    attributes = element.getAttributes();
		    
		    /********************************************************************
	    	 * 
	    	 * COPIAR ATTRIBUTES EN ATRIBUTOS Y MODIFICAR EL CAMPO CORRESPONDIENTE
	    	 * 
	    	 ********************************************************************/
		    
		    StyleConstants.setBackground(atributos, StyleConstants.getBackground(attributes));
		    
		    StyleConstants.setForeground(atributos, color);
		    
		    StyleConstants.setFontSize(atributos, StyleConstants.getFontSize(attributes));

			StyleConstants.setItalic(atributos, NoesCursiva);

			StyleConstants.setFontFamily(atributos, StyleConstants.getFontFamily(attributes));

		    StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));

	    	StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));

	    	//aplicar cambio de formato
	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	/**
	 * Cambia el color del texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void ponerColorFondo(StyledDocument doc, int inicioSeleccion, int finSeleccion, Color color) {
		//bucle for que recorre todas las letras a modificar
	    for (int i = inicioSeleccion; i <= finSeleccion; i++) {
	    	//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
	    	SimpleAttributeSet atributos = new SimpleAttributeSet();
	    	element = doc.getCharacterElement(inicioSeleccion);
	    	//atributos antiguos de cada letra
		    attributes = element.getAttributes();
		    
		    /********************************************************************
	    	 * 
	    	 * COPIAR ATTRIBUTES EN ATRIBUTOS Y MODIFICAR EL CAMPO CORRESPONDIENTE
	    	 * 
	    	 ********************************************************************/
		    
		    StyleConstants.setBackground(atributos, color);
		    
		    StyleConstants.setForeground(atributos, StyleConstants.getForeground(attributes));
		    
		    StyleConstants.setFontSize(atributos, StyleConstants.getFontSize(attributes));

			StyleConstants.setItalic(atributos, NoesCursiva);

			StyleConstants.setFontFamily(atributos, StyleConstants.getFontFamily(attributes));

		    StyleConstants.setUnderline(atributos,StyleConstants.isUnderline(attributes));

	    	StyleConstants.setBold(atributos, StyleConstants.isBold(attributes));

	    	//aplicar cambio de formato
	    	doc.setCharacterAttributes(i, 1, atributos, true);
	    }
	}
	
	/**
	 * Alinea en el centro el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void alinearTextoCentro(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
		SimpleAttributeSet centrar = new SimpleAttributeSet();

		//modificar tipo alineamiento
		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_CENTER);
		
		//aplicar cambio de alienamiento
		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}

	/**
	 * Alinea en la izquierda el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void alinearTextoIzquierda(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
		SimpleAttributeSet centrar = new SimpleAttributeSet();
		
		//modificar tipo alineamiento
		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_LEFT);

		//aplicar cambio de alienamiento
		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}

	/**
	 * Alinea en la derecha el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void alinearTextoDerecha(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
		SimpleAttributeSet centrar = new SimpleAttributeSet();

		//modificar tipo alineamiento
		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_RIGHT);

		//aplicar cambio de alienamiento
		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}

	/**
	 * Justifica el texto desde la posicion inicioSeleccion hasta la posicion finSeleccion
	 * Mantiene el resto de atributos del texto
	 */
	public static void justificarTexto(StyledDocument doc, int inicioSeleccion, int finSeleccion) {
		//nuevo attribute set donde guardar el formato del texto y modificar el campo correspondiente
		SimpleAttributeSet centrar = new SimpleAttributeSet();

		//modificar tipo alineamiento
		StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_JUSTIFIED);

		//aplicar cambio de alienamiento
		doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}


}
