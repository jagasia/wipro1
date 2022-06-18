
public class App2 {

	public static void main(String[] args) {
		String input="Malayalam";
		input=input.toLowerCase();
		StringBuilder sb=new StringBuilder();
		sb.append(input);
		sb.reverse();
		String rev=sb.toString();
		if(rev.equals(input))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
	}

}
