package com.wipro.abcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.wipro.abcd.model.Student;
import com.wipro.abcd.model.StudentDaoImpl;

public class App {
	public static void main(String[] args) throws ParseException {
//		String dob="20-Aug-1989";
//		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
//		Student student = new Student(3,"Kumar Sonu", sdf.parse(dob));
		
		StudentDaoImpl sdao=new StudentDaoImpl();
//		sdao.create(student);
//		sdao.update(student);
		sdao.delete(4);
		System.out.println("Check db");
	}
}
