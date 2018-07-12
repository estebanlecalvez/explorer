<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//Dp HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dp">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Explorer -showFile</title>
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<%@ include file="header.jsp"%>

	<div class="show">
		<div class="content">
			<p>
				<b>id: </b>${file.id}</p>
			<p>
				<b>name: </b>${file.name}</p>
			<p>
				<b>type : </b>${file.type}</p>
			<p>
				<b>URL : </b>${file.url }</p>
			<p>
				<b>description: </b>${file.description}</p>
			<p>
				<b>weight : </b>${file.weight}</p>
				<p><b>Category : </b>${file.category.name }</p>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>