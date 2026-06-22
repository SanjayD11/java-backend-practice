package Practice;
import java.util.*;
public class Library {
ArrayList<Book> books;
ArrayList<Member> members;
public Library() {
	books = new ArrayList<>();
	members = new ArrayList<>();
}
public void addBook(Book book) {
	books.add(book);
}

public void registerMember(Member member) {
	members.add(member);
}
public void showAllBooks() {
	System.out.println("ALL BOOKS : ");
	for(Book b : books) {
		b.displayBookDetails();
	}
}
public void showAvailableBooks() {
	System.out.println("AVAILABLE BOOKS : ");
	for(Book b : books) {
		if(!b.isIssued) {
			b.displayBookDetails();
		}
	}
}
public static void main(String[] args) {
	Library l = new Library();
	Book b1 = new Book(1, "The Lord Of The Rings", "Tolkien");
	Book b2 = new Book(2, "Harry Potter", "Rowling");
	EBook b3 = new EBook(3, "Origin Of Species", "Darwin", 5.5);
	
	Member m1 = new Member(101, "Zoro");
	Member m2 = new Member(102, "Sanji");
	
	l.addBook(b1);
	l.addBook(b2);
	l.addBook(b3);
	
	l.registerMember(m1);
	l.registerMember(m2);
	
	Scanner sc = new Scanner(System.in);
	while(true) {
        System.out.println("\nEnter Choice No:");
        System.out.println("1. Borrow Book");
        System.out.println("2. Return Book");
        System.out.println("3. Show All Books");
        System.out.println("4. Show Available Books");
        System.out.println("5. Exit");

        int choice = sc.nextInt();

        switch(choice) {
            case 1: {
                System.out.print("Enter Member ID: ");
                int mid = sc.nextInt();
                System.out.print("Enter Book ID to borrow: ");
                int bid = sc.nextInt();

                Member borrower = null;
                if(mid == m1.memberId) {
                    borrower = m1;
                } else if(mid == m2.memberId) {
                    borrower = m2;
                } else {
                    System.out.println("Member not found!");
                }

                if(borrower != null) {
                    if(bid == b1.bookId) {
                        borrower.borrowBook(b1);
                    } else if(bid == b2.bookId) {
                        borrower.borrowBook(b2);
                    } else if(bid == b3.bookId) {
                        borrower.borrowBook(b3);
                    } else {
                        System.out.println("Book not found!");
                    }
                }
                break;
            }

            case 2: {
                System.out.print("Enter Member ID: ");
                int mid = sc.nextInt();
                System.out.print("Enter Book ID to return: ");
                int bid = sc.nextInt();

                Member returner = null;
                if(mid == m1.memberId) {
                    returner = m1;
                } else if(mid == m2.memberId) {
                    returner = m2;
                } else {
                    System.out.println("Member not found!");
                }

                if(returner != null) {
                    if(bid == b1.bookId) {
                        returner.returnBook(b1);
                    } else if(bid == b2.bookId) {
                        returner.returnBook(b2);
                    } else if(bid == b3.bookId) {
                        returner.returnBook(b3);
                    } else {
                        System.out.println("Book not found!");
                    }
                }
                break;
            }

            case 3: {
                l.showAllBooks();
                break;
            }

            case 4: {
                l.showAvailableBooks();
                break;
            }

            case 5: {
                System.out.println("Exiting...");
                sc.close();
                return;
            }

            default: {
                System.out.println("Invalid Choice!");
            }
        }
}
}
}
