package seveltes.comdis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fetch")
public class Fetchdataservlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		 String name = req.getParameter("myname");
		    int age = Integer.parseInt(req.getParameter("myage"));
		    String address = req.getParameter("myaddress");
		    String email = req.getParameter("myemail");
		    String password = req.getParameter("mypass");
		    
		    res.setContentType("text/html");
		    PrintWriter pw=res.getWriter();
		    //pw.print(name);pw.print(age);pw.print(address);pw.print(email);pw.print(password);

		    
			pw.print("<html><body>");
		    pw.print("<h1>"+"welcome...."+"</h1>"+"<br>"+name +"<br>"+"age is :"+age+"<br>"+"address is :"+address+"<br>"+"email is :"+email+"<br>"+"password is :"+password);
			pw.print("</body></html>");
		

		
	}

}
