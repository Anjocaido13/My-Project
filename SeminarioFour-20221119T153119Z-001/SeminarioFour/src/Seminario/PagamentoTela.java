package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import metodosDAO.ConectarBD;

public class PagamentoTela {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagamentoTela window = new PagamentoTela();
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
	public PagamentoTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 389, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAGAMENTO");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 233, 123, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dinheiro");
		lblNewLabel_1.setBounds(22, 292, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cartão");
		lblNewLabel_2.setBounds(100, 292, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Bitcoin");
		lblNewLabel_3.setBounds(168, 292, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Boleto");
		lblNewLabel_4.setBounds(256, 292, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				try {
					
					
					Connection con = ConectarBD.conectar();
					String sql = "select *from Pagamento";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					String dinheiro = "dinheiro";
					

					
					stmt.execute("Insert into Pagamento(Forma_pagamento) values('"+dinheiro+"')");
					JOptionPane.showMessageDialog(null,"o produto foi adcionado no banco de dados :)");
					TelaCupom cup = new TelaCupom();
					cup.frame.setVisible(true);
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
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-money-bill-30.png"));
		btnNewButton.setBounds(10, 258, 58, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					Connection con = ConectarBD.conectar();
					String sql = "select *from Pagamento";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					String cartao = "cartao";
					

					
					stmt.execute("Insert into Pagamento(Forma_pagamento) values('"+cartao+"')");
					JOptionPane.showMessageDialog(null,"o produto foi adcionado no banco de dados :)");
					TelaCupom cup = new TelaCupom();
					cup.frame.setVisible(true);
					frame.dispose();
					
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-parte-traseira-de-cartão-de-banco-30.png"));
		btnNewButton_1.setBounds(83, 258, 63, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					Connection con = ConectarBD.conectar();
					String sql = "select *from Pagamento";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					String bitcoin = "bitcoin";
					

					
					stmt.execute("Insert into Pagamento(Forma_pagamento) values('"+bitcoin+"')");
					JOptionPane.showMessageDialog(null,"o produto foi adcionado no banco de dados :)");
					TelaCupom cup = new TelaCupom();
					cup.frame.setVisible(true);
					frame.dispose();
					
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-média-2-30.png"));
		btnNewButton_2.setBounds(156, 258, 58, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					Connection con = ConectarBD.conectar();
					String sql = "select *from Pagamento";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					String boleto = "boleto";
					

					
					stmt.execute("Insert into Pagamento(Forma_pagamento) values('"+boleto+"')");
					JOptionPane.showMessageDialog(null,"o produto foi adcionado no banco de dados :)");
					TelaCupom cup = new TelaCupom();
					cup.frame.setVisible(true);
					frame.dispose();					
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-boleto-bankario-30.png"));
		btnNewButton_3.setBounds(232, 258, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\Cash Payment-bro (1).png"));
		lblNewLabel_5.setBounds(39, 0, 313, 230);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
