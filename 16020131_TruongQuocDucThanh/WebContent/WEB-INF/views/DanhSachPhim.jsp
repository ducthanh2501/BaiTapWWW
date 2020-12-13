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

	<section>
		<c:forEach var="tl" items="${dstl}">
			<li>Ten The Loai: ${tl.tenTheLoai }</li>
			<div>
				<table>
				<!-- <tr>
						<td>MaPhim |</td>
						<td>TenPhim |</td>
						<td>Mota |</td>
						<td>Thoi Gian Phim</td>
						<td>URL</td>
						<td>ngay khoi chieu</td>
					</tr> -->
					<tr>
						<c:forEach var="phim" items="${tl.dsfilm}">
					   <%-- <td>${phim.maPhim}</td> 
							<td>${phim.moTa }</td>
							<td>${phim.thoiGianPhim }</td> --%>
							
							<td>
							<img alt="" src="${phim.url }" width="100px" height="100px"> 
							</br>
							<p>${phim.tenPhim}</p> <%-- <td>${phim.ngayKhoiChieu }</td> --%>
							</td>
							
						</c:forEach>
					</tr>
				</table>
			</div>
		</c:forEach>
	</section>


	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>

</body>
</html>