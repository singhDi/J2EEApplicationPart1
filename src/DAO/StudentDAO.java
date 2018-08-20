package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;

import jdbc.MyConnection;
import model.Student;

public class StudentDAO {

	public ArrayList<Student> studentList(){
		ArrayList<Student> list = new ArrayList<>();
		
		Student student = new Student(1,"dipisha","hyatesville","dp","password");
		list.add(student);
		
		student = new Student(2,"pratik", "cockeysville","pp","password");
		list.add(student);
		
	
		return list;
		
	}
	
	public ArrayList<Student> studentFromDatabse(){
		ArrayList<Student> list = new ArrayList<>();
		Connection connection = null;
		PreparedStatement pStatement = null;
		Resultset resultset = null;
		try {
			connection = MyConnection.getConnection();
			pStatement = connection.prepareStatement("select * from student");
			resultset = (Resultset) pStatement.executeQuery();
			
			
			while(((ResultSet) resultset).next()) {
			    Student student = new Student();	
				student.setId(((ResultSet) resultset).getInt(1));
				student.setName(((ResultSet) resultset).getString(2));
				student.setAddress(((ResultSet) resultset).getString(3));
				student.setUserName(((ResultSet) resultset).getString(4));
				student.setPassword(((ResultSet) resultset).getString(5));
				list.add(student);
			}
			
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
