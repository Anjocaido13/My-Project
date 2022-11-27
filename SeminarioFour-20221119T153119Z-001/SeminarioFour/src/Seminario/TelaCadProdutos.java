package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import metodosDAO.ConectarBD;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaCadProdutos {

	JFrame frame;
	private JTextField txtNome;
	private JTextField txtPreÇo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadProdutos window = new TelaCadProdutos();
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
	public TelaCadProdutos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 797, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 781, 429);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setForeground(new Color(0, 0, 0));
		txtNome.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		txtNome.setBackground(new Color(238, 238, 238));
		txtNome.setBorder(null);
		txtNome.setBounds(492, 192, 237, 41);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtPreÇo = new JTextField();
		txtPreÇo.setForeground(new Color(0, 0, 0));
		txtPreÇo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		txtPreÇo.setBorder(null);
		txtPreÇo.setBackground(new Color(238, 238, 238));
		txtPreÇo.setBounds(492, 273, 237, 41);
		panel.add(txtPreÇo);
		txtPreÇo.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				try {
					
					
					Connection con = ConectarBD.conectar();
					String sql = "select *from produto";
					PreparedStatement stmt = con.prepareStatement(sql);
					String price = txtPreÇo.getText();
					String name = txtNome.getText();
					Double.parseDouble(price);

					
					stmt.execute("Insert into produto(preço,nome) values("+price+",'"+name+"')");
					JOptionPane.showMessageDialog(null,"produto inseridos no estoque <3");
					finalizarCadastro fin = new finalizarCadastro();
					fin.frame.setVisible(true);
					frame.dispose();
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(69, 69, 69));
		btnNewButton.setBounds(637, 339, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblNewLabel_1.setBounds(493, 167, 89, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Preço");
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblNewLabel_2.setBounds(492, 248, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Cadastrar produto");
		lblNewLabel.setBounds(492, 70, 203, 42);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Clique em cadastrar para poder cadastrar seu item");
		lblNewLabel_3.setForeground(new Color(192, 192, 192));
		lblNewLabel_3.setBounds(449, 391, 307, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Insira o nome do produto e o valor nos campos abaixo");
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setBounds(492, 126, 264, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\Online wishes list-bro (1).png"));
		lblNewLabel_5.setBounds(21, 11, 418, 394);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton_1.setBounds(522, 339, 89, 23);
		panel.add(btnNewButton_1);
	}
}
