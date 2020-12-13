<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Tim Kiem</title>
</head>
<body>
	<section>
		<form action="timKiem" method="post">
			<table>
				<tr>
					<td>Nhap ngay can tim kiem</td>
					<td><input type="text" name="ngay"></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"></td>
					<td><input type="reset" value="reset"></td>
				</tr>

			</table>
		</form>
		<div>
			<table>
				<tr>
					<td>MaPhim</td>
					<td>TenPhim</td>
					<td>Mota</td>
					<td>Thoi Gian Phim</td>
					<td>URL</td>
					<td>ngay khoi chieu</td>
				</tr>
				<c:forEach var="phim" items="${phim}">
					<tr>

						<td>${phim.maPhim}</td>
						<td>${phim.tenPhim}</td>
						<td>${phim.moTa }</td>
						<td>${phim.thoiGianPhim }</td>
						<td><img alt="" src="${phim.url }" height="100px"
							width="150px"></td>
						<td>${phim.ngayKhoiChieu }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</section>
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
</body>
</html>