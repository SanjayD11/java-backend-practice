package Practice;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;

public class JDBCPrepared {
	public static void main(String[] args) {
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver	");  //Driver loader
			String username, password;
			username = "root";
			password = "1234";
			int v = 0;
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", username, password);
			int regNo;
			String name;
			String dept;
			String query = "UPDATE students SET dept = ? WHERE regNo = ?";
			
			PreparedStatement ps = con.prepareStatement(query);
			
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < 3; i++) {
				
			System.out.println("Enter the Placeholder Values for "+i+"th row : ");
			System.out.println("Enter the regNo : ");
			
			regNo = sc.nextInt();
			sc.nextLine();
//			name = sc.nextLine();
			System.out.println("Enter the new Dept name : ");
			dept = sc.nextLine();
			
			ps.setInt(2, regNo);
//			ps.setString(2, name);
			ps.setString(1, dept);
			
			v = v + ps.executeUpdate();
			}
			ResultSet rs = ps.executeQuery("SELECT * FROM students");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2) +" "+rs.getString(3));
			}
			
			System.out.println(v + " rows affected");
			
		} catch (Exception e) {
			System.out.println(e);

		}
	}
}