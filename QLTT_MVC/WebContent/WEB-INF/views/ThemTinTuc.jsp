<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<jsp:include page="_header.jsp"></jsp:include>
	</header>

	<nav>
		<jsp:include page="_menu.jsp"></jsp:include>
	</nav>

	<section>
		<form action="themTinTuc" method="post">
			<table>
				<tr>
					<td>Tiêu Đề:</td>
					<td><input type="text" name="tieude" id="tieude"></td>
				</tr>

				<tr>
					<td>Nội Dung:</td>
					<td><input type="text" name="noidung" id="noidung"></td>
				</tr>

				<tr>
					<td>Liên Kết:</td>
					<td><input type="text" name="lienket" id="lienket"></td>
				</tr>

				<tr>
					<td>Ma DanhMuc:</td>
					<td><input type="text" name="madm" id="madm"></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" name="submid" value="thêm"></td>
					<td><input type="reset" name="reset" value="reset"></td>
				</tr>
			</table>
		</form>
		
		
		<div class="w3-container">
			<table class="w3-table w3-striped">
				<tr>
					<th>Mã DM</th>
					<th>Tên DM</th>
					<th>Người Quản Lý</th>
					<th>Ghi Chú</th>
				</tr>
				<c:forEach var="dm" items="${dsdm}">
					<tr>
						<td>${dm.maDM}</td>
						<td>${dm.tenDanhMuc}</td>
						<td>${dm.nguoiQuanLy}</td>
						<td>${dm.ghiChu}</td>
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