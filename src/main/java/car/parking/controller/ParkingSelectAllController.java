package car.parking.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import car.common.control.Controller;
import car.common.handler.HandlerAdapter;
import car.parking.dao.ParkingDAO;
import car.parking.dto.ParkingDTO;

public class ParkingSelectAllController implements Controller {
	
	private static final Log log = LogFactory.getLog(ParkingSelectAllController.class);
	
	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		ParkingDAO parkingDAO = new ParkingDAO();
		ParkingDTO parkingDTO = new ParkingDTO();
		ArrayList<ParkingDTO> arrayList = new ArrayList<ParkingDTO>();
		
		arrayList = parkingDAO.parkingSelectAll(12345); // 세션연결되어있지 않아 12345로 user_code 지정
		request.setAttribute("arrayList", arrayList);
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		log.info("Controller 전체 주차장 조회");
		handlerAdapter.setPath("/WEB-INF/view/parking/parking_select_all.jsp");
		
		return handlerAdapter;
	}

}
