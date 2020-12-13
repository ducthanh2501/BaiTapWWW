package conn;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		return SQLServerConnUtils_SQLJDBC.getSQLServerConnection_SQLJDBC();
		
	}
	
	public static void closeQuitetly(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
