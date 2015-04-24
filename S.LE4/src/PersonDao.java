import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class PersonDao {
	private Connection con;
	private Statement stmt;
	
	public PersonDao()throws SQLException, ClassNotFoundException{
		con = HSQLDBConnector.createConnection();
	}
	public void savePerson(Person p) throws SQLException{
		
		Statement stmt = con.createStatement();
//		p.setVorname("Daniel");
//		p.setNachname("Düsentrieb");
		String sql = "INSERT INTO person (vorname, nachname) VALUES ('"+p.getVorname()+"', '"+p.getNachname()+"')";
//					 "INSERT INTO person (stadt, temp) VALUES ('Ravensburg', 10)";	
		System.out.println(sql);
		
		stmt.executeUpdate(sql);
		
		//überarbeitet 
		//stmt.close();
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public void close() throws SQLException{
		con.close();
		stmt.close();
	}

}
