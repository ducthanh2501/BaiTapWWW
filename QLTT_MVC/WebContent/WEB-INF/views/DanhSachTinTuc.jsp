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
		<c:forEach var="dm" items="${dsdm}">
			<li>Tên DM: ${dm.tenDanhMuc }</li>
			<div>
				<table>
					<tr>
						<td>Tiêu Đề</td>
						<td>Nội Dung Tin Tức</td>
						<td>Liên kết</td>

					</tr>
					<c:forEach var="tt" items="${dm.dstintuc}">
					<tr>
						
						<td>${tt.tieuDe}</td>
						<td>${tt.noiDungTT}</td>
						<td>${tt.lienKet}</td>
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