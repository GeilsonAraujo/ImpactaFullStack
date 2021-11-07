package edu.ifce.aula1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Aula01_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Aula01_1() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Executado uma vez no inicio ");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Sempre que á uma nova requisição ");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1> O servidor esta rodando <h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
