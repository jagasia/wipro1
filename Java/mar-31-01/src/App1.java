import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks=sc.nextInt();
//		marks=0;					//this is a bad comment, because, we have striked out a code in java
		if(marks<0 ||	marks>100)	//checking for invalid marks
		{
			System.out.println("Invalid Marks");
		}else if(marks>=50)		//checking for pass mark
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}

}
