package country.domain;

public class Data {
	int year_2006;
	int year_2010;
	int year_2014;
	int job_hunter;
	int get_percent;
	int job_offer;
	int job_match;
	
	public Data() {
//		super();
	}
	public Data(int year_2006, int year_2010,
			int year_2014, int job_hunter, int get_percent, int job_offer, int job_match) {
//		super();
		this.year_2006 = year_2006;
		this.year_2010 = year_2010;
		this.year_2014 = year_2014;
		this.job_hunter = job_hunter;
		this.get_percent = get_percent;
		this.job_offer = job_offer;
		this.job_match = job_match;
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
	public int getJob_hunter() {
		return job_hunter;
	}
	public void setJob_hunter(int job_hunter) {
		this.job_hunter = job_hunter;
	}
	public int getGet_percent() {
		return get_percent;
	}
	public void setGet_percent(int get_percent) {
		this.get_percent = get_percent;
	}
	public int getJob_offer() {
		return job_offer;
	}
	public void setJob_offer(int job_offer) {
		this.job_offer = job_offer;
	}
	public int getJob_match() {
		return job_match;
	}
	public void setJob_match(int job_match) {
		this.job_match = job_match;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [year_2006=");
		builder.append(year_2006);
		builder.append(", year_2010=");
		builder.append(year_2010);
		builder.append(", year_2014=");
		builder.append(year_2014);
		builder.append(", job_hunter=");
		builder	.append(job_hunter);
		builder.append(", get_percent=");
		builder.append(get_percent);
		builder.append(", job_offer=");
		builder.append(job_offer);
		builder.append(", job_match=");
		builder.append(job_match);
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
}
