package clg;
import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/clg", "root", "1234");
        PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM student WHERE id=?");

            ps.setInt(1, 102);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getString("name"));
            } else {
                System.out.println("Not found");
            }

        con.close();
    }
}