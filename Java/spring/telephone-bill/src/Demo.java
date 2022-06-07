import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String str1="iint";
		String str2="it";
		System.out.println(str1.contains(str2));
		//to sort a string
		String str3="niit";
		char[] carr = str3.toCharArray();
		Arrays.sort(carr);
		str3=new String(carr);
		System.out.println(carr);
	}

}
