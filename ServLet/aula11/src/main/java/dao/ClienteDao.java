package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import beans.Cliente;
import utils.DbUtil;

public class ClienteDao {
	private Connection connection;
	
	public ClienteDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addCliente(Cliente cliente) {
		String sql = "INSERT INTO clientes (nome, endereco, telefone) VALUES (?,?,?)";
		
		try {
			PreparedStatement st = connection.prepareStatement(sql);
			st.setString(1, cliente.getNome());
			st.setString(2, cliente.getEndereco());
			st.setString(3, cliente.getFone());
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
	}
}
