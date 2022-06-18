import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App5 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(12, "Ram", "ECE", 12121212.2f));
		empList.add(new Employee(1, "Kumar", "ECE", 8989898.2f));
		empList.add(new Employee(152, "Abdul", "Mech", 7798797.2f));
		empList.add(new Employee(8, "Zaheer", "ECE", 8989898.2f));
		empList.add(new Employee(11, "Xavier", "Mech", 3434344.2f));
		empList.add(new Employee(10, "Babu", "Mech", 6868689689.2f));
		empList.add(new Employee(7, "Raja", "CSE", 2342424.2f));
		empList.add(new Employee(9, "Mohan", "ECE", 1234566.2f));
		empList.add(new Employee(5, "Kumaresh", "CSE", 9876.2f));
		empList.add(new Employee(18, "Jag", "ECE", 8765.2f));
		empList.add(new Employee(4, "Dinesh", "CSE", 89890.2f));
		empList.add(new Employee(2, "Rajesh", "ECE", 89898.2f));
		empList.add(new Employee(3, "Sakthi", "CSE", 866686.2f));
		
		List<String> result = empList.stream()
		.map((e)->e.getName().toUpperCase())
		.filter((n)->n.length()>5)
		.sorted()
		.collect(Collectors.toList());
		
		for(String n:result)
		{
			System.out.println(n);
		}
	}

}
