package com.wipro.hrms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.hrms.config.MyConfiguration;
import com.wipro.hrms.model.Student;
import com.wipro.hrms.model.StudentDaoImpl;

public class App {

	public static void main(String[] args) throws SQLException, ParseException, IOException {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		StudentDaoImpl sdao=(StudentDaoImpl) ctx.getBean("sdao");
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Date dob=sdf.parse("01-Jun-1947");
		
		//get bytes from the picture
		File f=new File("C:\\Users\\rjaga\\Pictures\\notavailable.png");
		int len=(int) f.length();
		FileInputStream fis=new FileInputStream(f);
		byte []picture=new byte[len];
		fis.read(picture);
		
		Student student=null;
//		student=new Student(10, "Amitab", dob, picture);
//		sdao.create(student);
//		sdao.update(student);
		student=sdao.read(3);
		student.setPicture(picture);
		sdao.update(student);
		
		
		System.out.println("Check db");
	}

}