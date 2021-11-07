package edu.ifce.aula1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Aula02_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Aula02_1() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.getSession() retornará uma sessão atual. se a sessão atual não existir, então criará uma nova .

		
		String nomeUsuario = request.getParameter("usuario");
		String senhaUsuario = request.getParameter("senha");

		if (nomeUsuario.equals("admin") && senhaUsuario.equals("123")){
			request.getSession().setAttribute("usuario", nomeUsuario);
			response.sendRedirect("email.jsp");	// vai fazer o direcionamento para a pagina pós login
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("formlogin.html"); //faz o dispacho das informações obtidas na pagina formlogin
			dispatcher.forward(request, response);			
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("formlogin.html");		
	}
}