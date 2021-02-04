import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 */

/**  @author ehv80  */
public class SimpleServlet extends HttpServlet {

	/**		*/
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		response.setContentType("text/html");
		String paramValue=request.getParameter("param");
		out=response.getWriter();
		out.println("<HTML><HEAD><TITLE>");
		out.println("Ejemplo</TITLE></HEAD>");
		out.println("<BODY>Hola Mundo!</BODY>");
		out.println("El valor del parámetro 'param' es: " + paramValue);
	}

	/**		*/
	public SimpleServlet() {
		super();
	}

}
