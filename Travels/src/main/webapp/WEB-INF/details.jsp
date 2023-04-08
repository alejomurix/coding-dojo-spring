<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detalles del viaje</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1> Detalles del viaje </h1>
		<a href="/">Volver</a>
		
		<table class="table table-hover">
			<tr>
				<td>Nombre</td>
				<td> <c:out value="${ viaje.name }" /> </td>
			</tr>
			<tr>
				<td>Descripción:</td>
				<td> <c:out value="${ viaje.description }" /> </td>
			</tr>
			<tr>
				<td>Vendedor</td>
				<td> <c:out value="${ viaje.vendor }" /> </td>
			</tr>
			<tr>
				<td>Costo:</td>
				<td> $<c:out value="${ viaje.amount }" /> </td>
			</tr>
		</table>
	</div>
</body>
</html>