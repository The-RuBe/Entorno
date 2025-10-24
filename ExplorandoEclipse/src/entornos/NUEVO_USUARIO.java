package entornos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;

public class NUEVO_USUARIO {

	private JFrame frmUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NUEVO_USUARIO window = new NUEVO_USUARIO();
					window.frmUsuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public NUEVO_USUARIO() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUsuario = new JFrame();
		frmUsuario.getContentPane().setBackground(Color.LIGHT_GRAY);
		frmUsuario.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\usuario\\Pictures\\Screenshots\\Captura de pantalla 2025-10-24 121541.png"));
		frmUsuario.setForeground(Color.GRAY);
		frmUsuario.setType(Type.POPUP);
		frmUsuario.setTitle("Nuevo \"Usuario\"");
		frmUsuario.setBackground(Color.GRAY);
		frmUsuario.setBounds(100, 100, 546, 598);
		frmUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUsuario.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\"Nuevo Usuario\"");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(110, 11, 309, 117);
		frmUsuario.getContentPane().add(lblNewLabel);
	}
}
