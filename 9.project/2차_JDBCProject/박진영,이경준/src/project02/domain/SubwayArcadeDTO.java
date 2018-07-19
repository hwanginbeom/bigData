package project02.domain;

import java.util.ArrayList;

public class SubwayArcadeDTO {	//전체 지하철 상가정보
	private ArrayList<LineArcadeDTO> subwayArcade;

	public SubwayArcadeDTO() {	}

	public SubwayArcadeDTO(ArrayList<LineArcadeDTO> subwayArcade) {
		this.subwayArcade = subwayArcade;
	}

	public ArrayList<LineArcadeDTO> getSubwayArcade() {
		return subwayArcade;
	}

	public void setSubwayArcade(ArrayList<LineArcadeDTO> subwayArcade) {
		this.subwayArcade = subwayArcade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(subwayArcade);
		return builder.toString();
	}
}
