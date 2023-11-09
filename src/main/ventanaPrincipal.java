package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class ventanaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal window = new ventanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel superior = new JPanel();
		frame.getContentPane().add(superior, BorderLayout.NORTH);
		superior.setLayout(new GridLayout(2, 1, 0, 0));
		
		JMenuBar menu = new JMenuBar();
		superior.add(menu);
		
		JMenu Archivo = new JMenu("Archivo");
		Archivo.setMnemonic('a');
		menu.add(Archivo);
		
		JMenuItem AAbrir = new JMenuItem("Abrir...");
		AAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		Archivo.add(AAbrir);
		
		JSeparator separator = new JSeparator();
		Archivo.add(separator);
		
		JMenu Edicion = new JMenu("Edicion");
		Edicion.setMnemonic('e');
		Edicion.setHorizontalAlignment(SwingConstants.RIGHT);
		menu.add(Edicion);
		
		JToolBar herramientas = new JToolBar();
		superior.add(herramientas);
		
		JButton boton = new JButton("boton");
		herramientas.add(boton);
		
		JScrollPane center = new JScrollPane();
		frame.getContentPane().add(center, BorderLayout.CENTER);
		
		JTextPane texto = new JTextPane();
		center.setViewportView(texto);
		
	}

}
