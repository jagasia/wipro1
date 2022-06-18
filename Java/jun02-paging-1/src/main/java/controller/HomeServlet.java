package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wipro.hrms.model.Branch;
import com.wipro.hrms.model.BranchDaoImpl;

/**
 * Servlet implementation class HomeServlet
 */
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pageNo=Integer.parseInt(request.getParameter("pageNo"));
		int startIndex=(pageNo-1)*5;
		PrintWriter out = response.getWriter();
//		out.print("Displaying results from index "+startIndex);
		
		BranchDaoImpl bdao=new BranchDaoImpl();
		List<Branch> branches = bdao.retrieveBranchesOfRange(startIndex, 5);
		HttpSession session = request.getSession();
		session.setAttribute("branches", branches);
		response.sendRedirect("branch.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
