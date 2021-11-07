<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset= ISO-8859-1">
<title>Contador de visitas</title>
</head>
<body>
	<%
	
	Cookie[] cookies = request.getCookies();
	int cont = 0;
	
	for(Cookie atual: cookies){
		if (atual.getName().equals("contador")){
			cont++;
			out.print("Essa é a visita de numero: " +cont);
			
		}else{
			out.print("Bem vindo pela Primeira Vez");
			
			Cookie cookieCont = new Cookie("contador","um");
			cookieCont.setMaxAge(60*60);
			response.addCookie(cookieCont);
		}
	}
	%>

</body>
</html>