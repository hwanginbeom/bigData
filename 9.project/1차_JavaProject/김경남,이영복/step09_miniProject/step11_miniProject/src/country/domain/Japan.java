package country.domain;

public class Japan extends Data{
	String japan;

	public Japan(String japan) {
		this.japan = japan;
	}

	public Japan(String japan, int year_2006, int year_2010, int year_2014, int job_hunter, int get_percent, int job_offer,
			int job_match) {
		super(year_2006, year_2010, year_2014, job_hunter, get_percent, job_offer, job_match);
		this.japan = japan;
	}


	public String getName() {
		return japan;
	}

	public void setName(String japan) {
		this.japan = japan;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\n");
		return builder.toString();
	}
}
