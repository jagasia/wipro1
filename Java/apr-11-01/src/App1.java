import java.util.Scanner;

public class App1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
		int num=sc.nextInt();
		int den=sc.nextInt();
		float result=0.0f;
		
			result=num/den;
			System.out.println(result);
		}catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("This is finally block");
		}
		System.out.println("After catch");
	}

}
