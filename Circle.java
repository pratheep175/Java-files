import java.util.Scanner;
public class Circle
{
	//pravate variable Encab
	private double radius;
	private String color;
	
	//constu
	public final double DEFAULT_RADIUS =1.0;
	public final String DEFAULT_COLOR="RED";
	
	public Circle(){
		this.radius=DEFAULT_RADIUS;
		this.color=DEFAULT_COLOR;
	}
	public Circle(double radius){
		this.radius=radius;
		color=DEFAULT_COLOR;
	}
	public Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	
	//getter
	public double getradius(){
		return radius;
	}
	public String getcolor(){
		return color;
	}
	
	//setter
	public void setradius(double radius){
		this.radius=radius;
	}
	public void setcolor(String color){
		this.color=color;
	}
	
	public String toString(){
		return "This Circle radius is "+getradius()+" Colour is "+getcolor()+" Circle's area "+Math.PI*getradius()*getradius();
	}
	

}