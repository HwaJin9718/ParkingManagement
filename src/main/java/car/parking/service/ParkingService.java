package car.parking.service;

import java.util.ArrayList;

import car.parking.dto.ParkingDTO;

public interface ParkingService {
	
	public ArrayList<ParkingDTO> parkingSelectAll(int user_code);
	
	public ParkingDTO parkingSelectDetail(int parking_code);
	
	public void parkingInsert(ParkingDTO parkingDTO);
	
	public ParkingDTO parkingUpdate(ParkingDTO parkingDTO);
	
	public void parkingDelete(int parking_code);

}
