<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 주차장 코드번호 조회</title>
</head>
<body>

<h5>주차장 코드 번호 조회</h5>

<table>

<thead>
<tr>
<th>회원 코드 번호</th>
<th>주차장 코드 번호</th>
<th>주차장 이름</th>
<th></th>
</tr>
</thead>

<tbody>

<c:forEach var="arrayList" items="${arrayList}">
<tr>
<td>${arrayList.user_code}</td>
<td>${arrayList.parking_code}</td>
<td>${arrayList.parking_name}</td>
<td><a href="./RecordsSelectParking.hw?parking_code=${arrayList.parking_code}&parking_name=${arrayList.parking_name}">주차 기록 보기</a></td>
</tr>
</c:forEach>

<c:if test="${empty arrayList}">
<tr>
<td>주차 이용 내역이 없습니다.</td>
</tr>
</c:if>

</tbody>

</table>

<div>
<button onclick="location.href ='./Menu.hj'">메뉴</button>
</div>

</body>
</html>