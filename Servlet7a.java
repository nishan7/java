import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet7a")
public class Servlet7a extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String str = request.getParameter("uname");
		String str1 = request.getParameter("pname");
		out.println("<html>");
		out.println("<body>");
		out.println("Username is :" + str + "<br/>");
		out.println("Password is :" + str1);
		out.println("</body>");
		out.println("</html>");
	}

}