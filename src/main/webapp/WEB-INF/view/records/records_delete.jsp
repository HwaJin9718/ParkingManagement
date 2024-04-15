<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차 기록 삭제 요청</title>
</head>
<body>

<h5>주차 기록 삭제 요청</h5>

<div>
${param.records_code}번의 주차 기록을 삭제하시겠습니까?
</div>

<div>
<button onclick="location.href = './RecordsDeleteProcess.hw?records_code=${param.records_code}&parking_code=${param.parking_code}&parking_name=${param.parking_name}'">삭제</button>
<button onclick="location.href = './RecordsSelectParking.hw?parking_code=${param.parking_code}&parking_name=${param.parking_name}'">취소</button>
</div>

</body>
</html>