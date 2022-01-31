package validationpack;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{

			String uname = request.getParameter("uname");

			String password = request.getParameter("password");
			
			RequestDispatcher rd = null;
			if(uname.equalsIgnoreCase("pavanjr") && password.equals("3354"))
			{
				rd=request.getRequestDispatcher("Dashboardpage");
				rd.forward(request, response);
			}
			else
			{
				rd= request.getRequestDispatcher("Errorpage");
				
				rd.forward(request, response);
				
				}
		}		
}