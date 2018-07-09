package country.domain;

public class China extends Data{
	String china;

	public China(String china) {
		this.china = china;
	}

	public China(String china, int year_2006, int year_2010, int year_2014, int job_hunter, int get_percent, int job_offer,
			int job_match) {
		super(year_2006, year_2010, year_2014, job_hunter, get_percent, job_offer, job_match);
		this.china = china;
	}

	public String getName() {
		return china;
	}

	public void setName(String china) {
		this.china = china;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\n");
		return builder.toString();
		}
}
