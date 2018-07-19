package project02.domain;

public class ArcadeInfoDTO { // 개별 상가정보x
	private ContractDTO contractInfo;
	private String line; // 호선 구분
	private String station; // 역명
	private double area; // 면적
	
	public ArcadeInfoDTO() {}

	public ArcadeInfoDTO(ContractDTO contractInfo, String line, String station, double area) {
		super();
		this.contractInfo = contractInfo;
		this.line = line;
		this.station = station;
		this.area = area;
	}

	public ContractDTO getContractInfo() {
		return contractInfo;
	}

	public void setContractInfo(ContractDTO contractInfo) {
		this.contractInfo = contractInfo;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(line);
		builder.append("]");
		builder.append(" 역명 =");
		builder.append(station);
		builder.append(contractInfo);
		builder.append(", 면적 =");
		builder.append(area);
		return builder.toString();
	}
}
