import java.util.Scanner;

public class Dice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int input1=sc.nextInt();
		System.out.println("Enter Value 2:");
		int input2=sc.nextInt();
		
		int sum=input1+input2;
		if(input1<0 || input1>6 || input2<0 || input2>6)
		{
			System.out.println("Invalid Input");
//			return;//		main method has a return statement means, program terminate
			System.exit(0);		//terminate the program from any method
		}
		if(input1==input2)
		{
			sum*=2;		//arithmetic assignment operator
		}
		System.out.println("The points scored is "+sum);
	}

}
