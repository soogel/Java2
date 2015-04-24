import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


public class PersonDao {
	private Connection con;
	private Statement stmt;
	
	public PersonDao()throws SQLException, ClassNotFoundException{
		con = HSQLDBConnector.createConnection();
		stmt = con.createStatement();
	}
	public void savePerson(Person p) throws SQLException{
		
		
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
	public List<Person> readAllPerson() throws SQLException{
		List<Person> result = new LinkedList<>();
		String sql = "SELECT * FROM person";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			String vorname= rs.getString(2);
			String nachname= rs.getString(3);
			
			Person p = new Person();
			p.setVorname(vorname);
			p.setNachname(nachname);
			result.add(p);
		}
		return result;
	}

}
