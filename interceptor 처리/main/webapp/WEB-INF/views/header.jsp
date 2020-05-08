<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<!-- Header -->
	<header id="header">
		<div class="menubar" align="center">
			<div style="position: absolute; top: 15px; left: 10px;">
				<p>안녕하세요. Cannes Header입니다.</p>
			</div>
			<a href="/movie" title="영화">영화</a>&nbsp;
			<a class="logo" href="/" title="Cannes 메인으로 가기">Best Theater, Cannes(Logo)</a>&nbsp;
			<a href="/notice/list" title="공지사항">공지사항</a>&nbsp;
			<div style="position: absolute; top: 15px; right: 10px;">
				<c:if test="${empty memberId }">
					<a id="login" href="" title="로그인">로그인</a>&nbsp;
				</c:if>
				<c:if test="${not empty memberId }">
					<a id="logout" href="/logout" title="로그아웃">로그아웃</a>&nbsp;
				</c:if>
			<a href="/tos" title="회원가입">회원가입</a>
			</div>
		</div>
	</header>
	<!-- // Header -->

</body>
</html>