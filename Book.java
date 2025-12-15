public class Book
{
	private int bookNo;
	private String title;
	private String Author;
	private int noOfPages;
	private double price;
	
	public Book(int bookNo, String title, Author author, int noOfPages, double price)
	{
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.noOfPages = noOfPages;
		this.price = price;

	}
	
	public int getBookNo()
	{
		return bookNo;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getNoOfPages()
	{
		return noOfPages;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public String toString()
	{
		return ("Book is " + title + " it has " + author.toString() + " as the author" + " with " + noOfPages + " as pages.");
	}
}