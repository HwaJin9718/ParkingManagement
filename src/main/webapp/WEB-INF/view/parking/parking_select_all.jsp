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

<div>
<button onclick="location.href ='./Menu.hj'">메뉴</button>
<button onclick="location.href ='./ParkingInsertInput.hj'">주차장 등록</button>
</div>

<table>

<thead>
<tr>
<th>코드 번호</th>
<th>이름</th>
<th>승인상태</th>
<th></th>
</tr>
</thead>

<tbody>

<c:forEach var="arrayList" items="${arrayList}">
<tr>
<td>${arrayList.parking_code}</td>
<td>${arrayList.parking_name}</td>
<td>
<c:choose>
<c:when test="${arrayList.parking_approval eq 'AP'}">승인</c:when>
<c:otherwise>미승인</c:otherwise>
</c:choose>
</td>
<td><a href="./ParkingSelectDetail.hj?parking_code=${arrayList.parking_code}">상세 보기</a></td>
</tr>
</c:forEach>

<c:if test="${empty arrayList}">
<tr>
<td>등록된 주차장이 없습니다.</td>
</tr>
</c:if>

</tbody>

</table>

</body>
</html>