<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee register</h1>
	<form:form action="./insert" method="post" modelAttribute="employee">
		<table>
			<tr>
				<td>id</td>
				<td><form:input path="id" /></td>
				<td><form:errors path="id" cssClass="errors" /></td>
			</tr>

			<tr>
				<td>name</td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="errors" /></td>
			</tr>
			<tr>
				<td>date</td>
				<td><form:input path="dob" placeholder="MM/dd/yyyy" /></td>
				<td><form:errors path="dob" cssClass="errors" /></td>
			</tr>
			<tr>
				<td>city</td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssClass="errors" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>


		</table>
	</form:form>

</body>
</html>