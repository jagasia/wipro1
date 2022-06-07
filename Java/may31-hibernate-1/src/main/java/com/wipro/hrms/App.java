package com.wipro.hrms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.wipro.hrms.model.Student;
import com.wipro.hrms.model.StudentDaoImpl;

public class App {

	public static void main(String[] args) throws ParseException {
		System.out.println("Hello world");
//		Student student = new Student(8, "Siva", new Date());
		StudentDaoImpl sdao=new StudentDaoImpl();
//		sdao.update(student);
		
		
		Date dt1=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		dt1=sdf.parse("2000-05-15");
		
//		List<Student> students = sdao.findByName("Siva");
		List<Student> students = sdao.findStudentsByDob(dt1);
		for(Student s:students)
		{
			System.out.println(s);
		}
		System.out.println("Check db");
		
	}

}
