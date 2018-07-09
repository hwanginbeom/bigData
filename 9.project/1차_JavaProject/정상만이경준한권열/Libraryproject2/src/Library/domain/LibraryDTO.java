package Library.domain;

public class LibraryDTO {

	// 변수 지정
	private String libraryName;
	private String city;
	private String district;
	private String libraryType;
	private String holiday;
	private String openTime;
	private String closedTime;
	private String holidayOpenTime;
	private String holidayClosedTime;
	private String location;
	private String phoneNumber;
	// 객체 생성
	public LibraryDTO(String libraryName, String city, String district, String libraryType, String holiday,
			String openTime, String closedTime, String holidayOpenTime, String holidayClosedTime, String location,
			String phoneNumber) {
		super();
		this.libraryName = libraryName;
		this.city = city;
		this.district = district;
		this.libraryType = libraryType;
		this.holiday = holiday;
		this.openTime = openTime;
		this.closedTime = closedTime;
		this.holidayOpenTime = holidayOpenTime;
		this.holidayClosedTime = holidayClosedTime;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	// 빌더 생성
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n*도서관명 :");
		builder.append(libraryName);
		builder.append("\n*시도명 :");
		builder.append(city);
		builder.append("\n*지역구 :");
		builder.append(district);
		builder.append("\n*도서관 유형 :");
		builder.append(libraryType);
		builder.append("\n*공휴일 :");
		builder.append(holiday);
		builder.append("\n*평일 운영시작시간 :");
		builder.append(openTime);
		builder.append("\n*평일 운영종료시간 :");
		builder.append(closedTime);
		builder.append("\n*공휴일 운영시작시간 :");
		builder.append(holidayOpenTime);
		builder.append("\n*공휴일 운영종료시간 :");
		builder.append(holidayClosedTime);
		builder.append("\n*소재지 도로명 주소 :");
		builder.append(location);
		builder.append("\n*전화번호 :");
		builder.append(phoneNumber);
		return builder.toString();
	}

}