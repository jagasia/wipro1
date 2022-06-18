import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		input= input.replaceAll(" is ", " was ");
		System.out.println(input);
		
	}

}
