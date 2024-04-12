package car.parking.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import car.common.control.Controller;
import car.common.handler.HandlerAdapter;
import car.parking.controller.ParkingInsertController;
import car.parking.controller.ParkingSelectAllController;
import car.parking.controller.ParkingSelectDetailController;

@MultipartConfig(
	    fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
	    maxFileSize = 1024 * 1024 * 50,      // 50 MB
	    maxRequestSize = 1024 * 1024 * 100   // 100 MB
	)
public class ParkingFrontServlet extends HttpServlet {
	
	private static final Log log = LogFactory.getLog(ParkingFrontServlet.class);
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String pathURL = requestURI.substring(contextPath.length());
		log.info("맵핑명 조회 - " + pathURL);
		
		HandlerAdapter handlerAdapter = null;
		Controller controller = null;
		
		if (pathURL.equals("/ParkingSelectAll.hj")) {
			
			controller = new ParkingSelectAllController();
			handlerAdapter = controller.execute(request, response);
			log.info("FrontServlet 주차장 전체 조회 - " + handlerAdapter);
			
		} 
		
		else if(pathURL.equals("/ParkingSelectDetail.hj")) {
			
			controller = new ParkingSelectDetailController();
			handlerAdapter = controller.execute(request, response);
			log.info("FrontServlet 주차장 상세 조회 - " + handlerAdapter);
			
		}
		
		else if(pathURL.equals("/ParkingInsertInput.hj")) {
			
			handlerAdapter = new HandlerAdapter();
			handlerAdapter.setPath("/WEB-INF/view/parking/parking_insert_input.jsp");
			log.info("FrontServlet 주차장 등록 화면 - " + handlerAdapter);

		}
		
		else if(pathURL.equals("/ParkingInsert.hj")) {
			
			request.setCharacterEncoding("UTF-8");
			controller = new ParkingInsertController();
			handlerAdapter = controller.execute(request, response);
			log.info("FrontServlet 주차장 등록 - " + handlerAdapter);
			
		} 
		
		else if(pathURL.equals("/ParkingDelete.hj")) {
			
			handlerAdapter = new HandlerAdapter();
			handlerAdapter.setPath("/WEB-INF/view/parking/parking_delete.jsp");
			log.info("FrontServlet 주차장 삭제 요청 화면 - " + handlerAdapter);
			
		}
		
		else {
			
		}
		
		if (handlerAdapter != null) {
			
			if (handlerAdapter.isRedirect()) {
				response.sendRedirect(handlerAdapter.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(handlerAdapter.getPath());
				dispatcher.forward(request, response);
			}
			
		}
		
	}

}
