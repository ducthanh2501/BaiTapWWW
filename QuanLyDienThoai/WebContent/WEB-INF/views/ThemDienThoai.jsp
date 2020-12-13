<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>them dien thoai</title>
</head>
<body>
	<header>
		<jsp:include page="_header.jsp"></jsp:include>


	</header>

	<nav>
		<jsp:include page="_menu.jsp"></jsp:include>
	</nav>
	<section>
		<form action="themdienThoai" method="post">
			<table>
				<tr>
					<td>Tên điện thoại:</td>
					<td><input type="text" name="tenDienThoai"></td>
				</tr>
				<tr>
					<td>Năm sản xuất</td>
					<td><input type="text" name="namSanXuat"></td>
				</tr>
				<tr>
					<td>Cấu hình</td>
					<td><input type="text" name="cauHinh"></td>
				</tr>
				<tr>
					<td>Mã nhà cung cấp</td>
					<td><input type="text" name="maNCC"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Submit"></td>

					<td><input type="reset" value="reset"></td>
				</tr>
			</table>
		</form>
		<div>
			<table>
				<tr>
					<td>Mã nhà cung cấp |</td>
					<td>Tên cung cấp |</td>
					<td>Địa chỉ |</td>
					<td>Số điện thoại |</td>
				</tr>

				<c:forEach var="ds" items="${dsncc}">
					<tr>
						<td>${ds.maNCC}</td>
						<td>${ds.tenNhaCC}</td>
						<td>${ds.diaChi}</td>
						<td>${ds.soDienThoai}</td>
					</tr>
				</c:forEach>
			</table>

		</div>


	</section>


	<footer>
		<jsp:include page="_footer.jsp"></jsp:include>
	</footer>
</body>
</html>