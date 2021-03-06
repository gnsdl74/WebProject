<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
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
		<img alt="Error_404" src="/resources/img/icon_error.png">
		<h2>페이지를 찾을 수 없습니다.</h2>
		<br>
		<p>방문하시려는 웹 페이지의 주소가 잘못 입력되었거나 변경 또는 삭제되어 요청하신 페이지를 찾을 수 없습니다.</p>
		<p>입력하신 주소가 정확한지 다시 한 번 확인해 주시기 바랍니다.</p>
	</div>
	<br>
	<div align="center">
		<p>고객 센터 1544-9999</p>
		<a href="javascript:history.back(-1);" title="이전 페이지 이동">이전 페이지 이동</a>
		&nbsp;
		<a href="/main" title="Cannes 메인으로 이동">Cannes 메인으로 이동</a>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>