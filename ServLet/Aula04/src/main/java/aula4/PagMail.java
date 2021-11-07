package aula4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PagMail
 */
public class PagMail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PagMail() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String user = (String) request.getSession().getAttribute("usuario"); //declara uma variável user do tipo String e a ela atribui o valor do parametro “usuário”salvo na sessão.
    	
    	System.out.println("\nPassou pelo Service, ainda nao entrou IF\n");
    	
		if (user == null){ //seja, verifica se o usuário foi corretamente autenticado.
    		
			System.out.println("\nEntrou no IF aqui sera redirecionado para pagina de formlogin2\n");
			
    		RequestDispatcher dispatcher=request.getRequestDispatcher("formlogin2.html");
    		dispatcher.forward(request, response);
    		
    	}else if(user != null) {
    		doPost(request, response);
    	}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("\nPassou pelo doGet do servilet PagMail\n");
		PrintWriter out = response.getWriter();
		out.print("<h1> paramestros Enviados via GET <h1/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("\nPassou pelo doPost do servilet PagMail\n");
		doGet(request, response);
	}

}
