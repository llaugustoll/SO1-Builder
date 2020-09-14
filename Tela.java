package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtFirst;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarro = new JLabel("carro 1");
		lblCarro.setBounds(25, 11, 46, 14);
		contentPane.add(lblCarro);
		
		JLabel lblCarro_1 = new JLabel("carro 2");
		lblCarro_1.setBounds(25, 42, 46, 14);
		contentPane.add(lblCarro_1);
		
		txtFirst = new JTextField();
		txtFirst.setText("first");
		txtFirst.setBounds(149, 144, 86, 20);
		contentPane.add(txtFirst);
		txtFirst.setColumns(10);
		
		textField = new JTextField();
		textField.setText("2\u00BA");
		textField.setBounds(149, 175, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(146, 90, 89, 23);
		contentPane.add(btnStart);
		
		JLabel label = new JLabel("1\u00BA");
		label.setBounds(76, 147, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2\u00BA");
		label_1.setBounds(76, 178, 46, 14);
		contentPane.add(label_1);
	}
}
