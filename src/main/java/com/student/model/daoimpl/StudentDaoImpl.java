package com.student.model.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.student.model.dao.StudentDao;
import com.student.model.model.Student;

public class StudentDaoImpl  implements StudentDao {
	 String url = "jdbc:mysql://localhost:3306/may_june";  // Change database URL if needed
     String username = "root";  // Change username if needed
     String password = "8374@Naveen";  // Change password if needed
     
	final String INSERTSTUDENT="insert into employee"
			+ "(`firstName`,`lastName`,`Email`,`mobile`) "
			+ "values(?,?,?,?)";
	private Connection con;
	private PreparedStatement pstmt;
	private int status;
	
	
	public StudentDaoImpl() {
		
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
	
	}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public int insertStudent(Student student) {
		
		
		try {
		pstmt=con.prepareStatement(INSERTSTUDENT);
		pstmt.setString(1, student.getFirstName());
		pstmt.setString(2, student.getLName());
		pstmt.setString(3, student.getEmail());
		pstmt.setString(4, student.getMobile());
		 status=pstmt.executeUpdate();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return status;
	}

}
