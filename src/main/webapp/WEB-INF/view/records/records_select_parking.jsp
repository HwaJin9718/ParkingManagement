<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차기록 전체 조회(parking)</title>
</head>
<body>

<h5>주차 기록 조회</h5>

<table>

<thead>
<tr>
<th>주차장 코드 번호</th>
<th>주차 기록 코드 번호</th>
<th>차량 번호</th>
<th>입차 시간</th>
<th>출차 시간</th>
<th></th>
</tr>
</thead>

<tbody>

<c:forEach var="arrayList" items="${arrayList}">
<tr>
<td>${arrayList.parking_code}</td>
<td>${arrayList.records_code}</td>
<td>${arrayList.user_car_num}</td>
<td>${arrayList.records_start}</td>
<td>${arrayList.records_end}</td>
<td><a href="./RecordsSelectDetailParking.hw?records_code=${arrayList.records_code}">상세 정보 보기</a></td>
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
<button onclick="location.href ='./RecordsInsertInput.hw?parking_code=${arrayList.parking_code}&parking_name=${parking_name}'">주차 기록 등록</button>
<button onclick="location.href ='./Menu.hj'">메뉴</button>
</div>

</body>
</html>