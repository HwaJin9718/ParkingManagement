package car.parking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import car.parking.dto.ParkingDTO;
import car.parking.service.ParkingService;

public class ParkingDAO implements ParkingService {
	
	private static final Log log = LogFactory.getLog(ParkingDAO.class);

	@Override
	public ArrayList<ParkingDTO> parkingSelectAll(int user_code) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<ParkingDTO> arrayList = new ArrayList<ParkingDTO>();
		
		try {
			
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
			connection = dataSource.getConnection();
			
			String sql = "select parking_code, parking_name, parking_approval from parking ";
			sql += "where user_code = ? ";
			log.info("SQL 확인 - " + sql);
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, user_code);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				ParkingDTO parkingDTO = new ParkingDTO();
				parkingDTO.setParking_code(resultSet.getInt("parking_code"));
				parkingDTO.setParking_name(resultSet.getString("parking_name"));
				parkingDTO.setParking_approval(resultSet.getString("parking_approval"));
				arrayList.add(parkingDTO);
			}
			
			if (resultSet.getRow() == 0) {
				log.info(user_code + " 회원님의 계정으로 등록된 주차장이 없습니다. 주차장을 등록해주세요.");
			}
			
		} catch (NamingException e) {
			log.info(user_code + "회원 주차장 전체 조회 실패(NamingException) - " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			log.info(user_code + "회원 주차장 전체 조회 실패(SQLException) - " + e);
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				log.info("주차장 전체 조회 close 실패 - " + e);
				e.printStackTrace();
			}
		}
		
		return arrayList;
	}

	@Override
	public ParkingDTO parkingSelectDetail(int parking_code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingDTO parkingInsert(ParkingDTO parkingDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingDTO parkingUpdate(ParkingDTO parkingDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ParkingDTO parkingDelete(int parking_code) {
		// TODO Auto-generated method stub
		return null;
	}

}
