<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차장 전체 조회</title>
</head>
<body>

<h5>주차장 목록</h5>

<table>

<thead>
<tr>
<th>코드 번호</th>
<th>이름</th>
<th>승인상태</th>
</tr>
</thead>

<tbody>

<c:forEach var="arrayList" items="${arrayList}">
<tr>
<td><a href="./ParkingSelectDetail.hj?parking_code=${arrayList.parking_code}">${arrayList.parking_code}</a></td>
<td><a href="./ParkingSelectDetail.hj?parking_code=${arrayList.parking_code}">${arrayList.parking_name}</a></td>
<td><a href="./ParkingSelectDetail.hj?parking_code=${arrayList.parking_code}">${arrayList.parking_approval}</a></td>
</tr>
</c:forEach>

<c:if test="${empty arrayList}">
<tr>
<td>등록된 주차장이 없습니다.</td>
</tr>
</c:if>

</tbody>

</table>

<div>
<button onclick="./ParkingInsertInput.hj">주차장 등록</button>
</div>

</body>
</html>