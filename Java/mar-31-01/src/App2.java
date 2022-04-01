import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a character:");
		char c=sc.next().charAt(0);
		switch(c)
		{
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not vowel");
		}
	}

}
