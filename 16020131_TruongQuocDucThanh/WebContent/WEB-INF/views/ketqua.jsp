<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<section>
		
				<table class="w3-table w3-striped">
					<tr>
						<td>MaPhim </td>
						<td>TenPhim </td>
						<td>Mota </td>
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
							<td><img alt="" src="${phim.url }" height="100px" width="150px"></td>
							<td>${phim.ngayKhoiChieu }</td>
					</tr>
					</c:forEach>
				</table>
	
	</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>