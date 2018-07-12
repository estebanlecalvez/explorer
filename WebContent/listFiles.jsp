<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Explorer - list of files</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


	<%@ include file="header.jsp"%>


	<c:out value="${files.size()} products in list" />
	<table>
		<tr>
			<td>Id</td>
			<td>Name</td>
			<td>Type</td>
			<td>URL</td>
			<td>Description</td>
			<td>Weight</td>
			<!--  <td>Category</td>-->
		</tr>
		<c:forEach items="${files}" var="f">
			<tr>
				<td><c:out value="${f.id}" /></td>
				<td><c:out value="${f.name}" /></td>
				<td><c:out value="${f.type}" /></td>
				<td><c:out value="${f.url}" /></td>
				<td><c:out value="${f.description}" /></td>
				<td><c:out value="${f.weight}" /></td>
				<td><a href="/Explorer/showFile?id=${f.id}">Show</a></td>
			</tr>
		</c:forEach>

	</table>
		<a href="/Explorer/auth/modifyFile" style="color: green">Modify</a>

	<%@ include file="footer.jsp"%>
</body>
</html>