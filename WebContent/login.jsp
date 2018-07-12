<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Explorer - Login</title>
</head>
<body>

	<%@ include file="header.jsp" %>
	
	<form action="login" method="POST">
		<input type="text" name="username" placeholder="username" />
		<input type="submit"/>
	</form>
	
	<%@ include file="footer.jsp" %>
</body>
</html>