package test;
//강력범죄	살인기수	379 	297 	142 	155 	82 	44 	38 	389 	300 	138 	162 	89 	45 	44 	447 	342 	138 	204 	105 	64 	41 	377 	300 	148 	152 	77 	39 	38 
public class DataDTO {
	String MainCategory, DivisionCategory;
	int Total, TotalMen, NormalMen, AbnormalMen, TotalWomen, NormalWomen, AbnormalWomen;
	public DataDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DataDTO(String mainCategory, String divisionCategory, int total, int totalMen, int normalMen,
			int abnormalMen, int totalWomen, int normalWomen, int abnormalWomen) {
		super();
		MainCategory = mainCategory;
		DivisionCategory = divisionCategory;
		Total = total;
		TotalMen = totalMen;
		NormalMen = normalMen;
		AbnormalMen = abnormalMen;
		TotalWomen = totalWomen;
		NormalWomen = normalWomen;
		AbnormalWomen = abnormalWomen;
	}
	public String getMainCategory() {
		return MainCategory;
	}
	public void setMainCategory(String mainCategory) {
		MainCategory = mainCategory;
	}
	public String getDivisionCategory() {
		return DivisionCategory;
	}
	public void setDivisionCategory(String divisionCategory) {
		DivisionCategory = divisionCategory;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public int getTotalMen() {
		return TotalMen;
	}
	public void setTotalMen(int totalMen) {
		TotalMen = totalMen;
	}
	public int getNormalMen() {
		return NormalMen;
	}
	public void setNormalMen(int normalMen) {
		NormalMen = normalMen;
	}
	public int getAbnormalMen() {
		return AbnormalMen;
	}
	public void setAbnormalMen(int abnormalMen) {
		AbnormalMen = abnormalMen;
	}
	public int getTotalWomen() {
		return TotalWomen;
	}
	public void setTotalWomen(int totalWomen) {
		TotalWomen = totalWomen;
	}
	public int getNormalWomen() {
		return NormalWomen;
	}
	public void setNormalWomen(int normalWomen) {
		NormalWomen = normalWomen;
	}
	public int getAbnormalWomen() {
		return AbnormalWomen;
	}
	public void setAbnormalWomen(int abnormalWomen) {
		AbnormalWomen = abnormalWomen;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataDTO [MainCategory=");
		builder.append(MainCategory);
		builder.append(", DivisionCategory=");
		builder.append(DivisionCategory);
		builder.append(", Total=");
		builder.append(Total);
		builder.append(", TotalMen=");
		builder.append(TotalMen);
		builder.append(", NormalMen=");
		builder.append(NormalMen);
		builder.append(", AbnormalMen=");
		builder.append(AbnormalMen);
		builder.append(", TotalWomen=");
		builder.append(TotalWomen);
		builder.append(", NormalWomen=");
		builder.append(NormalWomen);
		builder.append(", AbnormalWomen=");
		builder.append(AbnormalWomen);
		builder.append("]");
		return builder.toString();
	}



}
