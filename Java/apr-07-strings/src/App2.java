import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		String input1=input.toLowerCase();
		//how to create a string builder object
//		StringBuilder sb=new StringBuilder(input);
		StringBuilder sb=new StringBuilder();
		sb.append(input1);
		sb.reverse();
//		System.out.println(sb); 			//System.out.println automatically calls the toString() method of sb
//		String result=sb;					//is not ok
		String result=sb.toString();		//this is ok.
//		System.out.println(result);
		if(input1.equals(result))
			System.out.println(input+" is a Palindrome");
		else
			System.out.println(input+" is not a palindrome");
	}

}
