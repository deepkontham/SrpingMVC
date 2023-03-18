<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register Student</h1>
	<form action="./update" method="post" >
		<table>
			<tr  >
				<td>ID:</td>
				<td><input type="text" name="id" value="${stu.id}" readonly="readonly"></td>
			</tr>  
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="${stu.name}"></td>
			</tr>
			 
			<tr>
				<td>date:</td>
				<td><input type="text" name="dob" value="${stu.dob}"></td>
			</tr>
			
			<tr>
				<td>city:</td>
				<td><input type="text" name="city" value="${stu.city}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"></td>
			</tr>


		</table>
		</form>
</body>
</html>
