import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hsqldb.DatabaseManager;


public class HSQLDBConnector {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public Connection dbVerbinndung() {
		Connection con= null;
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			con = DriverManager.getConnection("jdbc:hsqldb:file:Y:\\DatenBank\\WI2014");
			
			//MetaDaten testen
			DatabaseMetaData dmd = con.getMetaData();
			System.out.println("DB Name: " +dmd.getDatabaseProductName());
			System.out.println("DB Version: "+ dmd.getDatabaseProductVersion());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}

}
