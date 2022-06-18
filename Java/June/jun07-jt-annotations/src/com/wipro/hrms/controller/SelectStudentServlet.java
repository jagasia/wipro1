package com.wipro.hrms.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.hrms.config.MyConfiguration;
import com.wipro.hrms.model.Student;
import com.wipro.hrms.model.StudentDaoImpl;

/**
 * Servlet implementation class SelectStudentServlet
 */
@WebServlet({ "/SelectStudentServlet", "/select" })
public class SelectStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		if(sid==null)
				return;
		Integer id=Integer.parseInt(sid);
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfiguration.class);
		StudentDaoImpl sdao = ctx.getBean(StudentDaoImpl.class);
		Student student = sdao.read(id);
		HttpSession session=request.getSession();
		session.setAttribute("student", student);
		response.sendRedirect("student.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
