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
<title>Omikuji</title>
</head>
<body>
<div class="container">Send an Omikuji! </div>
<div class="container border color">
		<div class="row">
		<form action="/omikuji/process" method="POST">
			<div class="form-group">
				<label>Selecciona un número entre 5 y 25:</label>
				<input type="number" min="5" max="25" name="number" class="form-control" />
			</div>
			<div class="form-group">
				<label>Escribe tu ciudad:</label>
				<input type="text" name="city" class="form-control" />
			</div>
			<div class="form-group">
				<label>Escribe tu nombre:</label>
				<input type="text" name="name" class="form-control" />
			</div>
			<div class="form-group">
				<label>Escribe tu profesión o hobbie:</label>
				<input type="text" name="profesion" class="form-control" />
			</div>
			<div class="form-group">
				<label>Escribe tu animal favorito:</label>
				<input type="text" name="animal" class="form-control" />
			</div>
			<div class="form-group">
				<label>Escribe un mensaje a un amigo:</label>
				<textarea name="description" class="form-control" ></textarea>
			</div>
			<input type="submit" value="Enviar" class="btn btn-success" />
		</form>
		
		
			
		</div>
	</div>
</body>
</html>