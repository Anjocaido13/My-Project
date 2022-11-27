package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import metodosDAO.ConectarBD;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaCupom {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCupom window = new TelaCupom();
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
	public TelaCupom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 534, 335);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cupom Chadex");
		lblNewLabel.setBounds(28, 11, 269, 33);
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Compra feita com sucesso!");
		lblNewLabel_1.setBounds(10, 52, 170, 21);
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Parabens você conseguiu adquirir um novo item ao seu controle de estoque.");
		lblNewLabel_2.setBounds(10, 90, 431, 14);
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					
					Connection con = ConectarBD.conectar();
					String sql = "select *from cupom";
					PreparedStatement stmt = con.prepareStatement(sql);
					String cod = "40181700982";
					//Integer.parseInt(cod);

					
					stmt.execute("Insert into cupom(codigo_cupom) values('"+cod+"')");
					JOptionPane.showMessageDialog(null,"compra finalizada com sucesso");
					frame.dispose();
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\44019 (1).jpg"));
		btnNewButton.setBounds(142, 226, 175, 74);
		panel.add(btnNewButton);
	}
}
