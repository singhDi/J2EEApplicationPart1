package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;
import model.Student;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		StudentDAO studentDAO = new StudentDAO();
		ArrayList<Student> students = studentDAO.studentList();
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("FirstServlet");
		requestDispatcher.include(request, response);
		
		out.println("<table>"
				+ "<tr>"
				+ "<th>ID</th>"
				+ "<th>Name</th>"
				+ "<th>Address</th>"
				+ "</tr>");
		
		for(Student student :students) {
			out.println("<tr> "
					+ "<td>"+student.getId()+"</td>"
					+ "<td>"+student.getName()+"</td>"
					+ "<td>"+student.getAddress()+"</td>"
					+ "</tr>"
					);
		
		}
		out.println("</table>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
