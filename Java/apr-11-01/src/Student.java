
public class Student implements Person {

	@Override
	public void speak() {
		// TODO Auto-generated method stub

	}
	public void listen()
	{
		System.out.println("Student listens");
	}
	
//	public void walk()
//	{
//		System.out.println("student walks");
//	}
	public static void main(String[] args) {
		Student rama=new Student();
//		rama.listen();
//		rama.walk();
//		Person.listen();
//		Person.walk();		//walk is a default method. you can only call with the help of implementing class
		rama.walk();
	}

}
