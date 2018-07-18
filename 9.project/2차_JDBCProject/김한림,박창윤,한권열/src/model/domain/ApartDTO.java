//Apart 데이터의 지역이름, 지역크기, 연도, 월, 가격 데이터 DTO 생성

package model.domain;

public class ApartDTO {
	public String area_name;
	public String area_size;
	public int year_date;
	public int month_date;
	public int price_per_m_2;
	public ApartDTO() {
		super();
	}
	public ApartDTO(String area_name, String area_size, int year, int month, int price_per_m_2) {
		super();
		this.area_name = area_name;
		this.area_size = area_size;
		this.year_date = year;
		this.month_date = month;
		this.price_per_m_2 = price_per_m_2;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getArea_size() {
		return area_size;
	}
	public void setArea_size(String area_size) {
		this.area_size = area_size;
	}
	public int getYear_date() {
		return year_date;
	}
	public void setYear_date(int year_date) {
		this.year_date = year_date;
	}
	public int getMonth_date() {
		return month_date;
	}
	public void setMonth_date(int month_date) {
		this.month_date = month_date;
	}
	public int getPrice_per_m_2() {
		return price_per_m_2;
	}
	public void setPrice_per_m_2(int price_per_m_2) {
		this.price_per_m_2 = price_per_m_2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("( 지역 이름 : ");
		builder.append(area_name);
		builder.append("   |   면적 종류 : ");
		builder.append(area_size);
		builder.append("   |   연도 : ");
		builder.append(year_date);
		builder.append("   |   월 : ");
		builder.append(month_date);
		builder.append("   |   m제곱당 가격: ");
		builder.append(price_per_m_2);
		builder.append(" )");
		return builder.toString();
	}
	
}
