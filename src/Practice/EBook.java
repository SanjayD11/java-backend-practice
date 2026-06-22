package Practice;
public class EBook extends Book{
	double fileSize;
public EBook(int bid, String t, String aname,Double fSize) {
	super(bid, t, aname);
	this.fileSize = fSize;
}
public void displayBookDetails() {
	super.displayBookDetails();
	System.out.println("File Size in MB : "+fileSize);
}
}

