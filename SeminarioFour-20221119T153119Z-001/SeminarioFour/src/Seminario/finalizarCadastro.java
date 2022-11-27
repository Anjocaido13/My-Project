package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class finalizarCadastro {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalizarCadastro window = new finalizarCadastro();
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
	public finalizarCadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 337, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 321, 384);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operação finalizada com sucesso!");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 13));
		lblNewLabel.setBounds(45, 318, 234, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\Ok-pana (2).png"));
		lblNewLabel_2.setBounds(24, 0, 255, 271);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Congratulation!");
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 20));
		lblNewLabel_1.setBounds(80, 282, 171, 25);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Skip");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		btnNewButton.setBounds(109, 343, 89, 23);
		panel.add(btnNewButton);
	}
}
