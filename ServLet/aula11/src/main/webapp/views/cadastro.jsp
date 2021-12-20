<%@ page language="java" isELIgnored = "false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC Cadastro</title>
</head>
<style type="text/css">
	label {
	width: 80px;
	float: left;
}
</style>


<body>
<h1>Cadastro de Clientes</h1>
<form name="cadastro" action="ClienteController" method="post">
	<label>Nome:</label><input type="text" name="nome"><br><br>
	
	<label>Endereço:</label><input type="text" name="endereco"><br><br>
	
	<label>Telefone</label><input type="text" name="fone"><br>
	<input type="hidden" name="app" value="addCliente"><br>

	<label>&nbsp;</label><input type="submit" name="btCadastro" value="Cadastrar">	
</form>
</body>
</html>