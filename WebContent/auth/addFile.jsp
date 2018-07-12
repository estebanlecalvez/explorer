
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/global.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Explorer - add file</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<%@ include file="../header.jsp"%>

	<form action="addFile" method="POST">
		<div class="content">
			<div class="form">
				<input type="text" name="name" placeholder="name" /> <input
					type="text" name="type" placeholder="type" /> <input type="text"
					name="url" placeholder="url" /> <input type="text"
					name="description" placeholder="description" /> <input
					type="number" name="weight" placeholder="weight" /> 
					<select name="categoryId">
						<c:forEach items="${categories}" var="category">
							<option value="${category.id}">${category.name}</option>
						</c:forEach>
					</select>
					<input type="submit" />
			</div>
		</div>

	</form>

	<%@ include file="../footer.jsp"%>
</body>
</html>