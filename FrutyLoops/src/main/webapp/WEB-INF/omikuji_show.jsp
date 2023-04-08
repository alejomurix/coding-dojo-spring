<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/css/style.css" >
<title>Omikuji show</title>
</head>
<body>
<div><h3>Aqui esta tu omikuji!</h3></div>
	<div class="look">
		<p>En <c:out value="${ numero }" /> años viviras en <c:out value="${ ciudad }" />
		con <c:out value="${ nombre }" /> como compañero de cuarto, <c:out value="${ profesion }" />.
		La proxima vez que veas un <c:out value="${ animal }" /> tendras buena suerte.
		Tambien, <c:out value="${ descripcion }" />
		</p>
	</div>
	<div><a href="/omikuji" >Regresar</a></div>
</body>
</html>