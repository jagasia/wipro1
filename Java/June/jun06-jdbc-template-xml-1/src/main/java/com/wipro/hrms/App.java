package com.wipro.hrms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wipro.hrms.dao.StudentDaoImpl;
import com.wipro.hrms.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
//    	DriverManagerDataSource dataSource=new DriverManagerDataSource();
//    	dataSource.setUrl("jdbc:mysql://localhost:3306/wipro3");
//    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//    	dataSource.setUsername("root");
//    	dataSource.setPassword("");
//    	
//        JdbcTemplate jt=new JdbcTemplate();
//        jt.setDataSource(dataSource);
//
//    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
//    	JdbcTemplate jt=(JdbcTemplate) ctx.getBean("jt");
//    	
//    	
//        int no = jt.update("INSERT INTO Branch VALUES(5,'Navi Mumbai','Mahape branch')");
//        System.out.println(no+" row(s) affected");
    	
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
    	StudentDaoImpl sdao=(StudentDaoImpl) ctx.getBean("sdao");
    	
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	String str="2000-06-24";
    	Date dob=sdf.parse(str);
    	
//    	int no=sdao.create(new Student(10, "Babu", dob));
//    	int no=sdao.update(new Student(10, "Sakthi Babu", dob));
//    	int no=sdao.delete(10);
//    	System.out.println(no);
    	
    	List<Student> students = sdao.read();
    	for(Student s:students)
    	{
    		System.out.println(s);
    	}
    	
    	
//    	Student student = sdao.read(6);
//    	System.out.println(student);
    }
}
