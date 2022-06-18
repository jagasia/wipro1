package tower;

import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int cityLength=sc.nextInt();
		int city[][]=new int[cityLength][cityLength];
		int noOfTowers=sc.nextInt();
		int tower[][]=new int[noOfTowers][2];
		for(int i=0;i<noOfTowers;i++)
		{
			tower[i][0]=sc.nextInt();
			tower[i][1]=sc.nextInt();
		}
		
//		System.out.println(Arrays.deepToString(city));
		
		//loop for each tower, and fix 1s in the city array
		
		for(int i=0;i<noOfTowers;i++)
		{
			int x=tower[i][0];
			int y=tower[i][1];
			
			city[x][y]=1;			//tower is here. So coverage is here.
			for(int j=-1;j<=1;j++)
			{
				for(int k=-1;k<=1;k++)
				{
					int x1=x+j;
					int y1=y+k;
					if(x1<cityLength && y1<cityLength && x1>=0 && y1>=0)
					{
						city[x+j][y+k]=1;
					}
				}
			}
		}
		
		int zeroCount=0;
		for(int i=0;i<cityLength;i++)
		{
			for(int j=0;j<cityLength;j++)
			{
//				System.out.print(city[i][j]+"\t");
				if(city[i][j]==0)
				{
					zeroCount++;
				}
			}
//			System.out.println();
		}
		
		if(zeroCount==0)
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
			System.out.println(zeroCount);
		}
		
		sc.close();
	}

}
