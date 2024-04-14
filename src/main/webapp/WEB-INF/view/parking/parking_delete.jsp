<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차장 정보 삭제 요청</title>

</head>
<body>

<h5>주차장 정보 삭제 요청</h5>

<div>
${param.parking_code}번의 주차장 정보를 삭제하시겠습니까?
</div>

<div>
<button onclick="location.href = './ParkingDeleteProcess.hj?parking_code=${param.parking_code}'">삭제</button>
<button onclick="location.href = './ParkingSelectAll.hj'">취소</button>
</div>

<!-- 
<script type="text/javascript">

alert("${param.parking_code}번의 주차장 정보를 삭제하시겠습니까?")

function deleteCheck () {
}

</script>
 -->
 
</body>
</html>