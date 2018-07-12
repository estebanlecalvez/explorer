<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//Dp HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dp">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Explorer - showFile</title>
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<%@ include file="header.jsp"%>

	<div class="show">
		<div class="content">
			<p>
				<b>id: </b>${category.id}</p>
			<p>
				<b>name: </b>${category.name}</p>
			<p>
			<p>
				<b>Description: </b>${category.description}</p>
			<p>
			<p>
				<b>list of associated files:</b></p>
				
				
			<p>${category.files }</p>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>