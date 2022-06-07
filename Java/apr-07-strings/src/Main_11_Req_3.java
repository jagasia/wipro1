import java.util.Scanner;

public class Main_11_Req_3 {

	static Boolean validateWebsite(String website)
	{		
		return website.matches("((http://)|(https://))(www.)?[A-Za-z]+[.][a-z]{2,6}([.][a-z]{2,6})?");
	}
	
	static Boolean validateMobile(String mobileNo)
	{
		return mobileNo.matches("([+]91)[0-9]{10}");
	}
	
	public static void main(String[] args) {
		System.out.println("1.Validate Website\r\n" + 
				"2.Validate Mobile number\r\n" + 
				"Enter your choice:\r\n" + 
				"");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		String input="";
		switch(choice)
		{
		case 1:		//website
			System.out.println("Enter the Website to be validated:");
			input=sc.next();
			if(validateWebsite(input))
			{
				System.out.println("Website is valid");
			}else
			{
				System.out.println("Website is invalid");
			}
			break;
		case 2:		//mobile
			System.out.println("Enter the Mobile no. to be validated:");
			input=sc.next();
			if(validateMobile(input))
			{
				System.out.println("Mobile number is valid");
			}else
			{
				System.out.println("Mobile number is invalid");
			}
			break;
		default:
			break;
		}
	}
	

}
