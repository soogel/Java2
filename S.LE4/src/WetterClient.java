import java.sql.SQLException;

public class WetterClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wetter w = new Wetter();
		w.setStadt("Freiburg");
		w.setTemp(2);
		
		
		try {
			WetterDAD wDAD = new WetterDAD();
			wDAD.writeWetter(w);
			wDAD.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
