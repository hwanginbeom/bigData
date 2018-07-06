package country.domain;

public class China extends Data{
	String country;

	public China(String country) {
		this.country = country;
	}

	public China(int year_2006, int year_2010, int year_2014, int job_hunter, int get_percent, int job_offer,
			int job_match, String country) {
		super(year_2006, year_2010, year_2014, job_hunter, get_percent, job_offer, job_match);
		this.country = country;
	}

	public String getName() {
		return country;
	}

	public void setName(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("China [country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
		}
}
