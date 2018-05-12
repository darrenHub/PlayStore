
public abstract class Magazine extends Reading {
	private String titleMain; // Title of the main feature
	
	public Magazine(String id, String name, double price, String publisher, String genre, int numPages, String titleMain) {
		super(id, name, price, publisher, genre, numPages);
		this.titleMain = titleMain;
	}
	
	public Magazine(String id, String name, String publisher, String genre, int numPages, String titleMain) {
		super(id, name, publisher, genre, numPages);
		this.titleMain = titleMain;
	}
}