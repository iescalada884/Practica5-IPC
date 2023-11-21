package main;

import java.awt.Color;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Editor {
	
	public void ponerEnNegrita(JTextPane editor, int inicioSeleccion, int finSeleccion, boolean poner) {
	    //Si poner es true pone en negrita, si es falso quita la negrita
		StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet atributos = new SimpleAttributeSet();
	    
	    StyleConstants.setBold(atributos, poner);
	    
	    doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}
	public void ponerEnCursiva(JTextPane editor, int inicioSeleccion, int finSeleccion, boolean poner) {
	    //Si poner es true pone en cursiva, si es falso quita la cursiva
		StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet atributos = new SimpleAttributeSet();
	    
	    StyleConstants.setItalic(atributos, poner);
	    
	    doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}
	public void ponerColor(JTextPane editor, int inicioSeleccion, int finSeleccion, Color color) {
	    //Si poner es true pone en cursiva, si es falso quita la cursiva
		StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet atributos = new SimpleAttributeSet();
	    
	    StyleConstants.setForeground(atributos, color);
	    
	    doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}
	public void ponerColorFondo(JTextPane editor, int inicioSeleccion, int finSeleccion, Color color) {
	    //Si poner es true pone en cursiva, si es falso quita la cursiva
		StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet atributos = new SimpleAttributeSet();
	    
	    StyleConstants.setBackground(atributos, color);
	    
	    doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}
	public void ponerColor(JTextPane editor, int inicioSeleccion, int finSeleccion, int tamanho) {
	    //Si poner es true pone en cursiva, si es falso quita la cursiva
		StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet atributos = new SimpleAttributeSet();
	    
	    StyleConstants.setFontSize(atributos, tamanho);
	    
	    doc.setCharacterAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, atributos, true);
	}
	
	public void alinearTextoCentro(JTextPane editor, int inicioSeleccion, int finSeleccion) {
	    StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet centrar = new SimpleAttributeSet();
	    
	    StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_CENTER);
	    
	    doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}
	public void alinearTextoIzquierda(JTextPane editor, int inicioSeleccion, int finSeleccion) {
	    StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet centrar = new SimpleAttributeSet();
	    
	    StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_LEFT);
	    
	    doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}
	public void alinearTextoDerecha(JTextPane editor, int inicioSeleccion, int finSeleccion) {
	    StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet centrar = new SimpleAttributeSet();
	    
	    StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_RIGHT);
	    
	    doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}
	public void justificarTexto(JTextPane editor, int inicioSeleccion, int finSeleccion) {
	    StyledDocument doc = editor.getStyledDocument();
	    SimpleAttributeSet centrar = new SimpleAttributeSet();
	    
	    StyleConstants.setAlignment(centrar, StyleConstants.ALIGN_JUSTIFIED);
	    
	    doc.setParagraphAttributes(inicioSeleccion, finSeleccion - inicioSeleccion, centrar, false);
	}
	
}
