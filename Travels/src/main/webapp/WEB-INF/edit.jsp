<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar viaje</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>Editar viaje</h2>
		<a href="/">Volver</a>
			<form:form action="/update" method="post" modelAttribute="viaje">
			<input type="hidden" name="_method" value="put">
				<form:hidden path="id" value="${ viaje.id }"/>
				
				<div class="form-group">
					<form:label path="name">Nombre:</form:label>
					<form:input path="name" class="form-control" />
					<form:errors path="name" class="text-danger" />
				</div>
				
				<div class="form-group">
					<form:label path="vendor">Vendedor:</form:label>
					<form:input path="vendor" class="form-control" />
					<form:errors path="vendor" class="text-danger" />
				</div>
				
				<div class="form-group">
					<form:label path="amount">Costo:</form:label>
					<form:input path="amount" class="form-control" />
					<form:errors path="amount" class="text-danger" />
				</div>
				
				<div class="form-group">
					<form:label path="description">Descripcion:</form:label>
					<form:input path="description" class="form-control" />
					<form:errors path="description" class="text-danger" />
				</div>
				<input type="submit" class="btn btn-info" value="Guardar" />
			</form:form>
	</div>
</body>
</html>










