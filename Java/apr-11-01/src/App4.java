import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyPredicate implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		return t<50;
	}
	
}

public class App4 {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(20,80,90,45,39,76,56,19,21);
		
//		Stream<Integer> s = marks.stream();
//		Stream<Integer> x = s.filter(new MyPredicate());
//		List<Integer> result = x.collect(Collectors.toList());
//		
		
		List<Integer> result = marks.stream()
		.filter((x)->x>20)
		.filter((x)->x<80)
		.sorted((x,y)->y-x)
		.collect(Collectors.toList());
		
		for(Integer m:result)
			System.out.println(m);

		
		
	}

}
