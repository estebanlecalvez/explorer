<%@page import="fr.mds.explorer.dao.FileDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/global.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class="header">
		<img class="logo" src="logoExplorer.png" />
		<ul>
			<li><a href="/Explorer/listFiles">List of files</a></li>
			<li><a href="/Explorer/listCategories">List of categories</a></li>

			<c:choose>
				<c:when test="${empty username}">
					<li><a href="/Explorer/login">Login</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="/Explorer/auth/addFile">Add a file</a></li>
					<li><a href="/Explorer/auth/addCategory">Add a category</a></li>
					<li><a href="/Explorer/logout">Logout</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</body>
</html>