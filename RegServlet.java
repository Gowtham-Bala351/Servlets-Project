package seveltes.comdis;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/rgstr")
public class RegServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  name=req.getParameter("myname");
		int age=Integer.parseInt(req.getParameter("myage"));
		String  address=req.getParameter("myaddress");
		String  email=req.getParameter("myemail");
		String  password=req.getParameter("mypass");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_db","root","root");
			PreparedStatement ps=con.prepareStatement("insert into us_data values(?,?,?,?,?)");
			ps.setString(1, name);
//			 ps.setString(1, name != null ? name : "");
//			    ps.setInt(2, age);
//		        ps.setString(3, address != null ? address : "");
//		        ps.setString(4, email != null ? email : "");
//		        ps.setString(5, password != null ? password : "");
			ps.setInt(2, age);
			ps.setString(3, address);
			ps.setString(4, email);
			ps.setString(5, password);
			ps.executeUpdate();
			System.out.println("Insertion done");
			RequestDispatcher rd=req.getRequestDispatcher("log.html");
			rd.forward(req, res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

		
		
		
		
	}




