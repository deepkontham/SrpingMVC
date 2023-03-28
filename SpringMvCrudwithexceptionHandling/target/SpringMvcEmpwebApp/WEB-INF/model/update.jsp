<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to student update page</h1>
<form action="./dt" method="post">
<table>
<tr>
<td>id</td>
<td><input type="text" name="id" value="${dp.id}" readonly="readonly"></td>
</tr>
<tr>
<td>name</td>
<td><input type="text" name="name" value="${dp.name}" ></td>
</tr>
<tr>
<td>dob</td>
<td><input type="date" name="dob" value="${dp.dob}"></td>

</tr>
<tr>
<td>city</td>
<td><input type="text" name="city" value="${dp.city}"></td>
<tr>
<td><input type="submit" value="update">


</table>


</form>


</body>
</html>