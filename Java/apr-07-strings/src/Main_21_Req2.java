import java.util.Scanner;

public class Main_21_Req2 {

	static Boolean validateEmail(String email)
	{
		return email.matches("[a-z]{1}[a-z0-9._]+@[a-z]+[.][a-z]{2,6}");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the email to be validated:");
		String email=sc.nextLine();
		if(validateEmail(email))
		{
			System.out.println("Email is valid");
		}else
		{
			System.out.println("Email is invalid");
		}
	}

}
