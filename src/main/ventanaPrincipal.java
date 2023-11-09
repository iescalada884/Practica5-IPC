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
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

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
		
		JMenuItem ANuevo = new JMenuItem("Nuevo");
		ANuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		Archivo.add(ANuevo);
		
		JMenuItem AAbrir = new JMenuItem("Abrir...");
		AAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		Archivo.add(AAbrir);
		
		JSeparator separator_1 = new JSeparator();
		Archivo.add(separator_1);
		
		JMenuItem AGuardar = new JMenuItem("Guardar");
		AGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		Archivo.add(AGuardar);
		
		JMenuItem AGuardarComo = new JMenuItem("Guardar como...");
		Archivo.add(AGuardarComo);
		
		JSeparator separator = new JSeparator();
		Archivo.add(separator);
		
		JMenuItem Cerrar = new JMenuItem("Cerrar");
		Archivo.add(Cerrar);
		
		JMenu Edicion = new JMenu("Edicion");
		Edicion.setMnemonic('e');
		Edicion.setHorizontalAlignment(SwingConstants.LEFT);
		menu.add(Edicion);
		
		JMenuItem ECopiar = new JMenuItem("Copiar");
		ECopiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		Edicion.add(ECopiar);
		
		JMenuItem EPegar = new JMenuItem("Pegar");
		EPegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		Edicion.add(EPegar);
		
		JMenuItem ECortar = new JMenuItem("Cortar");
		ECortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		Edicion.add(ECortar);
		
		JMenuItem EBuscarReemplazar = new JMenuItem("Buscar y Reemplazar");
		EBuscarReemplazar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
		Edicion.add(EBuscarReemplazar);
		
		JToolBar herramientas = new JToolBar();
		superior.add(herramientas);
		
		JButton boton = new JButton("");
		boton.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-alinear-al-centro-32.png")));
		boton.setToolTipText("Alinear centro");
		herramientas.add(boton);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Alinear izquierda");
		btnNewButton.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-alinear-a-la-izquierda-24.png")));
		herramientas.add(btnNewButton);
		
		JScrollPane center = new JScrollPane();
		frame.getContentPane().add(center, BorderLayout.CENTER);
		
		JTextPane texto = new JTextPane();
		center.setViewportView(texto);
		
	}

}
