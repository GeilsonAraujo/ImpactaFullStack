<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset= ISO-8859-1">
<title>Pagina de Cadastro</title>
</head>
<body>

	<form action="Cookies.jsp">
	Nome: 
	<input type="text" name="nome" />
	<input type="submit" value="Enviar" />	
	</form>
	
	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie atual: cookies){
			if (atual.getName().equals("nomeUsuario")){
				response.sendRedirect("Cookies.jsp");
			}
		}
	%>

</body>
</html>