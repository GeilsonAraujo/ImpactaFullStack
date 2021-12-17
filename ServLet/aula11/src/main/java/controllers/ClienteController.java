package controllers;

import java.beans.Beans;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cliente;
import dao.ClienteDao;
import utils.BeansUtilities;

public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClienteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String app = request.getParameter("app");
		System.out.println(app);
		
		if (app == null) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}else if (app.equalsIgnoreCase("cadastro")) {
			request.getRequestDispatcher("views/cadastro.jsp").forward(request, response);
			
		}else if (app.equalsIgnoreCase("addCliente")) {
			Cliente cliente = new Cliente();
			
			BeansUtilities.populateBean(cliente, request);
			
			ClienteDao clientedao = new ClienteDao();
			clientedao.addCliente(cliente);
			request.getRequestDispatcher("views/cadastro.jsp");
			 
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
