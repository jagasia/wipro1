package com.wipro.hrms;

import java.io.Serializable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.hrms.model.BranchDao;
import com.wipro.hrms.model.Employee;
import com.wipro.hrms.model.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//    	BranchDao bdao=(BranchDao) ctx.getBean("bdao");
    	
//    	List<Branch> branches = bdao.read();
//    	for(Branch b:branches)
//    	{
//    		System.out.println(b);
//    	}
    	
//    	Branch branch=new Branch("3", "Main Branch", "Vizagapatnam");
//    	bdao.create(branch);
//    	bdao.update(branch);
//    	bdao.delete("2");
    	
    	EmployeeDao edao=(EmployeeDao) ctx.getBean("edao");
    	edao.delete(3);
//    	Employee e=new Employee(2,"Rajesh", "Kumar", 38383);
//    	Serializable id = edao.create(e);
//    	edao.create(e);
//    	System.out.println("Note down: "+id);
    	
        System.out.println( "Hello World!" );
    }
}
