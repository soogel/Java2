import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class HSQLDBConnector {
	

	public static void main(String[] args) {
		
		try {
			Connection con = HSQLDBConnector.createConnection();
			
			//MetaDaten testen
			DatabaseMetaData dmd = con.getMetaData();
			System.out.println("=======================Connection Details======");
			System.out.println("DB Name: " +dmd.getDatabaseProductName());
			System.out.println("DB Version: "+ dmd.getDatabaseProductVersion());
			System.out.println("DB driver name: "+ dmd.getDriverName());
			System.out.println("DB Treiber Version: "+ dmd.getDriverVersion());
			System.out.println("================================================");
			
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection createConnection() {
		Connection con= null;
		try {
			//Connection aufbauen
			Class.forName("org.hsqldb.jdbcDriver");
			con = DriverManager.getConnection("jdbc:hsqldb:file:Y:\\DatenBank\\WI2014");
			
			
			
			//Statement erstellen?
			//Statement stm = con.createStatement();
			
			
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
