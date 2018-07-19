package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.domain.RestaDTO;
import util.DBUtil;

public class RestaDAO {

	// 모든검색
	// select * from Resta
	public static ArrayList<RestaDTO> getAll() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<RestaDTO> datas = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from RESTA");// 완벽하게 결과값 받아온 후 객체를만드는 것이 좋다 커넥션 완료후

			datas = new ArrayList<RestaDTO>();
			while (rs.next()) {
				datas.add(new RestaDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8), rs.getString(9)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, stmt, rs);
		}

		return datas;// 객체 안 만들거야 ,static으로 할거야
	}

	// address 로 해당 가게 주소 검색
	public static RestaDTO getAddcat(String address, String category) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		RestaDTO datas = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from RESTA where ADDRESS like ? and CATEGORY like ? ");// 완벽하게 결과값 받아온 후 객체를만드는 것이 좋다 커넥션 완료후
			pstmt.setString(1, "%"+address+"%");
			pstmt.setString(2, "%"+category+"%");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				datas = new RestaDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8), rs.getString(9)
				);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt, rs);
		}

		return datas;// 객체 안 만들거야 ,static으로 할거야
	}

	public static RestaDTO getCategory(String category) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		RestaDTO datas = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from RESTA where CATEGORY  like '%' || ? || '%'");// 완벽하게 결과값 받아온 후 객체를만드는 것이 좋다 커넥션 완료후
			pstmt.setString(1, category);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				datas = new RestaDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8), rs.getString(9)
				);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt, rs);
		}

		return datas;// 객체 안 만들거야 ,static으로 할거야
	}


	// 새로운 주소 정보 저장
	// insert into dept values(?,?,?)
	// insert into dept values(50, '총무부', '역삼')

	public static boolean insert(RestaDTO newAddress) throws SQLException {
		Connection con = null;
		// 이 객체가 생성되는 시점엔 이미 고정된 sql문장 내장
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			// 고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("insert into RESTA values(?,?,?,?,?,?,?,?,?)");
			// ?에 데이터값 순차적으로 세팅
			pstmt.setString(1, newAddress.getName());
			pstmt.setString(2, newAddress.getCategory());
			pstmt.setString(3, newAddress.getSignatureMenu());
			pstmt.setString(4, newAddress.getAddress());
			pstmt.setString(5, newAddress.getBusinessHour());
			pstmt.setString(6, newAddress.getHoliday());
			pstmt.setString(7, newAddress.getTell());
			pstmt.setString(8, newAddress.getParking());
			pstmt.setString(9, newAddress.getDiscount());
			
			// db에 실제 실행
			int result = pstmt.executeUpdate();// insert/update/delete 실행 메소드
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}

		return true;

	}

	// Address 로 수정
	public static boolean update(String address, String newCategory) throws SQLException {
		Connection con = null;
		// 이 객체가 생성되는 시점엔 이미 고정된 sql문장 내장
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			// 고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("update RESTA set CATEGORY= ? where ADDRESS=?");
			// ?에 데이터값 순차적으로 세팅
			pstmt.setString(2, newCategory);
			pstmt.setString(4, address);

			// db에 실제 실행
			int result = pstmt.executeUpdate(); // insert/update/delete 실행 메소드
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}
		return true;
	}


	// Address로 해당 부서 삭제
	public static boolean delete(String address) throws SQLException {

		Connection con = null;
		// 이 객체가 생성되는 시점엔 이미 고정된 sql문장 내장
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			// 고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("delete from RESTA where ADDRESS = ?");
			// ?에 데이터값 순차적으로 세팅
			pstmt.setString(1, address);

			// db에 실제 실행
			int result = pstmt.executeUpdate();// insert/update/delete 실행 메소드

			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}

		return true;
	}
}
