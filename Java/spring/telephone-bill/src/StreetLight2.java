import java.util.Scanner;

public class StreetLight2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfLights=sc.nextInt();
		String coordinates=sc.nextLine();
		if(coordinates.equals(""))
		{
			coordinates=sc.nextLine();
//			System.out.println("Obtainer input is "+coordinates);
		}
		
		String co2="";
		for(char c:coordinates.toCharArray())
		{
			if(c!='{' && c!='}')
			{
				co2+=c;
			}
		}
		
//		System.out.println(co2);
		
		int x=0;
		String arr[]=co2.split(",");
		
		int coverage[][]=new int[noOfLights][2];
		for(int i=0;i<noOfLights;i++)
		{
			coverage[i][0]=Integer.parseInt(arr[x++]);
			coverage[i][1]=Integer.parseInt(arr[x++]);
		}
		
		//start our logic
		//find the total by adding each light's coverage
		int total=0;
		for(int i=0;i<noOfLights;i++)
		{
			total+=coverage[i][1]-coverage[i][0];
			int diff=0;
			if(i<noOfLights-1)
			{
				diff=coverage[i][1]-coverage[i+1][0];
				if(diff>0)
				{
					total-=diff;
				}
			}
		}
		System.out.println(total);
	}

}
