package revisao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckCredentitials
 */
public class CheckCredentials extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dbPasswd;
	
    public String getDbPasswd() {
		return dbPasswd;
	}

	public void setDbPasswd(String dbPasswd) {
		this.dbPasswd = dbPasswd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CheckCredentials() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	public void init(ServletConfig config) throws ServletException{
		this.dbPasswd = config.getInitParameter("admin");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.jsp");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeUsuario = request.getParameter("nomeUsuario");
		String senhaUsuario = request.getParameter("senhaUsuario");

		if (nomeUsuario.equals("admin") && senhaUsuario.equals(this.dbPasswd)){
			request.getSession().setAttribute("usuario", nomeUsuario);
			response.sendRedirect("FormMail");	// vai fazer o direcionamento para a pagina pós login
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp"); //faz o dispacho das informações obtidas na pagina formlogin
			dispatcher.forward(request, response);			
		}
	}

}
