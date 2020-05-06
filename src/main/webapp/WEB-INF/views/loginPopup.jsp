<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
* {
	margin: 0;
	padding: 0;
	font-size: 14px;
	color: #666;
}

.clearfix {
	*zoom: 1;
}

.clearfix::after {
	content: "";
	display: block;
	clear: both;
}

.popup-bx-wrap {
	display: block;
	position: fixed;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	background: rgba(0, 0, 0, 0.5);
}
.popup-bx-wrap.on {display: block;}
.popup-bx-inner {
	position: absolute;
	width: 100%;
	height: 100%;
	left: 0;
	top: 0;
}

.popup-table {
	display: table;
	width: 100%;
	height: 100%;
}

.popup-cell {
	display: table-cell;
	width: 100%;
	height: 100%;
	vertical-align: middle;
	text-align: center;
}

.popup-content {
	display: inline-block;
	max-width: 1200px;
	margin: 0 auto;
	padding: 30px 20px;
	box-sizing: border-box;
	border: 1px solid #000;
	background: #fff;
}

.popup-content .popup-input input {
	display: block;
	border: 1px solid #ddd;
	width: 100%;
	height: 45px;
	padding: 0 5px;
	box-sizing: border-box;
	outline: none;
}

.popup-content .popup-input input:first-child {
	margin-bottom: 15px;
}

.popup-content .popup-input input:focus {
	border: 1px solid #000;
}

.popup-content .popup-label {
	text-align: left;
	margin-top: 10px;
}

.popup-content .popup-label label {
	display: inline-block;
	cursor: pointer;
}

.popup-content button {
	width: 400px;
	height: 35px;
	text-align: center;
	font-size: 15px;
	color: #fff;
	background: #333;
	border: 1px solid #333;
	margin-top: 30px;
	cursor: pointer;
}

.popup-link-group {
	margin-top: 20px;
}

.popup-link-group ul li {
	display: inline-block;
	vertical-align: middle;
}

.popup-link-group ul li::before {
	content: "";
	display: inline-block;
	width: 1px;
	height: 10px;
	background: #eee;
	vertical-align: middle;
	margin: 0 10px;
}

.popup-link-group ul li:first-child::before {
	display: none;
}
</style>

</head>
<body>

	<div class="popup-bx-wrap">
		<div class="popup-bx-inner">

			<div class="popup-table">
				<div class="popup-cell">


					<div class="popup-content">

						<form action="">
							<div class="popup-input">
								<input type="text" placeholder="아이디" /> <input type="password"
									placeholder="비밀번호" />
							</div>
							<div class="popup-label">
								<label for="idCheck"><input type="checkbox" id="idCheck" />
									아이디 저장</label>
							</div>
							<button>로그인</button>
							<div class="popup-link-group">
								<ul class="clearfix">
									<li><a href="">ID/PW 찾기</a></li>
									<li><a href="">회원가입</a></li>
									<li><a href="">비회원 예매확인</a></li>
								</ul>
							</div>
						</form>

					</div>


				</div>
			</div>

		</div>
	</div>

</body>
</html>