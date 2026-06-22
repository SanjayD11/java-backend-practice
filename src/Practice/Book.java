package Practice;

import java.util.Scanner;
public class Book {
int bookId;
String title;
String author;
boolean isIssued;
Book(int bid, String t, String aname){
	this.bookId = bid;
	this.title = t;
	this.author = aname;
	this.isIssued = false;
}
int requestedId;
public void issueBook(){
if(!isIssued) {
	isIssued = true;
	System.out.println("Successfully issued : "+ title);
}
else {
	System.out.println("Book is already issued ! ");
	}
}
public void returnBook() {
	if(!isIssued) {
		System.out.println("Book was not issued ! ");
	}
	else {
		isIssued = false;
		System.out.println("Book is returned ! ");
	}
}
public void displayBookDetails(){
	System.out.println("Book ID : "+bookId+", Book Title : "+title+", Author name : "+author+", Available ? : "+(isIssued ? "Issued" : "Yes Available"));
}
}
