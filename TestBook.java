public class TestBook
{
	public static void main (String [] args)
	{
		Author author=new Author("Kamal","kamal@gmail.com",'m');
		Book b2 = new Book (1245,"Pratheep",author,123,3000.45);
	
		System.out.println(b2);
	}
}