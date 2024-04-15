<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차 기록 등록(input)</title>
</head>
<body>

<h5>주차 기록 등록</h5>

<form action="./RecordsInsert.hw" method="post">
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