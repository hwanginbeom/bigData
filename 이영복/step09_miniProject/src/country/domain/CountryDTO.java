package country.domain;

public class CountryDTO { // CountryDTO -> 리스트 3개 아이템에 따라서. 
	private String Item; // 의약, 컴퓨터, 항공
	private Country country; // 한 중 일 -> 데이터 클래스 상속
	private Result result; // 구직자, 취업증가율, 구인기업, 고용 매칭
	
	public CountryDTO() {
		super();
	}

	public CountryDTO(String item, Country country, Result result) {
		super();
		Item = item;
		this.country = country;
		this.result = result;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryDTO [Item=");
		builder.append(Item);
		builder.append(", country=");
		builder.append(country);
		builder.append(", result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}
}
