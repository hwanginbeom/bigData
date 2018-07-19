package project02.domain;

import java.util.HashMap;

public class LineArcadeDTO {	// 호선별 상가정보
	private HashMap<String, StationArcadeDTO> lineArcade;
	private String lineID;	// 호선을 불러오기 위해 위의 String과 대응되는 ID변수
	
	public LineArcadeDTO() {}

	public LineArcadeDTO(HashMap<String, StationArcadeDTO> lineArcade, String lineID) {
		super();
		this.lineArcade = lineArcade;
		this.lineID = lineID;
	}

	public HashMap<String, StationArcadeDTO> getLineArcade() {
		return lineArcade;
	}

	public void setLineArcade(HashMap<String, StationArcadeDTO> lineArcade) {
		this.lineArcade = lineArcade;
	}

	public String getLineID() {
		return lineID;
	}

	public void setLineID(String lineID) {
		this.lineID = lineID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(lineArcade);
		builder.append(", lineID=");
		builder.append(lineID);
		return builder.toString();
	}
}
