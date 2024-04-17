<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차 기록 수정(input)</title>

<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script type="text/javascript">

$(function() {
	$("#update").submit(function() {
		
		if(!$("input[name='payment_total']").val()) {
			alert("총 결제 금액을 입력하세요.");
			$("input[name='payment_total']").focus();
			return false;
		}
		
		var regexp_records_payment_total = /^\d+(\,\d+)?$/;
		var records_payment_total_check = $("input[name='payment_total']").val()
		
		if(!regexp_records_payment_total.test(records_payment_total_check)) {
			alert("총 결제 금액이 유효하지 않습니다.\n숫자 및 ,(쉼표)로 구분하여 기재 (ex. 10,000 or 15,000 등)");
			$("input[name='payment_total']").focus();
			return false;
		}
		
		if(records_payment_total_check.length > 10) {
			alert("총 결제 금액은 최대 10자리까지 가능합니다.");
			$("input[name='payment_total']").focus();
			return false;
		}
		
	});
});

</script>

</head>
<body>

<h5>주차 기록 수정</h5>

<form action="./RecordsUpdateInput.hw" method="post" name="records_update" id="update">
<fieldset>

<div>
<label for="records_code">주차 기록 코드 번호 : </label>
<input type="text" name="records_code" id="records_code" value="${recordsDTO.records_code}" readonly>
</div>

<div>
<label for="parking_code">주차장 코드 : </label>
<input type="text" name="parking_code" id="parking_code" value="${recordsDTO.parking_code}" readonly>
</div>

<div>
<label for="parking_name">주차장 이름 : </label>
<input type="text" name="parking_name" id="parking_name" value="${recordsDTO.parking_name}" readonly>
</div>

<div>
<label for="user_code">사용자 코드 : </label>
<input type="text" name="user_code" id="user_code" value="${recordsDTO.user_code}" readonly>
</div>

<div>
<label for="user_car_num">차량번호 : </label>
<input type="text" name="user_car_num" id="user_car_num" value="${recordsDTO.user_car_num}" readonly>
</div>

<div>
<label for="records_start">입차시간 : </label>
<input type="text" name="records_start" id="records_start" value="${recordsDTO.records_start}" readonly>
</div>

<div>
출차 시간 : 수정시간으로 자동 입력됩니다.
</div>

<div>
<label for="payment_total">결제 금액 : </label>
<input type="text" name="payment_total" id="payment_total">원
</div>

<div>
<button type="submit"> 등록 </button>
<button type="reset"> 취소 </button>
</div>

</fieldset>
</form>

</body>
</html>