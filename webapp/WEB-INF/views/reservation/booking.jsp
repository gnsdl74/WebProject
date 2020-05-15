<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/resources/css/booking.css">
<meta charset="UTF-8">
<link rel="shortcut icon" href="/resources/img/tiger.jpg">
<title>빠른예매</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
 <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
</head>
<body>
<!-- Header -->
	<header id="header">
	<!-- <jsp:include page="../header.jsp"></jsp:include>  -->	
	</header>
	<!-- // Header -->
	<!-- Body -->
	<body>
	<!-- frame(여백포함) div -->
	<div>
	
		<!-- 예매 > 빠른예매 div  -->
		<div>
			<p>예매 > 빠른예매</p>
		</div>
		<!-- // 예매 > 빠른예매 div  -->
	
		<!-- frame -->
		<div class="frame"  align="center">
			
			<!-- 빠른예매 div -->
			<div>
				<p>빠른예매</p>	
			</div>
			<!-- // 빠른예매 div -->
			
			<!-- frame-main -->
			<div class="frame-main">
				<!-- 날짜 선택 -->
				<div>
					<c:if test="true">
						<button class="date-prev-btn"><</button>
					</c:if>
	
					
			<span class="date-btn-list" ></span>
					
					
					<c:if test="true">
						<button class="date-next-btn">></button>
					</c:if>					
					<span><input type="hidden" name="date" id="datepicker" size="12" /></span>
					
					
				</div>
				<!-- // 날짜 선택 -->
				<!-- 영화,시간 -->
				<div class="frame-main-body" >
					<!-- 영화 목록 -->
					<div class="movie-frame" >
						<div class="frame-title">영화</div>
						<!-- 1 -->
						<div>
							<!-- 영화 선택 -->
							<div class="movie-area">
								<!-- 영화 list -->
									<div class="movie-list"  align="center">									
										<ul style="list-style-type: none; magin:0;">
										<!-- 영화 제목 출력 -->
											<c:forEach var="movieVO" items="${movieList }">
												<li><button id="movie-btn"  value="${movieVO.movieNo}"  onclick="getMovieNo(this)">
												<span>${movieVO.movieAge }</span>
												<span>${movieVO.movieTitle }</span>
												</button></li>
											</c:forEach>								
										</ul>
									 </div>
								<!--// 영화 list -->
							</div>
							<!--// 영화 선택 -->
							<!-- 영화 포스터 -->
							<div class="movie-poster">
								<div class="poster-area"><img class="poster"  alt="포스터 area" src="/resources/img/poster_area.png" ></div>
								<div class="poster-area"><img class="poster"  alt="포스터 area" src="/resources/img/poster_area.png" ></div>
							</div>
							<!--// 영화 포스터 -->
							</div>
							<!-- // 1 -->
					</div>
					<!-- // 영화 목록 -->
					<!-- 상영시간 선택 -->
					<div class="schedule-frame">
						<!-- 제목 -->
						<div class="frame-title">시간</div>
						<!-- 상영 시간 -->
						<div class= "schedule-hour"></div>
						<!-- 상영 목록 -->
						<div class="schedule-list">
						<ul style="list-style-type: none; magin:0;">
							<c:forEach var="scheduleDetailVO" items="${scheduleList }">						
								<li>
									<button id="schedule-btn">
										<span class="time">${scheduleDetailVO.scheduleTime }</span>
										<span class="title">${scheduleDetailVO.movieTitle }</span>
										<span class="theater">${scheduleDetailVO.theaterName }</span>
										<span class="seat">${scheduleDetailVO.seatCount }/${scheduleDetailVO.theaterSeat }</span>								
									</button>
								</li>
							</c:forEach>
						</ul>
						</div>
						<!-- // 상영 목록 -->
					</div>
					<!-- // 상영시간 선택 -->
				</div>
				<!-- // 영화,시간 -->
				
			</div>
			<!-- // frame-main -->
			
		</div>	
		<!-- // frame -->
		
	</div>
	<!-- // frame(여백포함) div -->	
	</body>
	<!-- // Body -->
	<!-- Footer -->
	<footer id="footer">
		<!--  <jsp:include page="../footer.jsp"></jsp:include> --> 		
	</footer>
	<!-- // Footer -->
	
	
	<!-- schedule 가져오기 -->
	<script type="text/javascript">
		var scheduleDate = "200516";
		var scheduleTime="08:00";
		var movieNo1 = 20183782;
		var movieNo2 = 20167904;
		
		$(document).ready(function(){
			
			// schedule 불러오기
			// getSchedule ();			
			function getSchedule () {
				var obj = {
						'scheduleDate' : scheduleDate,
						'scheduleTime' : scheduleTime,
						'movieNo1' : movieNo1,
						'movieNo2' : movieNo2						
				}; // end obj()
				var jsonObj = JSON.stringify(obj);
				var scheduleUrl = "/schedules/all/" + jsonObj;
				console.log( obj);
				console.log("jsonObj : " + jsonObj);
				console.log("scheduleUrl : " + scheduleUrl);
				// $.ajax로 schedule 불러오기
				$.getJSON(
						scheduleUrl,
						function(jsonData){
							console.log(jsonData);
						} // end callback()
						); // end gestJSON()					
	
				
				
				
			} // end getSchedule()		
			
			
			
		}); // end document
		
	</script>
		
	
	<!-- 영화 목록 -->	
	<script type="text/javascript">
	
	// movie-btn 클릭시 영화번호 받아오는 함수
	function getMovieNo(button) {
		console.log('movie-btn : '  + button.value);
		$(this).css('background-color','red');
		$(".poster").attr("src", "/resources/img/moviePoster/LalaLand.jpg");
		
	}; 
	
	$(function(){
	
	});
	</script>
		
	<!-- 날짜선택 -->
	<script type="text/javascript">	
		
			
			$(function(){
				var date = new Date(); // 오늘날짜 설정
				var dateBtnValue = null; // 날짜 클릭시 값을 입력받는 변수
				var firstDate = null; // 첫번째 버튼의 날짜						
				var lastDate = null; // 마지막 버튼의 날짜
				var btnMovie1 = 0;
				var btnMovie2 = 0;
				
				readDate(date);
				
				// 클릭한 버튼의 날짜를 가져오는 jquery
				$('#date-btn,#date-btn-sat,#date-btn-sun').click(function(){
					dateBtnValue = this.value;
					 	let yyyy = dateBtnValue.substr(12,4);
		                let mm = dateBtnValue.substr(5,3);
		                let dd = dateBtnValue.substr(9,2);
		               	var dateValue = yyyy + "-" + mm + "-" + dd;
		                console.log(dateBtnValue);		               
					var obj = {
							'dateValue' : dateValue,
							'movieNo1' : 2,
							'movieNo2' : 1
					};
					console.log('dateValue : '  + dateValue);
					// 해당 날짜의 영화 상영일정을 가져오는 ajax
					$.ajax({
						type : 'post',
						url : '/schedules',
						headers : {
				  	    	'Content-Type' : 'application/json',
				  	    	'X-HTTP-Method-Override' : 'POST' // RequestMethod.POST인 메소드로 전송
				  	      },
				  	      data : JSON.stringify(obj),
				  	   	 data : JSON.stringify(obj),
				  	      success : function(result) {
				  	    	  console.log(result);
				  	      }
					}); // end ajax()
					
				}); // end date-btn-click
				
				// datepicker 설정
				 $("#datepicker").datepicker({
				        showOn: "both",
				        buttonImage: "/resources/img/calender.png",
				        buttonImageOnly: false,
				        buttonText: "Select date",
				        minDate: 0	,
				        onSelect: function(dateText, inst) {			                
			                let yyyy = dateText.substr(6,4);
			                let mm = dateText.substr(0,2);
			                let dd = dateText.substr(3,2);
			                var datePicker = new Date(yyyy, mm-1, dd);
			                btnDate = datePicker;
			                console.log("btnDate : " + datePicker);
			                 readDate(datePicker);
					  } // 05/19/2020
				    });  // end datepicker
				
				// 선택할 설정에 맞는 날짜 버튼을 출력하는 함수
				function readDate(date){ 
				var list = ''; // 출력할 요소
				var week = ''; // 요일(한글)
				firstDate = date;	 // 버튼의 첫번째 날짜
				
				
				for(var i=0; i<14; i++){ 
					
					switch(date.getDay()){ // 요일(한글 입력)
					case 0:
						week = '일';
						 break;
					case 1:
						week = '월';
						 break;
					case 2:
						week = '화';
						 break;
					case 3:
						week = '수';
						 break;
					case 4:
						week = '목';
						 break;
					case 5:
						week = '금';
						 break;
					case 6:
						week = '토';
						 break;
					default:
						console.log('요일 error');
					} // end switch						
					/* if(i == 0){
						if(week=="일"){
							list += '<div>'+ date.getMonth()+'</div>' + '<button type="button" id="date-btn-sun" value=" ' +  
							date + ' "">' +"<div class='date-text'>" + date.getDate() + "."+ week + "<div>";  
							+'</button>' ;
						}else if(week=="토"){
							list += '<div>'+ date.getMonth()+'</div>' + '<button type="button" id="date-btn-sat" value=" ' +  
							date + ' "">' +"<div class='date-text'>" + date.getDate() + "."+ week + "<div>";  
							+'</button>' ;
						} else {
							list += '<div>'+ date.getMonth()+'</div>' + '<button type="button" id="date-btn" value=" ' +  
							date + ' "">' +"<div class='date-text'>" + date.getDate() + "."+ week + "<div>";  
							+'</button>' ;
						} // end if
					} else if(date.getDate() == 1) {
						
					} */ 
						if(week=="일"){
							list += '<button type="button" id="date-btn-sun" value=" ' +  
							date + ' "">' +"<div class='date-text'>" + date.getDate() + "."+ week + "<div>";  
							+'</button>' ;
						}else if(week=="토"){
							list += '<button type="button" id="date-btn-sat" value=" ' +  
							date + ' "">' +"<div class='date-text'>" + date.getDate() + "."+ week + "<div>";  
							+'</button>' ;
						} else {
							list += '<button type="button" id="date-btn" value=" ' +  
							date + ' "">' +"<div class='date-text'>" +  date.getDate() + "."+ week + "<div>";  
							+'</button>' ;
						} // end if
				
					// 버튼 출력
					
					
					
					if(i != 13){ // 반복문 마지막 순서에서 date 값을 첫번째 버튼의 날짜로 변경
					 date.setDate(date.getDate() +1);						
					}else {
					date.setDate(date.getDate() - 13);
					 console.log('첫번째 버튼날짜 : ' + firstDate);
						}	
					
					} // end for				
				$('.date-btn-list').html(list);	// 버튼 추가				
				} // end setDate()	
				
				
				$('.date-prev-btn').click(function(){
					var today = new Date();
					if(today >= date){ // 이전 날짜가 오늘 날짜보다 작으면 실행하지않음.
						console.log('오늘 날짜보다 작습니다.')
					}else {
						date.setDate(date.getDate() -1);
						console.log(date.getDate());
						readDate(date);			
					}								
				}); // end next-prev-click()
				
				$('.date-next-btn').click(function(){
					date.setDate(date.getDate() +1);
					console.log("첫번째 버튼 날짜 : " + date);
					readDate(date);				
					}); // end next-btn-click()	
				
							
				
			}); // end document
			
		
		
	</script>



<script type="text/javascript">
		$(function(){
			
			
		}); // end document
		
	</script>




	
</body>
</html>