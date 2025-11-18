import java.util.Scanner;
public class TestCircle{
	public static void main(String [] args)
	{
		Circle c1=new Circle();
		Circle c2=new Circle(12);
		Circle c3=new Circle(10,"blue");
		
		System.out.println("1St Circle "+ c1.getradius());
		System.out.println("2St Circle "+c2.getradius());
		System.out.println("3St Circle "+c3.getradius());
		
		System.out.println("1St Circle "+c1.getcolor());
		System.out.println("2St Circle "+c2.getcolor());
		System.out.println("3St Circle "+c3.getcolor());
		
		System.out.println(c2);
		
		c1.setradius(123);  // set the radius
		
		//1st set value ,then call the value diclaiar the value
		
		double x = c1.getradius(); // get the radius
		
		System.out.println("1St Circle "+ c1.getradius());
		//both are same
		System.out.println("1St Circle "+ x);
		
		//Scanner Class Use And Practice
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Your Radius Value :");
		double radius=sc.nextDouble();
				
		//set the scanner value
		c1.setradius(radius);
		System.out.println("1St Circle "+ c1.getradius());
		
		sc.nextLine(); // this problem sollution
		
		
		System.out.print("Enter Your Colour Value :");
		String colour=sc.nextLine();
		
		c1.setcolor(colour);
		
		System.out.println("1St Circle "+ c1.getcolor());
		
	}
}