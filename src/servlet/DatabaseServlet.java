package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;
import model.Student;

/**
 * Servlet implementation class DatabaseServlet
 */
@WebServlet("/DatabaseServlet")
public class DatabaseServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO studentDAO = new StudentDAO();
		ArrayList<Student> students = studentDAO.studentFromDatabse();
		
		request.setAttribute("s", students);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("dataBase.jsp");
		requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
