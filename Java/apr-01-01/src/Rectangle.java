import java.util.Scanner;

public class Rectangle extends Shape
{

	public Rectangle() {}
	
	
public Rectangle(String name, String color) {
		super(name, color);
	}



	public void calculateArea()
	{
		System.out.println("l*b");
	}
	
//	public void draw()			draw() method in the super class is marked as "final". So a sub class cannot override this method
//	{
//		
//	}
}