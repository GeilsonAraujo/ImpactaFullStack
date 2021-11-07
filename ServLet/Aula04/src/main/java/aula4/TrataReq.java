package aula4;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TrataReq
 */
public class TrataReq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrataReq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration nomesCabecalho = request.getHeaderNames();
		
		System.out.println("\n Os campos disponiveis no cabeçalho são: \n");
		while (nomesCabecalho.hasMoreElements()) {
			String headerName = (String) nomesCabecalho.nextElement();
			System.out.println(headerName + " : " + request.getHeader(headerName));
		}
		
//		System.out.println("\n Esse é o valor no campo host: \n");
//		System.out.println(request.getHeader("host"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
