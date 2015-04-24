import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PreparedStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = HSQLDBConnector.createConnection();
			String sql = "SELECT * FROm wetter WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 4);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				System.out.print(rs.getInt("id")+"\t");
				System.out.print(rs.getString("Stadt")+"\t");
				System.out.println(rs.getInt("temp"));
						
				
						
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
