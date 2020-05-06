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
	<!-- Header -->
	<header id="header">
		<div align="center">
			<p>안녕하세요. Cannes Header입니다.</p>
			<a href="/" title="Cannes 메인으로 가기">Home</a>&nbsp;
			<a href="/movie" title="영화">영화</a>&nbsp;
			<a href="/notice/list" title="공지사항">공지사항</a>
		</div>
	</header>
	<hr>
	<!-- // Header -->
	
	<div align="center">
		<h1>이곳은 영화 메인 페이지입니다.</h1>
		<ol>
			<c:forEach var="movieList" items="${movieAll }">
				<li>${movieList.movieTitle }</li>
			</c:forEach>
		</ol>
	</div>
</body>
</html>