package clg;
public class LibraryBook {
    int bookId;
    String status;
    public LibraryBook() {
        status = "Available";
    }

    public void setBookDetails(int id) {
        bookId = id;
    }

    public void issueBook() {
        if (status.equals("Available")) {
            status = "Issued";
            System.out.println("Book Issued");
        } else {
            System.out.println("Book already issued");
        }
    }

    public void returnBook() {
        status = "Available";
        System.out.println("Book Returned");
    }

    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Status: " + status);
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook();
        b.setBookDetails(201);
        b.issueBook();
        b.display();
        b.returnBook();
        b.display();
    }
}
