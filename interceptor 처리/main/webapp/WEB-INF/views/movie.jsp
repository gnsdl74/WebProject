<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="/resources/img/tiger.jpg">
<title>Best Theater, Cannes</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	
	<div align="center">
		<h1>이곳은 영화 메인 페이지입니다.</h1>
		<ol>
			<c:forEach var="movieList" items="${movieAll }">
				<li>${movieList.movieTitle }</li>
			</c:forEach>
		</ol>
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>