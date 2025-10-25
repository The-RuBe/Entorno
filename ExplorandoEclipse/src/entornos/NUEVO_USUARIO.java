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
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Insets;

public class NUEVO_USUARIO {

	private JFrame frmUsuario;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

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
		frmUsuario.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ruben\\Pictures\\Screenshots\\gatologo.png"));
		frmUsuario.setForeground(Color.GRAY);
		frmUsuario.setType(Type.POPUP);
		frmUsuario.setTitle("Nuevo \"Usuario\"");
		frmUsuario.setBackground(Color.GRAY);
		frmUsuario.setBounds(100, 100, 546, 598);
		frmUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUsuario.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\"Nuevo Usuario\"");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(110, 11, 309, 74);
		frmUsuario.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(40, 100, 64, 14);
		frmUsuario.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(40, 150, 82, 14);
		frmUsuario.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Idioma:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(40, 200, 51, 14);
		frmUsuario.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Correo electrónico:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(40, 250, 129, 14);
		frmUsuario.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Teléfono:");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(40, 300, 64, 14);
		frmUsuario.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Comunicación:");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(40, 350, 98, 14);
		frmUsuario.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Observaciones:");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_6.setBounds(40, 400, 104, 14);
		frmUsuario.getContentPane().add(lblNewLabel_1_6);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(200, 98, 167, 20);
		frmUsuario.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(200, 248, 167, 20);
		frmUsuario.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(200, 298, 167, 20);
		frmUsuario.getContentPane().add(textField_3);
		
		JTextField txtA = new JTextField();
		txtA.setMargin(new Insets(0, 0, 0, 0));
		txtA.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
			}
		});
		txtA.setHorizontalAlignment(SwingConstants.LEFT);
		txtA.setToolTipText("");
		txtA.setColumns(10);
		txtA.setFont(new Font("Arial", Font.PLAIN, 14));
		txtA.setBounds(200, 398, 278, 106);
		frmUsuario.getContentPane().add(txtA);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 148, 167, 20);
		frmUsuario.getContentPane().add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Teléfono");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.ITALIC, 12));
		rdbtnNewRadioButton.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton.setBounds(199, 336, 73, 23);
		frmUsuario.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Correo electrónico");
		rdbtnNewRadioButton_1.setFont(new Font("Arial", Font.ITALIC, 12));
		rdbtnNewRadioButton_1.setBackground(Color.LIGHT_GRAY);
		rdbtnNewRadioButton_1.setBounds(199, 357, 129, 23);
		frmUsuario.getContentPane().add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(2);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español", "Inglés"}));
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox.setBounds(200, 197, 167, 22);
		frmUsuario.getContentPane().add(comboBox);
	}
}