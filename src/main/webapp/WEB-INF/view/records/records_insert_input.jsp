<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차 기록 등록(input)</title>

<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script type="text/javascript">

$(function() {
	$("#insert").submit(function() {
		
		if(!$("input[name='user_code']").val()) {
			alert("사용자 코드를 입력하세요.");
			$("input[name='user_code']").focus();
			return false;
		}
		
		var regexp_records_user_code = /^[0-9]{1,10}$/; 
		var records_user_code_check = $("input[name='user_code']").val()
		
		if(!regexp_records_user_code.test(records_user_code_check)) {
			alert("사용자 코드는 공백을 제외한 숫자 10자리까지 입력할 수 있습니다.");
			$("input[name='user_code']").focus();
			return false;
		}
	    
	    if(!$("input[name='user_car_num']").val()) {
			alert("차량 번호를 입력하세요.");
			$("input[name='user_car_num']").focus();
			return false;
		}
		
		var regexp_records_user_car_num = /^\d{2,3}[가-힣]\d{4}$/;
		var records_user_car_num_check = $("input[name='user_car_num']").val()
		
		if(!regexp_records_user_car_num.test(records_user_car_num_check)) {
			alert("차량번호가 유효하지 않습니다.\n작성 예시 : 123가4567");
			$("input[name='user_car_num']").focus();
			return false;
		}
		
	});
});

</script>

</head>
<body>

<h5>주차 기록 등록</h5>

<form action="./RecordsInsert.hw" method="post" name="records_insert" id="insert">
<fieldset>

<div>
<label for="parking_code">주차장 코드 : </label>
<input type="text" name="parking_code" id="parking_code" value="${param.parking_code}" readonly>
</div>

<div>
<label for="parking_name">주차장 이름 : </label>
<input type="text" name="parking_name" id="parking_name" value="${param.parking_name}" readonly>
</div>

<div>
<label for="user_code">사용자 코드 : </label>
<input type="text" name="user_code" id="user_code">
</div>

<div>
<label for="user_car_num">차량번호 : </label>
<input type="text" name="user_car_num" id="user_car_num">
</div>

<div>
입차 시간 : 등록시간으로 자동 입력됩니다.
</div>

<div>
<button type="submit"> 등록 </button>
<button type="reset"> 취소 </button>
</div>

</fieldset>
</form>

</body>
</html>