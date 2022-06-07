import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AppCollege {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter college 1 detail:");
		String input1=sc.nextLine();
		System.out.println("Enter college 2 detail:");
		String input2=sc.nextLine();
		String[] arr1 = input1.split(",");
		College college1=new College();
		college1.setName(arr1[0]);
		college1.setWebsite(arr1[1]);
		college1.setMobile(arr1[2]);
		college1.setFounder(arr1[3]);
		college1.setNumberOfDept(Integer.parseInt(arr1[4]));
		college1.setLocation(arr1[5]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		college1.setStartingDate(sdf.parse(arr1[6]));
		
		String[] arr2 = input2.split(",");
		College college2=new College(arr2[0], arr2[1], arr2[2], arr2[3], Integer.parseInt(arr2[4]), arr2[5], sdf.parse(arr2[6]));
		
		System.out.println("College 1:");
		System.out.println(college1);
		System.out.println("College 2:");
		System.out.println(college2);
		if(college1.equals(college2))
			System.out.println("College 1 is same as College 2");
		else
			System.out.println("College 1 and College 2 are different");
	}

}
