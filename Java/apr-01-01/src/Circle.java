public class Circle extends Shape
{
//	calculateArea()					22/7*r*r
	public Circle() {
		
	}
	public Circle(String name, String color) {
		super(name, color);
	}
	


	public void calculateArea()
	{
		System.out.println("22/7*r*r");
	}
}