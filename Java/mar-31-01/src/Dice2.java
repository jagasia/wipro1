import java.util.Scanner;

public class Dice2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value 1:");
		int input1=sc.nextInt();
		System.out.println("Enter Value 2:");
		int input2=sc.nextInt();
		if(input1<0 || input2<0 || input1>6 || input2>6)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int sum=input1+input2;
		int absDiff=Math.abs(8-sum);
		if(sum<8)
			System.out.println(absDiff);
		else
			System.out.println(absDiff*2);

	}

}
