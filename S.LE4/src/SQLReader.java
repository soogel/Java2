import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			try {
				Connection con = HSQLDBConnector.createConnection();
				
				//Schritt 1: Statement  Objekt
				Statement stmt = con.createStatement();
				
				//Schritt 2: SQL Befehl festlegen
				String sql =" SELECT * FROM wetter";
				
				//Schritt §: Befehl ausführen & ResultSet in Variable festhalten
				ResultSet rs = stmt.executeQuery(sql);
				
				//Schritt 4: Durchlaufen der Ergebnismenge
				while(rs.next()) {
					int id =rs.getInt(1);
					String stadt = rs.getString("stadt");
					int temp = rs.getInt("temp");
					System.out.println("IS: "+id+" Stadt: "+stadt+" Tmperatur: "+temp);
					
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
		
	}

}
