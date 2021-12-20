package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Cliente;
import dao.ClienteDao;
import utils.BeansUtilities;

public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClienteDao clientedao;
	String forward;
       
    public ClienteController() {
        super();
        clientedao = new ClienteDao();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String app = request.getParameter("app");
		System.out.println(app);
		
		if ((app == null) || (app.equalsIgnoreCase("listarCliente"))) {
			forward = "views/listar.jsp";
			request.setAttribute("clientes", clientedao.getAllClientes());
			
		}else if (app.equalsIgnoreCase("cadastro")) {
			forward = "views/cadastro.jsp";
			
		}else if(app.equalsIgnoreCase("excluir")){
			forward = "views/listar.jsp";
			int id = Integer.parseInt(request.getParameter("clienteId"));
			clientedao.deleteCliente(id);
			request.setAttribute("clientes", clientedao.getAllClientes());
		
		}else if(app.equalsIgnoreCase("update")){
			forward = "views/cadastro.jsp";
			int id = Integer.parseInt(request.getParameter("clienteId"));
			request.setAttribute("cliente", clientedao.getClienteById(id));
			System.out.println("ID do cliente para atualizar: " + id);
		}
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		view.forward(request, response);
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
