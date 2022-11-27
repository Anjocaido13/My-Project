package Seminario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.SwingConstants;

import metodosDAO.ConectarBD;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Button;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaDeLogin {

	private JFrame frame;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeLogin window = new TelaDeLogin();
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
	public TelaDeLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1215, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 604, 567);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Gabriel Angelo\\Downloads\\SeminarioFour-20221119T153119Z-001\\imagenslogos\\Post office-pana (1).png"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(754, 59, 174, 58);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 37));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		
		lblNewLabel_2 = new JLabel("Eae, vamo gastar?");
		lblNewLabel_2.setBounds(724, 128, 174, 28);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		lblNewLabel_2.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_2.setLabelFor(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Microsoft Tai Le", Font.BOLD, 21));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setToolTipText("");
		
		JLabel lblNewLabel_3 = new JLabel("Username");
		lblNewLabel_3.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(678, 186, 128, 42);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("________________________________________");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(688, 239, 320, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 25));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(688, 296, 128, 28);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("_______________________________________");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(691, 354, 368, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		

		
		Button button = new Button("Logar");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection con = ConectarBD.conectar();
					
					String sql = "select *from login where usuario=? and senha=?";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, textField.getText());
					stmt.setString(2, new String(passwordField.getPassword()));
					
					ResultSet rs = stmt.executeQuery();
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Seja bem vindo");
						janea2 j2 = new janea2();
						j2.setVisible(true);
						frame.dispose();
						
					}else {
						JOptionPane.showMessageDialog(null, "Tente novamente");
					}
					
					stmt.close();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		button.setForeground(new Color(166, 166, 166));
		button.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		button.setBackground(new Color(255, 255, 255));
		button.setBounds(710, 434, 188, 28);
		frame.getContentPane().add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(106, 106, 106));
		passwordField.setBounds(688, 335, 256, 28);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 11));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(106, 106, 106));
		textField.setBounds(688, 224, 240, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBounds(602, 0, 597, 567);
		frame.getContentPane().add(panel_1);
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel_1.setBackground(new Color(106, 106, 106));
	}
}
