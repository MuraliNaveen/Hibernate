package com.student.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.student.model.daoimpl.StudentDaoImpl ; 
import com.student.model.model.Student;

import javax.servlet.annotation.WebServlet;
/**
 * Servlet implementation class InsertController
 */
@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Student s =new Student(
				req.getParameter("fname"),
				
				req.getParameter("lname"),
				req.getParameter("email"),
					req.getParameter("mobile")
				
				
				
				);
		StudentDaoImpl  sdao=new StudentDaoImpl();
		int status=sdao.insertStudent(s);
		if(status!=0) {
		 resp.sendRedirect("Success.jsp");	
		}
		else {
			resp.sendRedirect("failure.jsp");	
		}
		
	}
}