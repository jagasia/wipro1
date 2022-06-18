package com.wipro.abcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.wipro.abcd.model.Student;
import com.wipro.abcd.model.StudentDaoImpl;

public class App {

	public static void main(String[] args) throws ParseException {
		String dob="20-Aug-1979";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Student student = new Student(15,"Ramesh  Kanna", sdf.parse(dob));
		StudentDaoImpl sdao=new StudentDaoImpl();
		sdao.update(student);
		System.out.println("Check db");
		
	}

}
