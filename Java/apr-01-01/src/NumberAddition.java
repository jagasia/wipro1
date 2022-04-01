import java.util.Arrays;
import java.util.Scanner;

public class NumberAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int arr[]=new int[no];
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		int third=sc.nextInt();
		
		//now, the entire array is considered as a single integer
		//string + int 		=	string
		//rama+2			=	rama2
		String temp="";
		for(int i:arr) {
			temp+=i;
		}
		System.out.println(temp);
		//how can we convert a String into int????????
		int x=Integer.parseInt(temp);
		x+=third;
		//convert the x into string again
//		temp=x+"";				//if string is added to an int, it will be string
		temp=String.valueOf(x);			//int is converted into string
		int index=0;
		for(char c:temp.toCharArray()) {
			{
				int num=c-48;			//ascii value of that character is stored in num			char c='0';		int i=c;		//c is a character, but we store it in int		
				//char c='A';				when i store this character in an int				int x=c;				x=65
//				System.out.println(num);
				arr[index++]=num;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
//		System.out.println(no);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(third);
	}

}
