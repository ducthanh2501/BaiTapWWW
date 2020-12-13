<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<base href="${pageConext.request.contextPath }/">
</head>
<body>
	<form:form method="post" action="save">

		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><form:input path="designation" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>

			</tr>
		</table>
	</form:form>
</body>
</html>