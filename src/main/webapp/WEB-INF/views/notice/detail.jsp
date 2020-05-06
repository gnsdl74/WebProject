<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
		<h1>공지사항</h1>
		<!-- NoticeController에서 전송된 criteria에서 이전의 페이지 번호를 연결 -->
		<form action="update" method="get">
			<input type="hidden" name="page" value="${criteria.page }" /> 
			<input type="hidden" name="perPage" value="${criteria.numsPerPage }" />
			<p>${noticeVO.noticeTitle }</p>
			<fmt:formatDate value="${noticeVO.noticeDate }" pattern="yyyy.MM.dd" var="regdate" />
			<p><span>등록일</span>&nbsp;${regdate }</p>
			<textarea rows="20" cols="100" readonly style="resize: none;">${noticeVO.noticeContent }</textarea>
		</form>
		<br>
		<a href="list?page=${criteria.page }"><input type="button" value="목록"></a>
	</div>
</body>
</html>