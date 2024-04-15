package car.records.dto;

public class RecordsDTO {
	
	private int records_code; // 주차 기록 코드 번호
	private String records_start; // 입차 시간
	private String records_end; // 출차 시간
	private int user_code; // 등록한 고객 코드 (외래키)
	private String user_car_num; // 주차된 차량 번호, 회원 차량 번호
	private int parking_code; // 주차장 코드 (외래키)
	private String parking_name; // 주차장 정보 중 주차장 이름
	private String payment_total; // 결제 정보 중 결제 금액
	
	public int getRecords_code() {
		return records_code;
	}
	public void setRecords_code(int records_code) {
		this.records_code = records_code;
	}
	public String getRecords_start() {
		return records_start;
	}
	public void setRecords_start(String records_start) {
		this.records_start = records_start;
	}
	public String getRecords_end() {
		return records_end;
	}
	public void setRecords_end(String records_end) {
		this.records_end = records_end;
	}
	public int getUser_code() {
		return user_code;
	}
	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}
	public String getUser_car_num() {
		return user_car_num;
	}
	public void setUser_car_num(String user_car_num) {
		this.user_car_num = user_car_num;
	}
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
	public String getPayment_total() {
		return payment_total;
	}
	public void setPayment_total(String payment_total) {
		this.payment_total = payment_total;
	}

}
