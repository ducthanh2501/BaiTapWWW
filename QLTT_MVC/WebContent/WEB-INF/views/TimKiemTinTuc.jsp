<%@page import="vn.edu.iuh.webtt.entities.TinTuc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tim Kiếm Tin Tức</title>
</head>
<body>
	<header>
		<jsp:include page="_header.jsp"></jsp:include></header>
	<nav>
		<jsp:include page="_menu.jsp"></jsp:include>
	</nav>

	<section>
		<form action="timkiemTinTuc" method="post">
			<table>

				<tr>
					<td>Ma TT: </td>
					<td><input type="text" name="maTT" id="maTT"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="tim"></td>
				</tr>
			</table>
		</form>
	
		<div >
				<table >
					<tr>
						<th>Mã TT</th>
						<th>Tiêu Đề</th>
						<th>Nội Dung Tin Tức</th>
						<th>Liên Kết</th>
					</tr>
					<%TinTuc tt=(TinTuc)request.getAttribute("tt");%>
					<tr>
						<td>${tt.maTT}</td>
						<td>${tt.tieuDe}</td>
						<td>${tt.noiDungTT}</td>
						<td>${tt.lienKet}</td>
					</tr>
				</table>
			</div>
	</section>

	<footer>
		<jsp:include page="_footer.jsp"></jsp:include>
	</footer>
</body>
</html>