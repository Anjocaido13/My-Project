package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import metodosDAO.ConectarBD;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaCadVendas {

	JFrame frame;
	private JTextField txtEmpresa;
	private JTextField txtProduto;
	private JTextField txtQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadVendas window = new TelaCadVendas();
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
	public TelaCadVendas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 929, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 913, 548);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastre o produto que deseja comprar!");
		lblNewLabel.setForeground(new Color(106, 106, 106));
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 10));
		lblNewLabel.setBounds(589, 187, 224, 47);
		panel.add(lblNewLabel);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setBounds(603, 270, 162, 30);
		panel.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(603, 331, 162, 30);
		panel.add(txtProduto);
		txtProduto.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(603, 390, 162, 30);
		panel.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Empresa");
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(599, 245, 125, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Produto");
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(602, 311, 97, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantidade");
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(602, 372, 97, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Proximo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					Connection con = ConectarBD.conectar();
					String sql = "select *from Detalhe_venda";
					PreparedStatement stmt = con.prepareStatement(sql);
					String emp = txtEmpresa.getText();
					String produt = txtProduto.getText();
					String quant = txtQuantidade.getText();
				
					
					Integer.parseInt(quant);

					
					stmt.execute("Insert into Detalhe_venda(nome_empresa,nome_produto,quantidade) values('"+emp+"','"+produt+"',"+quant+")");
					PagamentoTela pag = new PagamentoTela();
					pag.frame.setVisible(true);
					frame.dispose();
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(69, 69, 69));
		btnNewButton.setBounds(780, 485, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\Dropshipping model-pana (1).png"));
		lblNewLabel_4.setBounds(171, 135, 325, 377);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bem vindo ao cadastro de venda");
		lblNewLabel_5.setFont(new Font("Microsoft Tai Le", Font.BOLD, 19));
		lblNewLabel_5.setBounds(30, 45, 365, 30);
		panel.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton_1.setBounds(651, 485, 89, 23);
		panel.add(btnNewButton_1);
	}
}
