import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next().toLowerCase();
		boolean isPalindrome=true;
		for(int i=0, j=input.length()-1;i<input.length()/2;i++,j--)
		{
			if(input.charAt(i)!=input.charAt(j))
			{
				isPalindrome=false;
				break;
			}
		}
//		if(isPalindrome)
//		{
//			System.out.println(input+" is Palindrome");
//		}else
//		{
//			System.out.println(input+" is not a Palindrome");
//		}
		System.out.println(input+" is "+((isPalindrome)?"a Palindrome":"not a Palindrome"));
	}
}
