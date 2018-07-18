package project02.controller;

import project02.domain.ArcadeInfoDTO;
import project02.domain.ContractDTO;
import project02.domain.LineArcadeDTO;
import project02.domain.StationArcadeDTO;
import project02.domain.SubwayArcadeDTO;
import project02.model.SubwayArcadeDAO;
import project02.view.RunningEndView;

public class ProjectController {
	
	private static ProjectController instance = new ProjectController();

	private ProjectController() {}
	
	public static ProjectController getInstance() {
		return instance;
	}
	
	public void getAll() {
		try {
			SubwayArcadeDTO subwayInfo = SubwayArcadeDAO.getAll();
			if(subwayInfo.getSubwayArcade() != null) {
				RunningEndView.printAll(subwayInfo); 
			}
			else {
				RunningEndView.succMsg("데이터가 없습니다.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("죄송합니다. 잠시 후에 재요청 바랍니다.");
		}
	}

	public void getLineInfo(String lineID) {
		try {
			LineArcadeDTO lineInfo = SubwayArcadeDAO.getLineInfo(lineID);
			
			if(lineInfo.getLineArcade().size() != 0) {
				RunningEndView.printLine(lineInfo);
			}
			else {
				RunningEndView.succMsg("해당 호선 번호가 없습니다.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("죄송합니다. 잠시 후에 재요청 바랍니다.");
		}
	}

	public void getStationInfo(String stationID) {
		try {
			StationArcadeDTO stationInfo = SubwayArcadeDAO.getStationInfo(stationID);
			
			if(stationInfo.getStationArcade().size() != 0) {
				RunningEndView.printStation(stationInfo);
			}
			else {
				RunningEndView.succMsg("해당 역명이 없습니다.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("죄송합니다. 잠시 후에 재요청 바랍니다.");
		}
	}
	
	public void getEmptySpace() {
		try {
			StationArcadeDTO stationInfo = SubwayArcadeDAO.getEmptySpace();
			
			if(stationInfo.getStationArcade().size() != 0) {
				RunningEndView.printEmpty(stationInfo);
			}
			else {
				RunningEndView.succMsg("공석이 없습니다.");
			}
		} catch(Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("죄송합니다. 잠시 후에 재요청 바랍니다.");
		}
	}
	
	public void insert(ArcadeInfoDTO arcadeInfo) {
		try {
			if(SubwayArcadeDAO.insert(arcadeInfo)) {
				RunningEndView.succMsg("입력하신 정보가 추가되었습니다.");
			}
			else {
				RunningEndView.succMsg("이미 있는 상호ID입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("죄송합니다. 잠시 후에 재요청 바랍니다.");
		}
	}
	
	public void update(String arcadeID, ContractDTO contractInfo) {
		try {
			if(SubwayArcadeDAO.update(arcadeID, contractInfo)) {
				RunningEndView.succMsg("해당 계약 정보가 수정되었습니다.");
			}
			else {
				RunningEndView.succMsg("해당 ID가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("죄송합니다. 해당 ID값이 기존에 있는 ID값 혹은 시스템 오류입니다. 잠시 후에 시도해주세요.");
		}
	}

	public void delete(String arcadeID) {
		try {
			if(SubwayArcadeDAO.delete(arcadeID)) {
				RunningEndView.succMsg("해당 정보가 정상적으로 삭제되었습니다.");
			}
			else {
				RunningEndView.succMsg("해당 ID가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			RunningEndView.errorMsg("죄송합니다. 잠시 후에 다시 시도해주세요.");
		}
	}
}
