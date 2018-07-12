<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Explorer - List of categories</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


	<%@ include file="header.jsp" %>


	<c:out value="${categories.size()} products in list" />
	<table>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Description</td>
		</tr>
		<c:forEach items="${categories}" var="c">
			<tr class="list">
			<td><c:out value="${c.id}" /></td>
			<td><c:out value="${c.name}" /></td>
			<td><c:out value="${c.description }"/></td>
			<td><a href="/Explorer/showCategory?id=${c.id}">Show</a></td>
			<td><a href="/Explorer/auth/removeCategory?id=${c.id}" style="color:red">Delete</a></td>			
			</tr>
		</c:forEach>
		<a href="/Explorer/modifyFile">Update a file</a>
	</table>
	
	<%@ include file="footer.jsp" %>
</body>
</html>