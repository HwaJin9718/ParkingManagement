<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주차장 등록 화면(input)</title>
</head>
<body>

<h5>주차장 등록</h5>

<form action="./ParkingInsert.hj" method="post" enctype="multipart/form-data">
<fieldset>

<div>
<label for="parking_name">주차장 이름 : </label>
<input type="text" name="parking_name" id="parking_name">
</div>

<div>
<label for="parking_address">주차장 주소 : </label>
<input type="text" name="parking_address" id="parking_address"><br>
[참고] 도로명 주소로 기재해주세요.
</div>

<div>
<label for="parking_latitude">주차장 위도 : </label>
<input type="text" name="parking_latitude" id="parking_latitude"><br>
</div>

<div>
<label for="parking_longitude">주차장 경도 : </label>
<input type="text" name="parking_longitude" id="parking_longitude"><br>
</div>

<div>
<label for="parking_operation">운영시간 : </label>
<input type="text" name="parking_operation" id="parking_operation"><br>
[참고] ex. 09:00~18:00
</div>

<div>
<label for="parking_type">주차장 종류 : </label>
<input type="radio" name="parking_type" id="parking_type" value="public">공영
<input type="radio" name="parking_type" id="parking_type" value="private">민영
</div>

<div>
<label for="parking_total_spaces">주차 공간 : </label>
<input type="text" name="parking_total_spaces" id="parking_total_spaces">석
</div>

<div>
<label for="parking_electriccar_check">전기차 충전 가능 여부 : </label>
<input type="radio" name="parking_electriccar_check" id="parking_electriccar_check" value="Y">가능
<input type="radio" name="parking_electriccar_check" id="parking_electriccar_check" value="N">불가능
</div>

<div>
<label for="parking_electriccar_spaces">전기차 충전 가능 공간 : </label>
<input type="text" name="parking_electriccar_spaces" id="parking_electriccar_spaces">석
</div>

<div>
<label for="parking_pay_type">적용 가능 할인권 : </label>
<input type="radio" name="parking_pay_type" id="parking_pay_type" value="R">정기권
<input type="radio" name="parking_pay_type" id="parking_pay_type" value="T">시간권
<input type="radio" name="parking_pay_type" id="parking_pay_type" value="RT">모두(정기권, 시간권)
</div>

<div>
<label for="parking_base_fee">1시간 당 기본요금 : </label>
<input type="text" name="parking_base_fee" id="parking_base_fee">원<br>
[참고] 금액을 숫자로 기재해주세요. (ex. 10000 or 15000 등)
</div>

<div>
<label for="parking_hourly_rate">10분 over time 시 추가 요금 : </label>
<input type="text" name="parking_hourly_rate" id="parking_hourly_rate">원<br>
[참고] 금액을 숫자로 기재해주세요. (ex. 10000 or 15000 등)
</div>

<div>
<label for="parking_photo">주차장 이미지 등록 : </label>
<input type="file" name="parking_photo" id="parking_photo" accept="image/*" multiple><br>
[참고] 주차장 입구, 내부 등 주차장 사진을 등록해주세요. (최대 5개)
</div>

<div>
<label for="parking_document">서류 등록 : </label>
<input type="file" name="parking_document" id="parking_document" accept="image/*"><br>
[참고] 토지매매서 or 임대계약서를 등록해주세요.
</div>

<div>
<button type="submit"> 등록 </button>
<button type="reset"> 취소 </button>
</div>

</fieldset>
</form>

</body>
</html>