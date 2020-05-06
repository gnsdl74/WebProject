<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="resources/css/main.css">
<meta charset="UTF-8">
<link rel="shortcut icon" href="resources/img/tiger.jpg">
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
	<!-- // Header -->
	<div id="container" align="center">
		<!-- 박스오피스 -->
		<div id="boxoffice">
			<p id="boxoffice-text">여기는 Container1입니다.</p>
			<div id="boxoffice-movie">
				<ol>
					<li>1</li>
					<li>2</li>
					<li>3</li>
					<li>4</li>
					<li>5</li>
				</ol>
			</div>
		</div>
		<!--// 박스오피스 -->

		<!-- 영화 광고 -->
		<div id="movieAd">
			<div id="movieAdVedio">
				<iframe width="700" height="400"
					src="https://www.youtube.com/embed/LIQRnFoBCBg" frameborder="0"
					allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
					allowfullscreen></iframe>
				<img id="poster" alt="포스터" src="resources/img/tiger.jpg">
			</div>
		</div>
		<!-- // 영화 광고 -->
		
		<div id="notice">
			<div id="noticeConn" align="center">
				<p>여기는 공지사항 Div</p>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<footer id="footer">
		<div align="center">
			<p>여기는 Footer</p>
		</div>
	</footer>
	<!-- // Footer -->
</body>
</html>