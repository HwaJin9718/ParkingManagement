package car.parking.dto;

public class ParkingDTO {
	
	// 이름, 주소, 운영시간, 종류, 총 주차 가능 공간, 기본요금, 추가요금, 전기차 충전 가능여부, 전기차 충전 가능 공간, 서류, 결제유형(정기권, 시간권)
	// 주차장 등록 승인상태 > 관리자만 볼 수 있도록
	// 사진 > 연구 좀 해보자.......
	
	private int parking_code; // 주차장 코드 > 기본키 (시퀀스)
	private String parking_name; // 주차장 이름
	private String parking_address; // 주차장 주소
	private String parking_operation; // 주차장 운영일정 및 시간
//	private String parking_status; // 주차장 상태(운영중, 운영종료 등) > DB 저장 X : 시간별로 뷰에서 보이도록만
	private String parking_type; // 주차장 종류(실내, 실외, 공용 등)
	private String parking_total_spaces; // 총 주차 가능 공간
//	private String parking_occupied_spaces; // 현재 주차된 차량 수 > DB 저장 X : count로 해당 주차장에 입차되어있는 차량 수 
	private String parking_base_fee; // 기본 요금
	private String parking_hourly_rate; // 시간 당 추가요금
	
	// 사진을 DTO에 어떻게 받지?
	private String parking_photo1; // 사진 
	private String parking_photo2;
	private String parking_photo3;
	private String parking_photo4;
	private String parking_photo5;
	private String parking_photo6;
	private String parking_photo7;
	
	private String parking_electriccar_check; // 전기차 충전 가능 여부
	private String parking_electriccar_spaces; // 전기차 충전 가능 공간
	private String parking_document; // 서류
	private String parking_approval; // 주차장 등록 승인 상태
	private String parking_pay_type; // 정기권, 시간권 결제 유형
	
	private int user_code; // 등록한 고객 코드 > 외래키
	
	public int getParking_code() {
		return parking_code;
	}
	public void setParking_code(int parking_code) {
		this.parking_code = parking_code;
	}
	public String getParking_name() {
		return parking_name;
	}
	public void setParking_name(String parking_name) {
		this.parking_name = parking_name;
	}
	public String getParking_address() {
		return parking_address;
	}
	public void setParking_address(String parking_address) {
		this.parking_address = parking_address;
	}
	public String getParking_operation() {
		return parking_operation;
	}
	public void setParking_operation(String parking_operation) {
		this.parking_operation = parking_operation;
	}
	public String getParking_type() {
		return parking_type;
	}
	public void setParking_type(String parking_type) {
		this.parking_type = parking_type;
	}
	public String getParking_total_spaces() {
		return parking_total_spaces;
	}
	public void setParking_total_spaces(String parking_total_spaces) {
		this.parking_total_spaces = parking_total_spaces;
	}
	public String getParking_base_fee() {
		return parking_base_fee;
	}
	public void setParking_base_fee(String parking_base_fee) {
		this.parking_base_fee = parking_base_fee;
	}
	public String getParking_hourly_rate() {
		return parking_hourly_rate;
	}
	public void setParking_hourly_rate(String parking_hourly_rate) {
		this.parking_hourly_rate = parking_hourly_rate;
	}
	public String getParking_photo1() {
		return parking_photo1;
	}
	public void setParking_photo1(String parking_photo1) {
		this.parking_photo1 = parking_photo1;
	}
	public String getParking_photo2() {
		return parking_photo2;
	}
	public void setParking_photo2(String parking_photo2) {
		this.parking_photo2 = parking_photo2;
	}
	public String getParking_photo3() {
		return parking_photo3;
	}
	public void setParking_photo3(String parking_photo3) {
		this.parking_photo3 = parking_photo3;
	}
	public String getParking_photo4() {
		return parking_photo4;
	}
	public void setParking_photo4(String parking_photo4) {
		this.parking_photo4 = parking_photo4;
	}
	public String getParking_photo5() {
		return parking_photo5;
	}
	public void setParking_photo5(String parking_photo5) {
		this.parking_photo5 = parking_photo5;
	}
	public String getParking_photo6() {
		return parking_photo6;
	}
	public void setParking_photo6(String parking_photo6) {
		this.parking_photo6 = parking_photo6;
	}
	public String getParking_photo7() {
		return parking_photo7;
	}
	public void setParking_photo7(String parking_photo7) {
		this.parking_photo7 = parking_photo7;
	}
	public String getParking_electriccar_check() {
		return parking_electriccar_check;
	}
	public void setParking_electriccar_check(String parking_electriccar_check) {
		this.parking_electriccar_check = parking_electriccar_check;
	}
	public String getParking_electriccar_spaces() {
		return parking_electriccar_spaces;
	}
	public void setParking_electriccar_spaces(String parking_electriccar_spaces) {
		this.parking_electriccar_spaces = parking_electriccar_spaces;
	}
	public String getParking_document() {
		return parking_document;
	}
	public void setParking_document(String parking_document) {
		this.parking_document = parking_document;
	}
	public String getParking_approval() {
		return parking_approval;
	}
	public void setParking_approval(String parking_approval) {
		this.parking_approval = parking_approval;
	}
	public String getParking_pay_type() {
		return parking_pay_type;
	}
	public void setParking_pay_type(String parking_pay_type) {
		this.parking_pay_type = parking_pay_type;
	}
	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}

}
