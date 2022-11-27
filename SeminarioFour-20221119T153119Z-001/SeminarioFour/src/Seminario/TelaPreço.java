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

public class TelaPreço {

	JFrame frame;
	private JTextField txtP;
	private JTextField txtPr;
	protected Object window;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPreço window = new TelaPreço();
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
	public TelaPreço() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 528);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 371, 489);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alterar Preço");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		lblNewLabel.setBounds(121, 189, 124, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Produto");
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_1.setBounds(55, 239, 92, 14);
		panel.add(lblNewLabel_1);
		
		txtP = new JTextField();
		txtP.setBorder(null);
		txtP.setBackground(new Color(235, 235, 235));
		txtP.setBounds(55, 274, 237, 30);
		panel.add(txtP);
		txtP.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Preço");
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_2.setBounds(55, 315, 46, 14);
		panel.add(lblNewLabel_2);
		
		txtPr = new JTextField();
		txtPr.setBackground(new Color(235, 235, 235));
		txtPr.setBorder(null);
		txtPr.setBounds(55, 340, 237, 30);
		panel.add(txtPr);
		txtPr.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(235, 235, 235));
		btnNewButton.setBounds(55, 421, 102, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					Connection con = ConectarBD.conectar();
					
					String pr = txtPr.getText();
					String p = txtP.getText();
					//Double.parseDouble(pr);

					
					String sql ="Update produto set preço ='"+pr+"' where nome='"+p+"';";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.execute();
					JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBackground(new Color(69, 69, 69));
		btnNewButton_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(192, 421, 120, 30);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Digite o nome do produto que deseja alterar e depois digite o novo preço.");
		lblNewLabel_3.setForeground(new Color(214, 214, 214));
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 10));
		lblNewLabel_3.setBounds(10, 214, 351, 14);
		panel.add(lblNewLabel_3);
	}

}
