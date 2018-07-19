package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.ApartDTO;
import util.DBUtil;

public class ApartDAO {

	// 모든검색
	// select * from apart
	public static ArrayList<ApartDTO> getAll() throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<ApartDTO> datas = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from apart");// 완벽하게 결과값 받아온 후 객체를만드는 것이 좋다 커넥션 완료후

			datas = new ArrayList<ApartDTO>();
			while (rs.next()) {
				datas.add(new ApartDTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4),rs.getInt(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		return datas;// 객체 안 만들거야 , static으로 할거야
	}

	// area_name으로 area_size, year, month, price 검색
	// select * from apart where area_name = ?
	public static ArrayList<ApartDTO> getApt(String area_name) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<ApartDTO> datas = null;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from apart where area_name =" +"'"+ area_name+"'");
			
			datas = new ArrayList<ApartDTO>();
			while (rs.next()) {
				datas.add(new ApartDTO(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(4),rs.getInt(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, stmt, rs);
		}

		return datas;// 객체 안 만들거야 , static으로 할거야
	}
	// 새로운 부서 정보 저장 
	// ex. insert into apart values (?,?,?,?,?) 
	// ex. insert into apart values ('독도', '전용면적 60㎡이하',2018,7,5000)
	public static boolean insert(ApartDTO newApt) throws SQLException {
		Connection con = null;
		//이 객체가 생성되는 시점엔 이미 고정된 sql문장 내장
		PreparedStatement pstmt = null; //Alt + Shift + R 로 refactor
		
		try {
			con = DBUtil.getConnection();
			//고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("insert into apart values(?,?,?,?,?)");
			
			//? 에 데이터값 순차적으로 셋팅
			pstmt.setString(1, newApt.getArea_name());
			pstmt.setString(2, newApt.getArea_size());
			pstmt.setInt(3, newApt.getYear_date());
			pstmt.setInt(4, newApt.getMonth_date());
			pstmt.setInt(5, newApt.getPrice_per_m_2());
			
			//db에 실제 실행
			int result = pstmt.executeUpdate(); //insert/update/delete 실행 메소드
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e; //catch 내에서 throw 해야만 end user에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	// price 수정
	public static boolean update(int price, String area_name) throws SQLException {
		Connection con = null;
		//이 객체가 생성되는 시점엔 이미 고정된 sql문장 내장
		PreparedStatement pstmt = null; //Alt + Shift + R 로 refactor
		
		try {
			con = DBUtil.getConnection();
			//고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("update apart set price_per_m_2 =? where area_name=? and area_size = '전체'");
			
			//? 에 데이터값 순차적으로 셋팅
			pstmt.setInt(1, price);
			pstmt.setString(2, area_name);
			
			//db에 실제 실행
			int result = pstmt.executeUpdate();
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e; //catch 내에서 throw 해야만 end user에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}

	// area_name으로 데이터 삭제
	public static boolean delete(String area_name) throws SQLException {
		Connection con = null;
		//이 객체가 생성되는 시점엔 이미 고정된 sql문장 내장
		PreparedStatement pstmt = null; //Alt + Shift + R 로 refactor
		
		try {
			con = DBUtil.getConnection();
			//고정된 문장으로 sql 실행 객체 생성
			pstmt = con.prepareStatement("delete from apart where area_name = ?");
			
			//? 에 데이터값 순차적으로 셋팅
			pstmt.setString(1, area_name);
			
			//DB에 실제 실행
			int result = pstmt.executeUpdate(); //insert/update/delete 실행 메소드
			if(result == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e; //catch 내에서 throw 해야만 end user에게 상황 전달 가능
		} finally {
			DBUtil.close(con, pstmt);
		}
		
		return true;
	}
	// 쿼리 검색 내 집 마련에 얼마나 걸릴까?
	public static double getMyHome_month(double paid_in, double house_price, double interest) {
		return Math.log(paid_in/(paid_in - house_price * interest/1200))/Math.log(1+interest/1200);
	}
	public static double getMyHome(String area, int area_size, int pay, int savings, double interest) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		double data = 0;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from apart where area_name = '" + area + "'" );
			//원래는 rs = stmt.executeQuery("select price_per_m_2 from apart where area_name = '" + area + "'");
			while (rs.next()) {
				//data.add(rs.getInt(5));
				data = 7252;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		//return data * area_size / (pay * savings / 100) ; // 객체 안 만들거야 , static으로 할거야
		return ApartDAO.getMyHome_month(pay*savings/100, data*area_size, interest);
	}
	public static double getMyInterest(String bank) throws Exception {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		double data = 30;
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select price_per_m_2 from apart");
			//원래는 rs = stmt.executeQuery("select rate from apart where bank = ? ");
			while (rs.next()) {
				data = 3.55;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;// catch 내에서 throw 해야만 end user 에게 상황 전달 가능
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		return data; // 객체 안 만들거야 , static으로 할거야
	}
}