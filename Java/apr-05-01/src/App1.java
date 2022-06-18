import java.util.Arrays;

public class App1 {

	public static void main(String[] args) {
		Integer arr[]= {3, 10, 7, 88, 55, 33, 200, 22};
		//how can we sort this array?
		//java provides a method for sorting an array. That method is "sort()" which is present inside Arrays class
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
