<%@page import="fr.mds.explorer.entity.Category"%>
<%@ page
	language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/global.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Explorer - Add Category</title>
</head>
<body>
	<%@ include file="../header.jsp"%>

	<form action="addCategory" method="POST">
		<input type="text" name="name" placeholder="name" /> 
		<input type="text" name="description" placeholder="description" /> 
		<input type="submit"/>
	</form>

	<%@ include file="../footer.jsp"%>
</body>
</html>