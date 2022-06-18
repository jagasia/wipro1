package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wipro.hrms.model.Department;
import com.wipro.hrms.model.DepartmentDaoImpl;

/**
 * Servlet implementation class DepartmentServlet
 */
@WebServlet({ "/DepartmentServlet", "/ds" })
public class DepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id=Integer.parseInt(request.getParameter("id"));
		DepartmentDaoImpl ddao=new DepartmentDaoImpl();
		Department department = ddao.read(id);
		PrintWriter out = response.getWriter();
		Gson gs=new GsonBuilder()
				.excludeFieldsWithoutExposeAnnotation()
				.create();
		
		String json = gs.toJson(department);
//		EmployeeDaoImpl edao=new EmployeeDaoImpl();
//		Employee e = edao.read(50);
//		json=gs.toJson(e);
		out.print(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
