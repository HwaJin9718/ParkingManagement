<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차장 승인 처리</title>
</head>
<body>

<h5>주차장 승인 처리</h5>

<div>
${parkingDTO.parking_code}번의 주차장을 승인 하시겠습니까? 
</div>

<div>
<button onclick="location.href = './ParkingApproveProcess.hj?parking_code=${parkingDTO.parking_code}&parking_approval=AP'">승인</button>
<button onclick="location.href = './ParkingSelectAll.hj'">취소</button>
</div>

</body>
</html>