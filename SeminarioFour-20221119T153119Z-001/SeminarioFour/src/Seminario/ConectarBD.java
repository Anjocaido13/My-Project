package Seminario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConectarBD {
	
	public static Connection conectar() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/chadex","root","senha");
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
			// TODO: handle exception
		}


}
}