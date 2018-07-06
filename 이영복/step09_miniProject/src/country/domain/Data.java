package country.domain;

public class Data {
	int year_2006;
	int year_2010;
	int year_2014;
	public Data() {
//		super();
	}
	public Data(int year_2006, int year_2010, int year_2014) {
//		super();
		this.year_2006 = year_2006;
		this.year_2010 = year_2010;
		this.year_2014 = year_2014;
	}
	public int getYear_2006() {
		return year_2006;
	}
	public void setYear_2006(int year_2006) {
		this.year_2006 = year_2006;
	}
	public int getYear_2010() {
		return year_2010;
	}
	public void setYear_2010(int year_2010) {
		this.year_2010 = year_2010;
	}
	public int getYear_2014() {
		return year_2014;
	}
	public void setYear_2014(int year_2014) {
		this.year_2014 = year_2014;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [year_2006=");
		builder.append(year_2006);
		builder.append(", year_2010=");
		builder.append(year_2010);
		builder.append(", year_2014=")	;
		builder.append(year_2014);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
