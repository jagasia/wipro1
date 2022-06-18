import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int budget=sc.nextInt();
		
		int arr[]=new int[3];
		
		//remove {}
		str=str.substring(1,str.length()-1);
		
		//split by ,
		
		String[] strArr = str.split(",");
		
		for(int i=0;i<3;i++)
		{
			arr[i]=Integer.parseInt(strArr[i]);
		}
		
		int totalCost=(int) ((arr[0]*.25)+(arr[1]*1)+(arr[2]*10));
		
		int flag=0;
		if(totalCost>budget)
		{
			flag=1;
			System.out.println("{"+flag+","+(totalCost-budget)+"}");
		}else
		{
			System.out.println("{"+flag+","+totalCost+"}");
		}
		
		
	
	}

}
