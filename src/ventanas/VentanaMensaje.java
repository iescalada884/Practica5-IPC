package ventanas;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class VentanaMensaje extends JFrame {

	/**
	 * Default
	 */
	private static final long serialVersionUID = 1L;

	public VentanaMensaje(String mensaje) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMensaje.class.getResource("/media/icons8-signo-de-exclamación-25.png")));
		setType(Type.POPUP);
		setResizable(false);
		setAlwaysOnTop(true);
		// Configurar la ventana
        setTitle("Mensaje");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Crear un panel
        JPanel panel = new JPanel();

        // Crear un etiqueta con el mensaje
        JLabel Msg = new JLabel(mensaje);
        Msg.setHorizontalAlignment(SwingConstants.CENTER);
        Msg.setBounds(10, 10, 266, 57);
        Msg.setFont(new Font("Times New Roman", Font.PLAIN, 16));

        // Crear un bot�n "OK"
        JButton okButton = new JButton("OK");
        okButton.setBounds(96, 75, 91, 28);
        okButton.addActionListener(e -> {
            // Cerrar la ventana al hacer clic en el bot�n "OK"
            dispose();
        });
        panel.setLayout(null);

        // Agregar la etiqueta y el bot�n al panel
        panel.add(Msg);
        panel.add(okButton);

        // Agregar el panel a la ventana
        getContentPane().add(panel);

        // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
    }

}
