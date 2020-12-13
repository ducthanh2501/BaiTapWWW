<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh Sach Dien Thoai</title>
</head>
<body>
	<header><jsp:include page="_header.jsp"></jsp:include></header>
	<nav>
		<jsp:include page="_menu.jsp"></jsp:include>
	</nav>

	<section>
		<c:forEach var="ncc" items="${dsncc}">
			<li>Ten Nha Cung Cap: ${ncc.tenNhaCC}</li>
			<div>
				<table>
					<tr>
						<td>MÃ ĐIỆN THOẠI</td>
						<td>TÊN ĐIỆN THOẠI</td>
						<td>NĂM SẢN XUẤT</td>
						<td>CẤU HÌNH</td>
					</tr>

					<c:forEach var="dt" items="${ncc.dsDienThoai}">
					<tr>
						<td>${dt.maDT}</td>
						<td>${dt.tenDienThoai}</td>
						<td>${dt.namSanXuat}</td>
						<td>${dt.cauHinh}</td>
					</tr>
					</c:forEach>
				</table>
			</div>
		</c:forEach>

	</section>


	<footer>
		<jsp:include page="_footer.jsp"></jsp:include>
	</footer>
</body>
</html>