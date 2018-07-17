package project02.domain;

import java.util.ArrayList;

public class StationArcadeDTO { // 역별 상가정보
	private ArrayList<ArcadeInfoDTO> stationArcade;
	private String stationID;		//역명 ID ex) 역삼역, 군자역
	
	public StationArcadeDTO() {}

	public StationArcadeDTO(ArrayList<ArcadeInfoDTO> stationArcade, String stationID) {
		super();
		this.stationArcade = stationArcade;	// 역 상가 정보
		this.stationID = stationID;		//역 ID
	}

	public ArrayList<ArcadeInfoDTO> getStationArcade() {
		return stationArcade;
	}

	public void setStationArcade(ArrayList<ArcadeInfoDTO> stationArcade) {
		this.stationArcade = stationArcade;
	}

	public String getStationID() {
		return stationID;
	}

	public void setStationID(String stationID) {
		this.stationID = stationID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StationArcadeDTO [stationArcade=");
		builder.append(stationArcade);
		builder.append(", stationID=");
		builder.append(stationID);
		builder.append("]");
		return builder.toString();
	}
}
