import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Pattern p= Pattern.compile("[0-9]+");
		Matcher m = p.matcher(input);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}

}
