
public class AppStatic {
	static				//a static block executes only once and also very early. even before main method or even before any objects are created
	{
		System.out.println("This static block is executed first");
	}
	public static void main(String[] args) {
		System.out.println("The main method begins now");
//		Shape.paint();
//		
//		Circle c=new Circle();
//		c.drawCircle();
//		Circle.drawCircle();
//		
//		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		e1.setCompanyName("Wipro");
		System.out.println(e2.getCompanyName());
	}

}
