package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import metodosDAO.ConectarBD;

import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.DropMode;
import javax.swing.border.LineBorder;

public class telaprodutos {

	JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaprodutos window = new telaprodutos();
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
	public telaprodutos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 742, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 726, 486);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		scrollPane.setBounds(24, 120, 629, 283);
		scrollPane.setEnabled(false);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setDropMode(DropMode.ON);
		table.setShowGrid(false);
		table.setBorder(null);
		table.setSelectionForeground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		table.setBackground(new Color(255, 255, 255));
		table.setSurrendersFocusOnKeystroke(true);
		table.setRowMargin(2);
		table.setForeground(new Color(0, 0, 0));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Microsoft Tai Le", Font.BOLD, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"pre\u00E7o", "nome"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(66);
		table.getColumnModel().getColumn(0).setMinWidth(8);
		
		JButton Mostrar = new JButton("Mostrar Produtos");
		Mostrar.setBounds(460, 425, 143, 29);
		Mostrar.setBorder(null);
		Mostrar.setForeground(new Color(255, 255, 255));
		Mostrar.setBackground(new Color(69, 69, 69));
		Mostrar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		Mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = ConectarBD.conectar();
					
					String sql = "select *from produto";
					
					PreparedStatement stmt = con.prepareStatement(sql);
					
					ResultSet rs = stmt.executeQuery();
					
					while(rs.next()) {
						String preço = String.valueOf(rs.getInt("preço"));
						String nome = rs.getString("nome");
						
						String tbData[] = {preço,nome};
							DefaultTableModel modelo = (DefaultTableModel)table.getModel();
							
							modelo.addRow(tbData);
					}

					
					rs.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		panel.add(Mostrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 25, 726, 29);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Produtos");
		lblNewLabel.setBounds(37, 0, 93, 29);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Abaixo estão o preço do produto junto com o nome do produto");
		lblNewLabel_1.setForeground(new Color(226, 226, 226));
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		lblNewLabel_1.setBounds(24, 84, 484, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Microsoft Tai Le", Font.BOLD, 11));
		btnNewButton.setBounds(330, 428, 102, 26);
		panel.add(btnNewButton);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
