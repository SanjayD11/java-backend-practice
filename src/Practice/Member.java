package Practice;
import java.util.*;
public class Member {
int memberId;
String name;
ArrayList<Book> issuedBooks;
public Member(int mid, String n) {
	this.memberId = mid;
	this.name = n;
	this.issuedBooks = new ArrayList<>();
}
public void borrowBook(Book book) {
	if(!book.isIssued) {
		book.issueBook();
		issuedBooks.add(book);
	}
	else {
			System.out.println("Cannot borrow, Book is already issued ! ");
	}
}
public void returnBook(Book book) {
	if(issuedBooks.contains(book)) {
		book.returnBook();
		issuedBooks.remove(book);
	}
	else {
		System.out.println("The member did not borrowed the Book ! ");
	}
}
public void MemberDetails() {
	System.out.println("Member ID : "+memberId+", Member Name : "+name);
	System.out.println("Issued Books : ");
	for(Book b : issuedBooks) {
		System.out.println(b.title);
	}
}
}
