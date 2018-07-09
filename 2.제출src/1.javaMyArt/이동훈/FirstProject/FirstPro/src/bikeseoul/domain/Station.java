package bikeseoul.domain;

public class Station {
	private String district;
	private String name;
	private String address;
	private String holder;
	
	public Station() {}
	
	public Station(String district, String name, String address, String holder) {
		super();
		this.district = district;
		this.name = name;
		this.address = address;
		this.holder = holder;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	

	@Override
	public String toString() {
		return "지역구=" + district + ", 이름=" + name + ", 주소=" + address
				+ ", 거치대 수=" + holder;
	}

}
