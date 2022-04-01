import java.util.Scanner;

public class Shape {
	private String name;
	private String color;

	public Shape() {}

	public Shape(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//	calculateArea()					l*b
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:");
		name=sc.nextLine();
		System.out.println("Color");
		color=sc.nextLine();
	}
	
	public void displayDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
	}
}
