import java.sql.SQLException;


public class PersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setVorname("Daniel");
		p.setNachname("Duesentrieb");
		System.out.println("daten setzen done");
		
		
		try {
			PersonDao pDao = new PersonDao();
			pDao.savePerson(p);
			pDao.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
