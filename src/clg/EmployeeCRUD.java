package clg;
import java.sql.*;
import java.util.Scanner;

class EmployeeCRUD {

    static Connection con;

    // 🔹 CREATE TABLE
    public static void createTable() {
        try {
            Statement stmt = con.createStatement();

            String query = "CREATE TABLE IF NOT EXISTS employee (" +
                           "id INT PRIMARY KEY, " +
                           "name VARCHAR(50), " +
                           "salary INT)";

            stmt.executeUpdate(query);
            System.out.println("Table Ready");

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // 🔹 INSERT
    public static void insertData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            int salary = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employee VALUES(?,?,?)"
            );

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, salary);

            ps.executeUpdate();
            System.out.println("Employee Inserted");

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // 🔹 UPDATE
    public static void updateData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter New Salary: ");
            int salary = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "UPDATE employee SET salary=? WHERE id=?"
            );

            ps.setInt(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Employee Updated");
            else
                System.out.println("Employee Not Found");

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // 🔹 DELETE
    public static void deleteData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM employee WHERE id=?"
            );

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if(rows > 0)
                System.out.println("Employee Deleted");
            else
                System.out.println("Employee Not Found");

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // 🔹 DISPLAY
    public static void displayData() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            System.out.println("\nID\tName\tSalary");

            while(rs.next()) {
                System.out.println(
                    rs.getInt(1) + "\t" +
                    rs.getString(2) + "\t" +
                    rs.getInt(3)
                );
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // 🔹 MAIN
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
            );

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Create Table");
                System.out.println("2. Insert");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Display");
                System.out.println("6. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();

                switch(choice) {
                    case 1: createTable(); break;
                    case 2: insertData(); break;
                    case 3: updateData(); break;
                    case 4: deleteData(); break;
                    case 5: displayData(); break;
                    case 6: System.out.println("Exiting..."); break;
                    default: System.out.println("Invalid choice");
                }

            } while(choice != 6);

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}