package com.wipro.abcd;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.wipro.abcd.model.Item;
import com.wipro.abcd.model.ItemDaoImpl;
import com.wipro.abcd.model.Student;
import com.wipro.abcd.model.StudentDaoImpl;

public class App {

	public static void main(String[] args) throws ParseException {
//		String dob="18-Aug-1991";
//		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
//		Student student = new Student("Abdul Rahman", sdf.parse(dob));
//		StudentDaoImpl sdao=new StudentDaoImpl();
//		sdao.create(student);
		
		ItemDaoImpl idao=new ItemDaoImpl();
		
		Item item=new Item(39, "Dinner", "Paratta", 20.0, null);
		
		idao.update(item);
		System.out.println("Check db");
		
	}

}
