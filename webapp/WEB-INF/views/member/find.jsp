<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="../common.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="/resources/css/main.css">
<link rel="shortcut icon" href="/resources/img/tiger.jpg">
<link rel="stylesheet" type="text/css" href="/resources/css/find.css">
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<div class="main">
		<p id="find-title">아이디/비밀번호 찾기</p>
		<!--디폴트 메뉴 : tab menu1-->
		<input id="find-id" type="radio" name="tabs" checked>
		<label for="find-id">아이디 찾기</label> 
		<input id="find-pw" type="radio" name="tabs">
		<label for="find-pw">비밀번호 찾기</label> 
		<section id="id-content">
			<div class="container">
				<p class="content-title">간편찾기</p>
				<div class="content">
					<table>
						<tr>
							<th>이름</th>
							<td><input id="id-name" type="text" placeholder="이름"></td>
						</tr>
						<tr>
							<th>생년월일</th>
							<td><input id="id-birth" type="text" placeholder="생년월일 앞8자리"></td>
						</tr>
						<tr>
							<th>이메일</th>
							<td><input id="id-email" type="text" placeholder="이메일"></td>
						</tr>
					</table>
				</div>
				<div class="info">
					<p>※ 아이디 찾기가 불가능한 경우에는 고객센터(☎1577-9999)로 문의바랍니다.</p>
				</div>
				<button id="btn-submit" type="button" disabled>아이디 찾기</button>
			</div>
		</section>

		<section id="pw-content">
			<div class="container">
			<p class="content-title">간편찾기</p>
			<div class="content">
					<table>
						<tr>
							<th>아이디</th>
							<td><input id="pw-id" type="text" placeholder="아이디"></td>
						</tr>
						<tr>
							<th>이름</th>
							<td><input id="pw-name" type="text" placeholder="이름"></td>
						</tr>
						<tr>
							<th>휴대폰 번호</th>
							<td>
							<input id="pw-phone" type="text" placeholder="'-'없이 입력">
							<button class="btn-auth" disabled>인증요청</button>
							</td>
						</tr>
						<tr>
							<th>인증번호</th>
							<td>
							<input id="PhoneCheck" type="text">
							<button class="btn-auth" disabled>인증확인</button>
							</td>
						</tr>
					</table>
				</div>
				<div class="info">
					<p>※ 비밀번호 찾기가 불가능한 경우에는 고객센터(☎1577-9999)로 문의바랍니다.</p>
				</div>
				<button id="btn-submit" type="button" disabled>비밀번호 찾기</button>
			</div>
		</section>

	</div>
	<jsp:include page="../footer.jsp"></jsp:include>
	
	<script type="text/javascript">
		
	</script>