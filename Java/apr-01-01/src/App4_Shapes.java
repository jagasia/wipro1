import java.util.Scanner;

public class App4_Shapes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Triangle\r\n" + 
				"2: Rectangle\r\n" + 
				"3: Circle\r\n" + 
				"4: Exit\r\n" + 
				"");
		int choice=sc.nextInt();
		Shape s=null;						//reference variable of shape, can be used to create instances of any sub class of Shape. But the object is confined only to Shape
		switch(choice)
		{
		case 1:		//Triangle
			s=new Triangle();					//			Shape s=new Triangle();
			
//			s.calculateArea();
			break;
		case 2:		//Rectangle
			s=new Rectangle();
			
//			s.calculateArea();
			break;
		case 3:		//Circle
			s=new Circle();
			
//			s.calculateArea();
			break;
		default:
			System.exit(0);
			break;
		}
		s.acceptDetails();
		s.displayDetails();
		s.calculateArea();
	}

}
