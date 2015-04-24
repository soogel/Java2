import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class WetterDAD {

	
		private Connection con;
		public WetterDAD()throws SQLException, ClassNotFoundException{
			con = HSQLDBConnector.createConnection();
		}
		
		public void writeWetter(Wetter w) throws SQLException{
			
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO wetter (stadt, temp) VALUES ('"+w.getStadt()+"',"+w.getTemp()+")";
//						 "INSERT INTO wetter (stadt, temp) VALUES ('Ravensburg', 10)";	
			System.out.println(sql);
			
			stmt.executeUpdate(sql);
			stmt.close();
		}
		public void close() throws SQLException{
			con.close();
		}
	}

