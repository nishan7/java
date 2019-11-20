import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet7b")
public class Servlet7b extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("f1");
		System.out.println(fname);
		File f = new File(fname);
		if (f.exists()) {
			out.println(f.getName());
			out.println("<hr size='2'style='color:green'>");
			out.println("Contents of the file is:<br>");
			out.println("<hr size='2' style='color:green'/><br>");
			BufferedReader in = new BufferedReader(new FileReader(f));
			String buf = "";
			while ((buf = in.readLine()) != null) {
				out.write(buf);
				out.flush();
				out.println("<br>");
			}
			in.close();
			out.println("<hr size='3' style='color:red'></font></p></body>\n</html>");
		} else {
			out.println("Filename:" + fname);
			out.println("<h1>File doesn't exist</h1>\n");
		}
	}
}