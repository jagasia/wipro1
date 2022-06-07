import java.util.Scanner;

public class StreetLight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int noOfLights=sc.nextInt();
		
		int coverage[][]=new int[noOfLights][2];
		for(int i=0;i<noOfLights;i++)
		{
			coverage[i][0]=sc.nextInt();
			coverage[i][1]=sc.nextInt();
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
		System.out.println("Output="+total);
	}

}
