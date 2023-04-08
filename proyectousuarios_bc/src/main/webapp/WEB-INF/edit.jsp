<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h1>Editar usuario</h1>
	<form:form action="/edit/${usuario.id} }" method="POST" modelAttribute="usuario" >
		<input type="hidden" name="_method" value="PUT"/> 
		<div class="form-group">
			<form:label path="firstName">Nombre:</form:label>
			<form:input path="firstName" class="form-control" />
			<form:errors path="firstName" class="text-danger"/>
		</div>
		<div class="form-group">
			<form:label path="lastName">Apellido:</form:label>
			<form:input path="lastName" class="form-control" />
			<form:errors path="lastName" class="text-danger"/>
		</div>
		
		<div class="form-group">
			<form:label path="mail">mail:</form:label>
			<form:input path="mail" class="form-control" />
			<form:errors path="mail" class="text-danger"/>
		</div>
		
		<div class="form-group">
			<form:label path="password">password:</form:label>
			<form:password path="password" class="form-control" />
			<form:errors path="password" class="text-danger"/>
		</div>
		
		<input type="submit" value="Guardar" class="btn btn-success" />
	</form:form>
</div>
</body>
</html>