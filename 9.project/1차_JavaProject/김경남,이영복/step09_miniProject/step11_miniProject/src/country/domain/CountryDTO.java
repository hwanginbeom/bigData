package country.domain;

public class CountryDTO { // CountryDTO -> 리스트 3개 아이템에 따라서
	private String Item; // 의약, 컴퓨터, 항공
	private Korea korea; // 한-> 데이터 클래스 상속
	private Japan japan; // 일-> 데이터 클래스 상속
	private China china; // 중-> 데이터 클래스 상속
	
	public CountryDTO(String Item) {
		super();
		this.Item = Item;
	}
	public CountryDTO(String Item, Korea korea, Japan japan, China china) {
		super();
		this.Item = Item;
		this.korea = korea;
		this.japan = japan;
		this.china = china;
	}
	public String getItem() {
		return Item;
	}
	public void setItem(String Item) {
		this.Item = Item;
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
	public void setChina(China china) {
		this.china = china;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[유망 분야 = ");
		builder.append(Item +"]\n");
		builder.append("한국=");
		builder.append(korea);
		builder.append("일본=");
		builder.append(japan);
		builder.append("중국=");
		builder.append(china);
		return builder.toString();
	}
}