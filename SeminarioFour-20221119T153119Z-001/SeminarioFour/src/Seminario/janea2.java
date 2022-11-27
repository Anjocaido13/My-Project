package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janea2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel panel_1 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janea2 frame = new janea2();
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
	public janea2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1215, 606);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1199, 567);
		getContentPane().add(panel);
		panel.setLayout(null);
		panel_1.setBackground(new Color(69, 69, 69));
		panel_1.setBounds(0, 0, 293, 567);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ChadEX");
		lblNewLabel.setBounds(71, 37, 112, 29);
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("_____________________________________");
		lblNewLabel_1.setBounds(20, 77, 283, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(106, 106, 106));
		panel_2.setBounds(0, 154, 293, 60);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		
		JButton Produtos = new JButton("Produtos");
		Produtos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaprodutos tp = new telaprodutos();
				tp.frame.setVisible(true);


				

			}
		});
		Produtos.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		Produtos.setForeground(new Color(255, 255, 255));
		Produtos.setBorder(null);
		Produtos.setBackground(new Color(106, 106, 106));
		Produtos.setBounds(67, 0, 217, 60);
		panel_2.add(Produtos);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-product-30 (1).png"));
		lblNewLabel_2.setBounds(10, 6, 47, 49);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(100, 100, 100));
		panel_4.setBounds(0, 214, 293, 60);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton cadProdutos = new JButton("Cadastrar produtos");
		cadProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadProdutos cd1 = new TelaCadProdutos();
				cd1.frame.setVisible(true);
				
			}
		});
		cadProdutos.setBorder(null);
		cadProdutos.setBackground(new Color(100, 100, 100));
		cadProdutos.setForeground(new Color(255, 255, 255));
		cadProdutos.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		cadProdutos.setBounds(59, 0, 224, 60);
		panel_4.add(cadProdutos);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-productpessoa-30.png"));
		lblNewLabel_8.setBounds(3, 11, 74, 49);
		panel_4.add(lblNewLabel_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(69, 69, 69));
		panel_5.setBounds(0, 274, 293, 60);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton cadVendas = new JButton("Cadastrar vendas");
		cadVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadVendas cadvenda = new TelaCadVendas();
				cadvenda.frame.setVisible(true);
			}
		});
		cadVendas.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		cadVendas.setBorder(null);
		cadVendas.setBackground(new Color(69, 69, 69));
		cadVendas.setForeground(new Color(255, 255, 255));
		cadVendas.setBounds(64, 0, 219, 60);
		panel_5.add(cadVendas);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-vender-imóvel-20.png"));
		lblNewLabel_7.setBounds(10, 0, 56, 60);
		panel_5.add(lblNewLabel_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(69, 69, 69));
		panel_6.setBounds(0, 332, 293, 65);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JButton Alterar = new JButton("Alterar preço de produto");
		Alterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPreço tp = new TelaPreço();
				tp.frame.setVisible(true);
			}
		});
		Alterar.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		Alterar.setForeground(new Color(255, 255, 255));
		Alterar.setBorder(null);
		Alterar.setBackground(new Color(69, 69, 69));
		Alterar.setBounds(70, 0, 223, 65);
		panel_6.add(Alterar);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(10, 0, 59, 54);
		panel_6.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\icons8-envio-de-produto-20.png"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(160, 160, 160));
		panel_3.setBounds(293, 0, 906, 159);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Controle de Estoque ");
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(109, 27, 240, 26);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ChadEX sempre buscando trazer o melhor para voçê");
		lblNewLabel_4.setFont(new Font("Microsoft Tai Le", Font.BOLD, 18));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(87, 87, 591, 26);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\Supermarket workers-amico (1) (1).png"));
		lblNewLabel_5.setBounds(348, 156, 710, 424);
		panel.add(lblNewLabel_5);
	}
}
