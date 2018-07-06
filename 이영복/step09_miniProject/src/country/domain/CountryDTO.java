package country.domain;

public class CountryDTO { // CountryDTO -> 리스트 3개 아이템에 따라서. 
	private String Item; // 의약, 컴퓨터, 항공
	private Korea korea; // 한-> 데이터 클래스 상속
	private Japan japan; // 한-> 데이터 클래스 상속
	private China china; // 한-> 데이터 클래스 상속
	
	public CountryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountryDTO(String item, Korea korea, Japan japan, China china) {
		super();
		Item = item;
		this.korea = korea;
		this.japan = japan;
		this.china = china;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String item) {
		Item = item;
	}
	public Korea getKorea() {
		return korea;
	}
	public void setKorea(Korea korea) {
		this.korea = korea;
	}
	public Japan getJapan() {
		return japan;
	}
	public void setJapan(Japan japan) {
		this.japan = japan;
	}
	public China getChina() {
		return china;
	}
	public void setChina(China country_3) {
		this.china = china;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryDTO [Item=");
		builder.append(Item);
		builder.append(", korea=");
		builder.append(korea);
		builder.append(", japan=");
		builder.append(japan);
		builder.append(", china=");
		builder.append(china);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
