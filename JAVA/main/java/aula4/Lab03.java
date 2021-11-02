package aula4;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Lab03
 */
public class Lab03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Lab03() {
        super();
        // TODO Auto-generated constructor stub
    }
    

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("formlogin2.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nomeUsuario = request.getParameter("usuario");
		String senhaUsuario = request.getParameter("senha");

		if (nomeUsuario.equals("admin") && senhaUsuario.equals("123")){
			request.getSession().setAttribute("usuario", nomeUsuario);
			response.sendRedirect("PagMail");	// vai fazer o direcionamento para a pagina pós login
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("formlogin2.html"); //faz o dispacho das informações obtidas na pagina formlogin
			dispatcher.forward(request, response);			
		}

	}

}
