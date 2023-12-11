package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransaccion {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/comercio";
		String user="root";
		String pwd="root";
		try(Connection c=DriverManager.getConnection(url, user, pwd)){
			c.setAutoCommit(false);
			String sql="delete from pedidos";
			Statement st=c.createStatement();
			st.execute(sql);
			//c.commit();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}

	}

}
