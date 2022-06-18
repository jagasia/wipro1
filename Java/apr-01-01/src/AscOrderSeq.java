import java.util.Scanner;

public class AscOrderSeq {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int []arr=new int[no];
		for(int i=0;i<no;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxCount=0;
		int count=0;
		for(int index=0;index<no-1;index++)
		{
			if(arr[index]<arr[index+1])		//yes asc
			{
				count++;
				if(count>maxCount)
					maxCount=count;
			}else							//no. 				reset the count=0
			{
				count=0;
			}
		}
		if(maxCount>0)
			maxCount++;
		System.out.println(maxCount);
	}

}
