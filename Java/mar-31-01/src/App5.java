
public class App5 {

	public static void main(String[] args) {
		int arr[][]= {
				{100, 200, 300, 400},
				{10,20,30},
				{1,2},
				{55, 66, 77, 88, 99, 101}
		};
			//this is an example for jagged array
		//how can we loop this array??? so that i can display all elements?
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.printf("arr[%d][%d]=%d\t",i,j, arr[i][j]);
			}
			System.out.println();
		}
	}

}
