<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Film Them</title>
</head>
<body>
	<section>
		<form action="themFilm" method="post">
			<table>
				<tr>
					<td>ten phim:</td>
					<td><input type="text" name="tenphim"></td>
				</tr>
				<tr>
					<td>mo ta</td>
					<td><input type="text" name="mota"></td>
				</tr>
				<tr>
					<td>thoi gian phim</td>
					<td><input type="text" name="thoigianphim"></td>
				</tr>
				<tr>
					<td>url</td>
					<td><input type="text" name="url"></td>
				</tr>
				<tr>
					<td>ngay khoi chieu</td>
					<td><input type="text" name="ngaykhoichieu"></td>
				</tr>

				<tr>
					<td>The Loai</td>
					<td><select name="matheloai">
							<c:forEach var="tl" items="${dstl }">
								<option value="${tl.maTheLoai}">

									<c:out value="${tl.tenTheLoai}"></c:out></option>
							</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td><input type="submit" value="submit"></td>
					<td><input type="reset" value="reset"></td>
				</tr>
			</table>
		</form>



	</section>
	<footer>
		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
</body>
</html>