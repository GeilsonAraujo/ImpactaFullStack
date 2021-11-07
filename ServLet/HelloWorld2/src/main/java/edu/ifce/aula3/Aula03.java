package edu.ifce.aula3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Carro;
import utilitarios.UtilitariosBean;

public class Aula03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Aula03() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration parametros = request.getParameterNames(); //pegará todo nome de parametro de requisição passado para o servlet
		
		/*//segunda forma de recuperar parametros
		while (parametros.hasMoreElements()) {
			String parametro = (String) parametros.nextElement();//imprime o nome do parametro			
			String valor = request.getParameter(parametro); // imprime o valor do parametro
			
			System.out.println(parametro + ": " + valor);
		}
		*/
		//segunda forma de recuperar parametros
		
		/* while (parametros.hasMoreElements()) {
			String parametro = (String) parametros.nextElement();//imprime o nome do parametro			
			
			String[] valores = request.getParameterValues(parametro);
			
			for (int i = 0; i < valores.length; i++) {
				System.out.println(valores[i]);
			}
		
		} */
		
		// Terceira forma
		
		Carro c = new Carro();
		UtilitariosBean.populateBean(c, request);
		
		System.out.println(c.getMarca() + " " + c.getModelo() + " " + c.getAno());
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h2>" + c.getMarca() + " " + c.getModelo() + " " + c.getAno() + "</h2>");
		
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
