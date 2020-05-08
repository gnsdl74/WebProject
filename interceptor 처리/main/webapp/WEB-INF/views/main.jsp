<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<link rel="shortcut icon" href="/resources/img/tiger.jpg">
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<title>Best Theater, Cannes</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

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
	
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>