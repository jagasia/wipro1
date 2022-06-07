import java.util.Arrays;

public class App2 {

	public static void main(String[] args) {
		Employee []arr=new Employee[6];
		//arr[0] .. arr[4]			all are just declaration of ref var of Employee		we have to use new operator to create each array element
		arr[0]=new Employee(10, "John", 42345.3f);
		arr[1]=new Employee(8, "Suresh", 21345.3f);
		arr[2]=new Employee(12, "Kumar", 12314.3f);
		arr[3]=new Employee(5, "Abdul", 61345.3f);
		arr[4]=new Employee(9, "Raja", 17245.3f);
		arr[5]=new Employee(7, "Zaheer", 328383.f);
		
		Arrays.sort(arr, new EmployeeNameDescComparator()); 				//error in this line when i run 
		
		for(Employee e:arr)
		{
			System.out.println(e);
		}
	}

}
