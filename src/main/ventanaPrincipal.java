package main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import TextUtilities.Editor;

public class ventanaPrincipal {

	private JFrame frame;

	private JTextPane texto;
	
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
		frame.setBounds(100, 100, 833, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel superior = new JPanel();
		frame.getContentPane().add(superior, BorderLayout.NORTH);
		superior.setLayout(new GridLayout(2, 1, 0, 0));

		JMenuBar menu = new JMenuBar();
		superior.add(menu);

		/*Pestaña de Archivo*/
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

		JMenuItem ACerrar = new JMenuItem("Cerrar");
		Archivo.add(ACerrar);

		/*Pestaña de Edicion*/
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
		
		JMenu Formato = new JMenu("Formato");
		Formato.setMnemonic('f');
		menu.add(Formato);
		
		JMenuItem FNegrita = new JMenuItem("Poner en Negrita");
		FNegrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
		Formato.add(FNegrita);

		/*Barra de herraminetas*/
		JToolBar herramientas = new JToolBar();
		superior.add(herramientas);

		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumSize(new Dimension(230, 40));
		herramientas.add(comboBox);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		herramientas.add(horizontalStrut);

		JButton bTamano = new JButton("");
		bTamano.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-texto-24.png")));
		bTamano.setSelectedIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-texto-24.png")));
		bTamano.setToolTipText("cambiar tamaño letra");
		herramientas.add(bTamano);
		
		JButton bNegrita = new JButton("");
		bNegrita.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-negrita-25.png")));
		herramientas.add(bNegrita);

		JButton bColor = new JButton("");
		bColor.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-color-de-texto-25.png")));
		bColor.setToolTipText("color del texto");
		bColor.setVerticalAlignment(SwingConstants.BOTTOM);
		herramientas.add(bColor);

		JButton bCursiva = new JButton("");
		bCursiva.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-cursiva-25.png")));
		bCursiva.setToolTipText("cursiva");
		herramientas.add(bCursiva);

		JButton bSubrayar = new JButton("");
		bSubrayar.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-subrayar-25.png")));
		bSubrayar.setToolTipText("subrayar");
		bSubrayar.setVerticalAlignment(SwingConstants.BOTTOM);
		herramientas.add(bSubrayar);

		JButton bAlinearDer = new JButton("");
		bAlinearDer.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/alinearDerecha.png")));
		bAlinearDer.setToolTipText("Alinear a la derecha");
		herramientas.add(bAlinearDer);

		JButton bAlinearCen = new JButton("");
		bAlinearCen.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-alinear-al-centro-25 .png")));
		bAlinearCen.setToolTipText("Alinear centro");
		herramientas.add(bAlinearCen);

		JButton bAlinearIz = new JButton("");
		bAlinearIz.setToolTipText("Alinear izquierda");
		bAlinearIz.setIcon(new ImageIcon(ventanaPrincipal.class.getResource("/media/icons8-alinear-a-la-izquierda-24.png")));
		herramientas.add(bAlinearIz);

		Box verticalBox = Box.createVerticalBox();
		herramientas.add(verticalBox);

		JScrollPane center = new JScrollPane();
		frame.getContentPane().add(center, BorderLayout.CENTER);

		texto = new JTextPane();
		center.setViewportView(texto);


		/*Acciones*/
		ACerrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		AGuardarComo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(null);
				if (valorDevuelto == JFileChooser.SAVE_DIALOG) {
					File file = fcAbrir.getSelectedFile();}

			}
		});
		
		AAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fcAbrir = new JFileChooser();
				int valorDevuelto = fcAbrir.showOpenDialog(null);
				if (valorDevuelto == JFileChooser.SAVE_DIALOG) {
					File file = fcAbrir.getSelectedFile();}

			}
		});
		
		//Edicion//
		ECopiar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.copy();
			}
		});
		
		ECortar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.cut();
			}
		});
		
		EPegar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.paste();
			}
		});
		
		EBuscarReemplazar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				reemplazar("hola", "pene");
			}
		});
		
		//Formato//
		FNegrita.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				negrita();
			}
		});
		
		bNegrita.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent arg0) {
				negrita();
			}
		});
		
		
	}
	
	private void negrita() {
		Editor.ponerEnNegrita(texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd(), true);
	}

	private void reemplazar(String objetivo, String cambio) {
		String text = texto.getText();
		
		text.replace(objetivo, cambio);
		
		System.out.print(text);

		texto.setText(text);
	}
}
