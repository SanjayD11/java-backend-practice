package clg;
import java.sql.*;
import java.util.Scanner;

class StudentJDBC {
    public static void main(String[] args) {
        try {
            // Load Driver
            Class.forName("org.sqlite.JDBC");

            // Establish Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clg", "root", "1234");

            // Create Table
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student (id INTEGER, name TEXT, marks INTEGER)");

            Scanner sc = new Scanner(System.in);

            // Get Input
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            // Insert Data
            PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, marks);
            ps.executeUpdate();

            System.out.println("\nData Inserted Successfully\n");

            // Retrieve Data
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("ID\tName\tMarks");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
            }

            // Close Connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}