<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<meta charset="ISO-8859-1">
<title>Pagina de Exemplo</title>
</head>
<body>
	<p>Bem vindo a minha pagina de exemplo</p>
	
	<sql:setDataSource var="bd" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/tjw" user="root" password=""/>
	
	<sql:query dataSource="${bd}" sql="SELECT * FROM login_account"  var="result"></sql:query>
	
	

</body>
</html>