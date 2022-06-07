import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.hrms.model.Employee;

public class App {

	public static void main(String[] args) {
		//create an object representation of the bean.xml
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Employee employee=(Employee) ctx.getBean("emp");
		System.out.println(employee);
		System.out.println("Hello world");
	}

}
