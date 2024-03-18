package seveltes.comdis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/log")
public class logservlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("myemail");
		String password=req.getParameter("mypass");
		if(email.equalsIgnoreCase("gowthamyadava1@gmail.com")&&password.equals("123"))
		{
			RequestDispatcher rd=req.getRequestDispatcher("manip.html");
			rd.forward(req, res);
		}
		else
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			pw.print("INCORRECT PASSWORD.....!!!!");
			RequestDispatcher rd=req.getRequestDispatcher("log.html");
			rd.include(req, res);
		}
	}
  
}
