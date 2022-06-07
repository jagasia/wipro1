package example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1, input2, input3;
		input1=sc.nextInt();
		input2=sc.nextInt();
		input3=sc.nextInt();
		
		String input4=sc.nextLine();
		if(input4.equals(""))
		{
			input4=sc.nextLine();
		}
		
		/*
		 * System.out.println(input1); System.out.println(input2);
		 * System.out.println(input3); System.out.println(input4);
		 
		 */
		
		System.out.println("Input4 is : "+input4);
		//remove the {}
		input4=input4.substring(1, input4.length()-1);
		System.out.println("Now input4 is " +input4);
		
		//split by ,
		String[] strArr = input4.split(",");
		int arr[]=new int[strArr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(strArr[i]);
		}
		
		System.out.println("Int arr is "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
