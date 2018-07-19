package project02.domain;

public class ContractDTO {
	private String arcadeType; // 상가 유형
	private String arcadeID; //상가번호
	private String businessType; // 업종
	private String contractStartDate; // 계약 시작 일
	private String contractEndDate; // 계약 종료 일
	private int rental; // 임대료
	private String note; // 비고
	
	public ContractDTO() {}

	public ContractDTO(String arcadeType, String arcadeID, String businessType, String contractStartDate,
			String contractEndDate, int rental, String note) {
		this.arcadeType = arcadeType;
		this.arcadeID = arcadeID;
		this.businessType = businessType;
		this.contractStartDate = contractStartDate;
		this.contractEndDate = contractEndDate;
		this.rental = rental;
		this.note = note;
	}

	public String getArcadeType() {
		return arcadeType;
	}

	public void setArcadeType(String arcadeType) {
		this.arcadeType = arcadeType;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getArcadeID() {
		return arcadeID;
	}

	public void setArcadeID(String arcadeID) {
		this.arcadeID = arcadeID;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	public int getRental() {
		return rental;
	}

	public void setRental(int rental) {
		this.rental = rental;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(", 상가 목적 =");
		builder.append(arcadeType);
		builder.append(", 상가번호 =");
		builder.append(arcadeID);
		builder.append(", 업종 =");
		builder.append(businessType);
		builder.append(", 임대 시작일 =");
		builder.append(contractStartDate);
		builder.append(", 임대 종료일 =");
		builder.append(contractEndDate);
		builder.append(", 임대료 =");
		builder.append(rental);
		builder.append(", 비고 =");
		builder.append(note);
		return builder.toString();
	}
}
