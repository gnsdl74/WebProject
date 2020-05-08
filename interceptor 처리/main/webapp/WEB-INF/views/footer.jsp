<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/resources/css/loginPopup.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	<!-- Footer -->
	<footer id="footer">
		<div align="center">
			<p>여기는 Footer</p>
		</div>
	</footer>
	<!-- // Footer -->
	
	<div id="login-popup" class="popup-bx-wrap">
		<div class="popup-bx-inner">

			<div class="popup-table">
			
				<div class="popup-cell">
											
					<div class="popup-content">
						<div class="popup-title">
							<button class="popup-close" type="button"></button>
						</div>
						<form>
							<div class="popup-input">
								<input type="text" id="memberId" placeholder="아이디" required autofocus /> 
								<input type="password" id="memberPw" placeholder="비밀번호" required />
							</div>
							<div class="popup-label">
								<label for="idCheck"><input type="checkbox" id="idCheck" />&nbsp;아이디 저장</label>
							</div>
							<button class="btn-login">로그인</button>
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
	
	<script type="text/javascript">
		$(document).ready(function() {
			// 로그인버튼 클릭시 팝업창 활성화
			$('#login').click(function(e) {
				e.preventDefault();
				document.getElementById("login-popup").className = "popup-bx-wrap on";
			}); // end #login.click() 팝업창 활성화
			
			// X버튼 클릭시 팝업창 비활성화
			$('.popup-close').click(function() {
				document.getElementById("login-popup").className = "popup-bx-wrap";
			}); // end .popup-close.click() 팝업창 비활성화
			
			// 팝업창 로그인 버튼 클릭시 회원 확인
			$('.btn-login').click(function() {
				var memberId = $('#memberId').val();
				var memberPw = $('#memberPw').val();
				console.log(memberId);
				console.log(memberPw);
				
				$.ajax({
					type : "post",
					url : "/login",
					data : {
						"memberId" : memberId,
						"memberPw" : memberPw
					},
					async: false,
					success : function(result) {
						console.log(result);
						if(result == "success") {
							alert("로그인 성공");
						} else if(result == "fail") {
							alert("아이디 또는 비밀번호가 맞지않습니다.");
						}
					}
					
				}); // end ajax
			}); // end 로그인.click
			
		}); // end document
	</script>
</body>
</html>