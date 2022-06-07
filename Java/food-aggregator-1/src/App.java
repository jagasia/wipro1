import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user 1 detail:");
		//the input string is a CSV		comma separated value. Parse that csv into an object
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		
		String[] arr1 = input1.split(",");			//split method of String gives an array of strings, after splitting by a delimiter. here, the delimiter is ,
		
		User user1=new User(arr1[0], arr1[1], arr1[2], arr1[3]);
		
		String[] arr2 = input2.split(",");
		
		User user2=new User(arr2[0], arr2[1], arr2[2], arr2[3]);
		
		System.out.println("User 1");
		System.out.println(user1);
		
		System.out.println();
		System.out.println("User 2");
		System.out.println(user2);
		
		if(user1.equals(user2))
		{
			System.out.println("User 1 is same as User 2");
		}else
		{
			System.out.println("User 1 and User 2 are different");
		}
	}

}
