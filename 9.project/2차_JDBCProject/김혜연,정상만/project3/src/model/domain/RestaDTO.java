//deptno, dname, loc
//dept의 row 하나와 1:1 매핑되는 클래스
package model.domain;

public class RestaDTO {
	private String name;
	private String category;
	private String signatureMenu;
	private String address;
	private String businessHour = "영업시간 정보 없음";
	private String holiday = "공휴일 정보 없음";
	private String tell = "전화번호 정보 없음";
	private String parking = "주차 정보 없음";
	private String discount = "할인 정보 없음";
	
	public RestaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaDTO(String name, String category, String signatureMenu, String address, String businessHour,
			String holiday, String tell, String parking, String discount) {
		super();
		this.name = name;
		this.category = category;
		this.signatureMenu = signatureMenu;
		this.address = address;
		this.businessHour = businessHour;
		
		if(businessHour != null) {
			this.businessHour = businessHour;
		}

		
		if(holiday != null) {
			this.holiday = holiday;
		}
		
		if(tell != null) {
			this.tell = tell;
		}
		
		if(parking != null) {
			this.parking = parking;
		}
		
		if(discount != null) {
			this.discount = discount;
		}
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSignatureMenu() {
		return signatureMenu;
	}

	public void setSignatureMenu(String signatureMenu) {
		this.signatureMenu = signatureMenu;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessHour() {
		return businessHour;
	}

	public void setBusinessHour(String businessHour) {
		this.businessHour = businessHour;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n# 상호명 : ");
		builder.append(name);
		builder.append("\n# 대분류 : ");
		builder.append(category);
		builder.append("\n# 대표메뉴 : ");
		builder.append(signatureMenu);
		builder.append("\n# 도로명 주소 : ");
		builder.append(address);
		builder.append("\n# 영업시간 : ");
		builder.append(businessHour);
		builder.append("\n# 휴일 : ");
		builder.append(holiday);
		builder.append("\n# 전화번호 : ");
		builder.append(tell);
		builder.append("\n# 주차번호 : ");
		builder.append(parking);
		builder.append("\n# 할인여부 : ");
		builder.append(discount);
		builder.append("");
		return builder.toString();
	}


/*	public DeptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DeptDTO [deptno=");
		builder.append(deptno);
		builder.append(", dname=");
		builder.append(dname);
		builder.append(", loc=");
		builder.append(loc);
		builder.append("]");
		return builder.toString();
	}
*/
}
