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
	public void parkingInsert(ParkingDTO parkingDTO) {
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			
			Context context = new InitialContext();
			DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc");
			connection = dataSource.getConnection();
			
			String sql = "insert into parking (parking_code, parking_name, parking_address, parking_latitude, parking_longitude, parking_operation, "
					+ "parking_type, parking_total_spaces, parking_electriccar_check, parking_electriccar_spaces, "
					+ "parking_pay_type, parking_base_fee, parking_hourly_rate, "
					+ "parking_photo1_name, parking_photo1_path, parking_photo2_name, parking_photo2_path, "
					+ "parking_photo3_name, parking_photo3_path, parking_photo4_name, parking_photo4_path, "
					+ "parking_photo5_name, parking_photo5_path, parking_document_name, parking_document_path, "
					+ "parking_registration, parking_edit, user_code)";
			sql += " values (parking_seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate, sysdate, ?)";
			log.info("SQL 확인 - " + sql);
			
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, parkingDTO.getParking_name());
			preparedStatement.setString(2, parkingDTO.getParking_address());
			preparedStatement.setDouble(3, parkingDTO.getParking_latitude());
			preparedStatement.setDouble(4, parkingDTO.getParking_longitude());
			preparedStatement.setString(5, parkingDTO.getParking_operation());
			preparedStatement.setString(6, parkingDTO.getParking_type());
			preparedStatement.setString(7, parkingDTO.getParking_total_spaces());
			preparedStatement.setString(8, parkingDTO.getParking_electriccar_check());
			preparedStatement.setString(9, parkingDTO.getParking_electriccar_spaces());
			preparedStatement.setString(10, parkingDTO.getParking_pay_type());
			preparedStatement.setString(11, parkingDTO.getParking_base_fee());
			preparedStatement.setString(12, parkingDTO.getParking_hourly_rate());
			preparedStatement.setString(13, parkingDTO.getParking_photo1_name());
			preparedStatement.setString(14, parkingDTO.getParking_photo1_path());
			preparedStatement.setString(15, parkingDTO.getParking_photo2_name());
			preparedStatement.setString(16, parkingDTO.getParking_photo2_path());
			preparedStatement.setString(17, parkingDTO.getParking_photo3_name());
			preparedStatement.setString(18, parkingDTO.getParking_photo3_path());
			preparedStatement.setString(19, parkingDTO.getParking_photo4_name());
			preparedStatement.setString(20, parkingDTO.getParking_photo4_path());
			preparedStatement.setString(21, parkingDTO.getParking_photo5_name());
			preparedStatement.setString(22, parkingDTO.getParking_photo5_path());
			preparedStatement.setString(23, parkingDTO.getParking_document_name());
			preparedStatement.setString(24, parkingDTO.getParking_document_path());
			preparedStatement.setInt(25, parkingDTO.getUser_code());
			
			int count = preparedStatement.executeUpdate();
			
			if (count > 0) {
				connection.setAutoCommit(false);
				connection.commit();
				log.info("주차장 등록 - 커밋되었습니다.");
			} else {
				connection.rollback();
				log.info("주차장 등록 - 롤백되었습니다.");
			}
			
		} catch (NamingException e) {
			log.info(parkingDTO.getUser_code() + "회원 주차장 등록 실패(NamingException) - " + e);
			e.printStackTrace();
		} catch (SQLException e) {
			log.info(parkingDTO.getUser_code() + "회원 주차장 등록 실패(SQLException) - " + e);
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
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
