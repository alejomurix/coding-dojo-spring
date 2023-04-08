<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro e Inicio de Sesión</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Viajes</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Viaje</th>
					<th>Vendedor</th>
					<th>Costo</th>
					<th colspan="2">Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ expenses }" var="exp" >
					<tr>
						<td>
							<a href="/details/${ exp.id }"> ${ exp.name } </a>	
						</td>
						<td>${exp.vendor}</td>
						<td>${exp.amount}</td>
						<td>
							<a href="/edit/${ exp.id }">Editar</a>
						</td>
						<td>
							<form action="/delete/${ exp.id }" method="post" >
								<input type="hidden" name="_method" value="delete" />
								<input type="submit" value="Eliminar" class="btn btn-danger" />
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="container">
		<h2>Añadir viaje</h2>
			<form:form action="/add" method="post" modelAttribute="expense">
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
















