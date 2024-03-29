<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>¡Bienvenid@ <c:out value="${name}" /> <c:out value="${email}" /> !</h1>
		<a href="/new" class="btn btn-success">Agregar usuario</a>
		<table class="table table-hover">
			<tr>
				<th>nombre</th>
				<th>apellido</th>
				<th>email</th>
				<th>Acciones</th>
			</tr>
			<c:forEach items="${ usuarios }" var="usuario">
				<tr>
					<td><c:out value="${ usuario.firstName }" /></td>
					<td><c:out value="${ usuario.lastName }" /></td>
					<td><c:out value="${ usuario.mail }" /></td>
					<td> 
						<a href="/edit/${ usuario.id }" class="btn btn-warning">Editar</a> 
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>