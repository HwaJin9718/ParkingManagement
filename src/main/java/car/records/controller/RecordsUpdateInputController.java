package car.records.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.common.control.Controller;
import car.common.handler.HandlerAdapter;
import car.records.dao.RecordsDAO;
import car.records.dto.RecordsDTO;

public class RecordsUpdateInputController implements Controller {
	
	@Override
	public HandlerAdapter execute(HttpServletRequest request, HttpServletResponse response) {
		
		int records_code = Integer.parseInt(request.getParameter("records_code"));
		int parking_code = Integer.parseInt(request.getParameter("parking_code"));
		String parking_name = request.getParameter("parking_name");
		int user_code = Integer.parseInt(request.getParameter("user_code"));
		String user_car_num = request.getParameter("user_car_num");
		String payment_total = request.getParameter("payment_total");
		
		RecordsDAO recordsDAO = new RecordsDAO();
		RecordsDTO recordsDTO = new RecordsDTO();
		
		recordsDTO.setRecords_code(records_code);
		recordsDTO.setParking_code(parking_code);
		recordsDTO.setParking_name(parking_name);
		recordsDTO.setUser_code(user_code);
		recordsDTO.setUser_car_num(user_car_num);
		recordsDTO.setPayment_total(payment_total);
		
		recordsDAO.recordsUpdate(recordsDTO);
		request.setAttribute("recordsDTO", recordsDTO);
		
		HandlerAdapter handlerAdapter = new HandlerAdapter();
		handlerAdapter.setPath("/WEB-INF/view/records/records_update.jsp");
		
		return handlerAdapter;
	}

}
