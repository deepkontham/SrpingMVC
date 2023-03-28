  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome to spring</title>
<style>
#employees {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#employees td, #employees th {
	border: 1px solid #ddd; 
	padding: 8px;
}

#employees tr:nth-child(even) {
	background-color: #RRGGBB;
}

#employees tr:hover {
	background-color: #RRGGBB;
}

#employees th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<a href="./save">SaveStudent</a>

	<table id="employees">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>dob</th>
			<th>city</th>
			<th>Actions</th>
		</tr>
		<c:forEach var="vp" items="${map}">
			<tr>
				<td>${vp.id}</td>
				<td>${vp.name}</td>
				<td>${vp.dob}</td>
				<td>${vp.city}</td>
				<td><a href="./delete?id=${vp.id}">delete</a> 
				<a href="./up?id=${vp.id}">update</a></td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>