<%@ page import="javax.servlet.http.Cookie"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset= ISO-8859-1">
<title>Pagina do Cookie</title>
</head>
<body>
	<%
		String nome = request.getParameter("nome");
	
		if(nome != null){
			Cookie cookie = new Cookie("nomeUsuario",nome);
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
		}
		
		Cookie[] cookies = request.getCookies();
		for(Cookie atual: cookies){
			if (atual.getName().equals("nomeUsuario")){
				nome = atual.getValue();
			}
		}
		out.print("Bem vindo " + nome+ "</br>");
	%>
	<img src = "img/Cookie.jpg">
	
	<%
		out.print("COKIE É BOM NINGUEM QUER DAR");
	%>
	
</body>
</html>