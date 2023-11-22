package ventanas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
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
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import TextUtilities.Editor;
import javax.swing.JSpinner;
import java.awt.Choice;

public class VentanaPrincipal {

	private JFrame frame;

	private JTextPane texto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
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

		/*Pesta�a de Archivo*/
		JMenu Archivo = new JMenu("Archivo");
		Archivo.setMnemonic('a');
		menu.add(Archivo);

		JMenuItem ANuevo = new JMenuItem("Nuevo");
		ANuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		Archivo.add(ANuevo);

		JMenuItem AAbrir = new JMenuItem("Abrir...");
		AAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		Archivo.add(AAbrir);

		JSeparator separator_1 = new JSeparator();
		Archivo.add(separator_1);

		JMenuItem AGuardar = new JMenuItem("Guardar");
		AGuardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		Archivo.add(AGuardar);

		JMenuItem AGuardarComo = new JMenuItem("Guardar como...");
		AGuardarComo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		Archivo.add(AGuardarComo);

		JSeparator separator = new JSeparator();
		Archivo.add(separator);

		JMenuItem ACerrar = new JMenuItem("Cerrar");
		ACerrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		Archivo.add(ACerrar);

		/*Pesta�a de Edicion*/
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
		
		JSeparator separator_3 = new JSeparator();
		Edicion.add(separator_3);

		JMenuItem EBuscarReemplazar = new JMenuItem("Buscar y Reemplazar...");
		EBuscarReemplazar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
		Edicion.add(EBuscarReemplazar);

		JMenu Formato = new JMenu("Formato");
		Formato.setMnemonic('f');
		menu.add(Formato);

		JMenu FAlineamiento = new JMenu("Alineamiento");
		FAlineamiento.setMnemonic('a');
		Formato.add(FAlineamiento);

		JMenuItem FAIzquierda = new JMenuItem("Izquierda");
		FAIzquierda.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		FAIzquierda.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-alinear-a-la-izquierda-24.png")));
		FAlineamiento.add(FAIzquierda);

		JMenuItem FACentro = new JMenuItem("Centro");
		FACentro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		FACentro.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-alinear-al-centro-25 .png")));
		FAlineamiento.add(FACentro);

		JMenuItem FADerecha = new JMenuItem("Derecha");
		FADerecha.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK));
		FADerecha.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/alinearDerecha.png")));
		FAlineamiento.add(FADerecha);

		JSeparator separator_2 = new JSeparator();
		Formato.add(separator_2);

		JMenuItem FCursiva = new JMenuItem("Poner en Cursiva");
		FCursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
		Formato.add(FCursiva);

		JMenuItem FSubrayar = new JMenuItem("Subrayar");
		FSubrayar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_DOWN_MASK));
		Formato.add(FSubrayar);

		JMenuItem FNegrita = new JMenuItem("Poner en Negrita");
		FNegrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_DOWN_MASK));
		Formato.add(FNegrita);

		/*Barra de herraminetas*/
		JToolBar herramientas = new JToolBar();
		superior.add(herramientas);

		JComboBox TipoLetra = new JComboBox();
		TipoLetra.setMaximumRowCount(10);
		String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		TipoLetra.setModel(new DefaultComboBoxModel(fonts));
		TipoLetra.setSelectedIndex(303);
		TipoLetra.setToolTipText("Tipo de letra");
		TipoLetra.setMaximumSize(new Dimension(230, 40));
		herramientas.add(TipoLetra);

		Component horizontalStrut = Box.createHorizontalStrut(20);
		herramientas.add(horizontalStrut);

		JButton bTamano = new JButton("");
		bTamano.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-texto-24.png")));
		bTamano.setSelectedIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-texto-24.png")));
		bTamano.setToolTipText("cambiar tama�o letra");
		herramientas.add(bTamano);

		JButton bColor = new JButton("");
		bColor.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-color-de-texto-25.png")));
		bColor.setToolTipText("color del texto");
		bColor.setVerticalAlignment(SwingConstants.BOTTOM);
		herramientas.add(bColor);

		JButton bNegrita = new JButton("");
		bNegrita.setToolTipText("Negrita");
		bNegrita.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-negrita-25.png")));
		herramientas.add(bNegrita);

		bNegrita.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent arg0) {
				negrita();
			}
		});

		JButton bCursiva = new JButton("");
		bCursiva.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-cursiva-25.png")));
		bCursiva.setToolTipText("cursiva");
		herramientas.add(bCursiva);

		JButton bSubrayar = new JButton("");
		bSubrayar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				subrayado();
			}
		});
		bSubrayar.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-subrayar-25.png")));
		bSubrayar.setToolTipText("subrayar");
		bSubrayar.setVerticalAlignment(SwingConstants.BOTTOM);
		herramientas.add(bSubrayar);

		JButton bAlinearIz = new JButton("");
		bAlinearIz.setToolTipText("Alinear izquierda");
		bAlinearIz.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-alinear-a-la-izquierda-24.png")));
		herramientas.add(bAlinearIz);



		JButton bAlinearCen = new JButton("");
		bAlinearCen.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/icons8-alinear-al-centro-25 .png")));
		bAlinearCen.setToolTipText("Alinear centro");
		herramientas.add(bAlinearCen);

		JButton bAlinearDer = new JButton("");
		bAlinearDer.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/media/alinearDerecha.png")));
		bAlinearDer.setToolTipText("Alinear a la derecha");
		herramientas.add(bAlinearDer);

		JScrollPane center = new JScrollPane();
		center.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(center, BorderLayout.CENTER);

		texto = new JTextPane();
		texto.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		center.setViewportView(texto);


		/*Acciones*/
		ACerrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});


		ANuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!texto.getText().isEmpty()) {
				}

				texto.setText(null);
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
				BuscarYReemplazar vent = new BuscarYReemplazar(texto);
				vent.setVisible(true);
			}
		});

		//Formato//
		TipoLetra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Editor.ponerTipoLetra(texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd(), 
									  fonts[TipoLetra.getSelectedIndex()]);
				
			}
		});

		
		FNegrita.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				negrita();
			}
		});

		FCursiva.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cursiva();
			}
		});

		bCursiva.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent arg0) {
				cursiva();
			}
		});

		//Alineamiento
		FAIzquierda.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				alinear(Editor.Alienamientos.IZQUIERDA);
			}
		});

		bAlinearIz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				alinear(Editor.Alienamientos.IZQUIERDA);
			}
		});

		FACentro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				alinear(Editor.Alienamientos.CENTRAR);
			}
		});

		bAlinearCen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				alinear(Editor.Alienamientos.CENTRAR);

			}
		});

		FADerecha.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				alinear(Editor.Alienamientos.DERECHA);
			}
		});

		bAlinearDer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				alinear(Editor.Alienamientos.DERECHA);
			}
		});

	}

	//Funciones de formato//
	private void negrita() {
		Editor.ponerEnNegrita(texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd());
	}

	private void cursiva() {
		Editor.ponerEnCursiva(texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd());
	}
	
	private void subrayado() {
		Editor.ponerSubrayado(texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd());
	}

	private void alinear(Editor.Alienamientos alineacion) {
		switch(alineacion) {
		case CENTRAR:
			Editor.alinearTextoCentro(texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd());
			break;
		case DERECHA:
			Editor.alinearTextoDerecha (texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd());
			break;
		case IZQUIERDA:
			Editor.alinearTextoIzquierda(texto.getStyledDocument(), texto.getSelectionStart(), texto.getSelectionEnd());
			break;
		}

	}

}
