
public class App2 {

	public static void main(String[] args) {
		Employee raja = new Employee();
		Employee siva=new Employee(1, "Ram", "Kumar", 123456.0);
		
		//raja is also an object that does not have the values yet
		
		raja.setId(2);
		raja.setFirstName("Raja");
		raja.setLastName("Siva kumar");
		raja.setSalary(939393.9);
		
		System.out.println(raja);
		System.out.println(raja.toString()); 
	}

}
