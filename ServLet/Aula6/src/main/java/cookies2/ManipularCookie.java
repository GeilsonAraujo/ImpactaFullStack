package cookies2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManipularCookie
 */
public class ManipularCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManipularCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Cria e envia o cookie para o navegador do cliente
		Cookie c = new Cookie("userId","00001");
		c.setMaxAge(60*60);//sempre em segundos
		response.addCookie(c); //adiciona o cookie no cliente
		
		String usuario = "Geilson Dos Santos Araujo";
		
		//Recupera os cookies do cliente.
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals("userId")) {
					PrintWriter out = response.getWriter();
					
					out.println("<html>");
					out.println("<body>");
					out.println("<h2> Bem vindo " + usuario + ", seu Id é: " + cookie.getValue() + " </h2>");
					out.println("</body>");
					out.println("</html>");
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
