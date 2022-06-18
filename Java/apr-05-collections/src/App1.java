import java.util.ArrayList;
import java.util.Iterator;

public class App1 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(50);		//50 is primitive. But expected is Integer not int. How it is allowed? Because, jdk 1.5 onwards, supports AUTO BOXING
							//CONVERTING PRIMITIVE INTO OBJECT IS BOXING
		marks.add(100);
		marks.add(44);
		marks.add(99);
		marks.add(83);
//		System.out.println(marks);
//		for(Integer x:marks)
//		{
//			if(x>90)
//				System.out.println(x);
//		}
		
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext())
		{
			Integer x = it.next();
			System.out.println(x);
		}
		
	}

}
