import java.util.Arrays;
import java.util.Comparator;

public class App3 {

	public static void main(String[] args) {
		Integer arr[]= {22,78,42,91,27,30,15,51};
//		Arrays.sort(arr, new Comparator<Integer>() {
//			public int compare(Integer o1, Integer o2)
//			{
//				return o2-o1;
//			}
//		});
		
		Arrays.sort(arr, (i,j)->i-j);
		
		System.out.println(Arrays.toString(arr));
	}

}
