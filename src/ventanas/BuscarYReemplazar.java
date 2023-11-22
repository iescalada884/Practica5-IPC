package ventanas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import TextUtilities.TextUtilities;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Point;

public class BuscarYReemplazar extends JFrame {

	/**
	 * Default
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField textField;
	private JTextField textField_1;
	private boolean coincide;

    public BuscarYReemplazar(JTextPane texto) {
    	setLocation(new Point(600, 250));
    	setType(Type.POPUP);
    	setIconImage(Toolkit.getDefaultToolkit().getImage(BuscarYReemplazar.class.getResource("/media/icons8-negrita-25.png")));
    	setResizable(false);
    	setAlwaysOnTop(true);
        // Configuraci�n de la ventana principal
        setTitle("Ventana de Busqueda y Reemplazo");
        setSize(409, 182);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Configuraci�n del contenedor principal
        Container container = getContentPane();
        getContentPane().setLayout(null);
        
        JLabel label = new JLabel("Texto a buscar:");
        label.setBounds(35, 12, 104, 20);
        getContentPane().add(label);
        
        textField = new JTextField(20);
        textField.setBounds(202, 13, 166, 20);
        getContentPane().add(textField);
        
        JLabel label_1 = new JLabel();
        label_1.setBounds(266, 15, 0, 0);
        getContentPane().add(label_1);
        
        JLabel label_2 = new JLabel("Texto de reemplazo:");
        label_2.setBounds(35, 41, 133, 20);
        getContentPane().add(label_2);
        
        textField_1 = new JTextField(20);
        textField_1.setBounds(202, 42, 166, 20);
        getContentPane().add(textField_1);
        
        JLabel label_3 = new JLabel();
        label_3.setBounds(195, 41, 0, 0);
        getContentPane().add(label_3);
        
        JButton btnReemplazar = new JButton("Reemplazar actual");
        btnReemplazar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		coincide = TextUtilities.buscaYReemplaza(texto, textField.getText(), textField_1.getText(), false);
        		if (!coincide) {
        			VentanaMensaje a = new VentanaMensaje("No hay coincidencias");
        			a.setVisible(true);
        		}
        	}
        });
        btnReemplazar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnReemplazar.setBounds(215, 85, 144, 23);
        getContentPane().add(btnReemplazar);
        
        JButton btnReemplazarTodo = new JButton("Reemplazar Todo");
        btnReemplazarTodo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		coincide = TextUtilities.buscaYReemplaza(texto, textField.getText(), textField_1.getText(), true);
        		if (!coincide) {
        			VentanaMensaje a = new VentanaMensaje("No hay coincidencias");
        			a.setVisible(true);
        		}
        	}
        });
        btnReemplazarTodo.setBounds(35, 85, 143, 23);
        getContentPane().add(btnReemplazarTodo);
        
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		cerrar();
        	}
        });
        btnCerrar.setBounds(126, 118, 122, 19);
        getContentPane().add(btnCerrar);

        setVisible(true);
    }
    
	private void cerrar() {
		this.dispose();
	}

}
