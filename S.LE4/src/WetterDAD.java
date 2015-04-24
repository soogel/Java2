import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


public class WetterDAD {

	
		private Connection con;
		private Statement stmt;
		public WetterDAD()throws SQLException, ClassNotFoundException{
			con = HSQLDBConnector.createConnection();
		}
		
		public List<Wetter> readWetter() throws SQLException{
			List<Wetter> result = new LinkedList<>();
			String sql = "SELECT * FROM wetter";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String stadt=rs.getString(2);
				int temp = rs.getInt(3);
				
				Wetter w = new Wetter();
				w.setStadt(stadt);
				w.setTemp(temp);
				
				result.add(w);
			}
			return result;
		}
		
	public Wetter	getWetter(int id) throws SQLException{
			
		
		Wetter w = new Wetter();
		String sql = "Select * FROM wetter WHERE id= "+id;
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()) {
			String stadt= rs.getString(2);
			int temp = rs.getInt(3);
			w.setStadt(stadt);
			w.setTemp(temp);
		}
		
		
		return w;
		}
		
		public void writeWetter(Wetter w) throws SQLException{
			
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO wetter (stadt, temp) VALUES ('"+w.getStadt()+"',"+w.getTemp()+")";
//						 "INSERT INTO wetter (stadt, temp) VALUES ('Ravensburg', 10)";	
			System.out.println(sql);
			
			stmt.executeUpdate(sql);
			
			//alt
			//stmt.close();
		}
		public void close() throws SQLException{
			con.close();
			stmt.close();
		}
	}

