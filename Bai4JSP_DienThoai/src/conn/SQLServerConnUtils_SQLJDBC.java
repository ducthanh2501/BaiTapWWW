package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_SQLJDBC {
	public static Connection getSQLServerConnection_SQLJDBC() throws ClassNotFoundException, SQLException{
		String hostName ="localhost";
		String database = "";
		String userName = "sa";
		String password ="sapassword";
		
		return getSQLServerConnection_SQLJDBC(hostName,database,userName,password);
		
	}
	private static Connection getSQLServerConnection_SQLJDBC(String hostName, String database, String userName,
			String password)//
			throws ClassNotFoundException, SQLException {

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" //
				+ ";databaseName=" + database;

		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}

}
