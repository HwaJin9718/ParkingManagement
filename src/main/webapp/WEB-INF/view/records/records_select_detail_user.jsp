<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차기록 상세 조회(user)</title>
</head>
<body>

<h5>주차 상세 기록 조회</h5>

<div>
주차 기록 코드 : ${recordsDTO.records_code}
</div>

<div>
차량 번호 : ${recordsDTO.user_car_num}
</div>

<div>
주차장 이름 : ${recordsDTO.parking_name}
</div>

<div>
입차 시간 : ${recordsDTO.records_start}
</div>

<div>
출차 시간 : ${recordsDTO.records_end}
</div>

<div>
결제 요금 : ${recordsDTO.payment_total}원
</div>

<div>
<button onclick="location.href = './RecordsSelectUser.hw">목록</button>
</div>

</body>
</html>