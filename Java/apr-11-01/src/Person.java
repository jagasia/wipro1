
public interface Person {
	void speak();			//abstract method		//all versions of java
	static void listen()
	{
		System.out.println("A person listens");
	}	//java 8 onwards only
	
	default void walk()
	{
		System.out.println("Person walks");
	}
}
