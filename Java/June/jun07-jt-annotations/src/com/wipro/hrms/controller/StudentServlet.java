package com.wipro.hrms.controller;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.hrms.config.MyConfiguration;
import com.wipro.hrms.model.Student;
import com.wipro.hrms.model.StudentDaoImpl;

/**
 * Servlet implementation class StudentServlet
 */
@MultipartConfig
@WebServlet({ "/StudentServlet", "/student" })
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		if(sid==null)
			return;

		Integer id=Integer.parseInt(sid);
		String btn = request.getParameter("btn");
		
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		StudentDaoImpl sdao = ctx.getBean(StudentDaoImpl.class);
		if(btn.equals("Delete"))
		{
			sdao.delete(id);
		}
		else
		{
			String name=request.getParameter("name");			
			String dob=request.getParameter("dateOfBirth");
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Date dateOfBirth=null;
			try {
				dateOfBirth=sdf.parse(dob);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Part part = request.getPart("picture");
			InputStream is = part.getInputStream();
			int len = is.available();
			byte []picture=new byte[len];
			is.read(picture);

			Student student=new Student(id, name, dateOfBirth, picture);
			
			
			 if(btn.equals("Update"))
			 {
				 Student temp=sdao.read(id);
				 if(name!=null)
					 temp.setName(name);
				 if(dateOfBirth!=null)
					 temp.setDateOfBirth(dateOfBirth);
				 if(len>0)
					 temp.setPicture(picture);
				 sdao.update(temp);
				 
			 }else if(btn.equals("Add"))
			 {
				 sdao.create(student);
			 }
		}

		response.sendRedirect("home");
		
		
		
	}

}
