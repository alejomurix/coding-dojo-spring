<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css" >
<title>Fruty Loops</title>
</head>
<body>
<div class="container">
	<h2>Tienda de frutas</h2>
	<table class="table table-bordered border border-primary border-4">
		<tr>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>

		<c:forEach items="${ fruits }" var="fruit">
			<tr>
				<td><c:out value="${ fruit.name }" /></td>
				<td><c:out value="${ fruit.price }" /></td>
			</tr>
		</c:forEach>

	</table>
</div>
</body>
</html>