package com.Jtc2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet (name= "login", urlPatterns = "/myregister.org")
public class LoginServlet extends HttpServlet {

public void init(ServletConfig sc) {


}

	public  void service (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {   
	//1.collect the data 	
		String un=req.getParameter("fname");
		String em=req.getParameter("email");
		
		String phone=req.getParameter("phone");
	      String time=req.getParameter("timings");
	      String gender=req.getParameter("gender");
	      String remarks=req.getParameter("remarks");
	      String myCourse[]=req.getParameterValues("mycourse");
	      System.out.println("*********\n");
	      System.out.println(un);
	      System.out.println(em);
	      System.out.println(phone);
	      System.out.println(gender);
	      for(String c: myCourse) {
	    	  System.out.println(c);  
	      }
	      //2.Response the Data
	      res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			out.print("<h3>Welcome to PCTI Noida</h3>");  
			out.println("<h4> Hello"+"\n"+un+ "\n"+ "Your Registration has been Completed </h4>");
			out.println("Thank You !!");
        }
	
	
	public void destroy() {
		
	}
}
