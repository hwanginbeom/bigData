package project02.model;

import java.util.ArrayList;

import project02.domain.ArcadeInfoDTO;
import project02.domain.ContractDTO;
import project02.domain.LineArcadeDTO;
import project02.domain.StationArcadeDTO;
import project02.domain.SubwayArcadeDTO;

public class SubwayArcadeModel {
	//////////////////////////////////////////////R
	// 모든 검색
	// select * from dept
	public static ArrayList<SubwayArcadeDTO> getAll() {
		
		return null;
	}
	// 호선별 검색
	public static LineArcadeDTO getLineInfo(String lineID) {
		
		return null;
	}
	// 역별 검색
	public static StationArcadeDTO getStationInfo(String stationID) {
		
		return null;
	}
	
	// 공실 검색
	public static ArcadeInfoDTO getEmptySpace() {
		
		return null;
	}
	
	//C
	//새로운 계약 저장
	//insert into tablename values (?,?,?,~~~)
	public static boolean insert(ArcadeInfoDTO contractArcade) {
	
		return false;
	}
	
	//U
	//계약기간 수정( 재계약 )
	public static boolean update(String arcadeID, ContractDTO contractInfo) {
		
		
		return false;
	}
	//D
	public static boolean delete(String arcadeID) {
		
		return false;
	}
}
