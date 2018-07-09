package country.domain;

public class Korea extends Data{ // Data 클래스 상속
	String korea; // Korea Class 에서 사용할 변수 설정

	/* ------------------------------------------------------------------------------------------------
	 * Korea Class 생성자 
	 * super( [ ... ] ); 이용하여 부모 클래스의 속성을 모두 상속받을 수 있도록 한다.
	   ------------------------------------------------------------------------------------------------*/

	public Korea(String korea) {
		this.korea = korea;
	}

	public Korea(String korea, int year_2006, int year_2010, int year_2014, int job_hunter, int get_percent, int job_offer,
			int job_match) {
		super(year_2006, year_2010, year_2014, job_hunter, get_percent, job_offer, job_match);
		this.korea = korea;
	}
	
	/* ------------------------------------------------------------------------------------------------
	 * Korea Class 생성자 
	 * super( [ ... ] ); 이용하여 부모 클래스의 속성을 모두 상속받을 수 있도록 한다.
	   ------------------------------------------------------------------------------------------------*/
	 
	public String getName() {
		return korea;
	}

	public void setName(String korea) {
		this.korea = korea;
	}
	/* ------------------------------------------------------------------------------------------------
	 * toString Override
	   ------------------------------------------------------------------------------------------------*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("\n");
		return builder.toString();
	}
}

