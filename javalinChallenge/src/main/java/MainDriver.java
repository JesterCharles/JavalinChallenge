import java.sql.Connection;
import java.sql.SQLException;

import com.revature.controller.ChallengeEmployeesController;
import com.revature.util.ConnectionUtil;


public class MainDriver {
	public static void main(String[] args) {
		
		ChallengeEmployeesController cec = new ChallengeEmployeesController();
		
		// First test connection to our database is working
		try (Connection conn = ConnectionUtil.getConnection()){
			System.out.println("You did the connection thing. Good job, here's a cookie!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("OoOoOf. That Connection ain't happening, you done screwed up!");
		}
		
		// IMPLEMENT JAVALIN HERE
		
	}
}
