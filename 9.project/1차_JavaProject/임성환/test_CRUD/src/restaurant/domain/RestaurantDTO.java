package restaurant.domain;

public class RestaurantDTO {
	private String guarantee;
	private String restaurantName;
	private String address;
	private String pNumber;

	public RestaurantDTO() {}
	
	public RestaurantDTO(String guarantee, String restaurantName, String address, String pNumber) {
		this.guarantee = guarantee;
		this.restaurantName = restaurantName;
		this.address = address;
		this.pNumber = pNumber;
	}
	
	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(guarantee);
		builder.append(", ");
		builder.append(restaurantName);
		builder.append(", ");
		builder.append(address);
		builder.append(", ");
		builder.append(pNumber);
		builder.append("]");
		//builder.append("\n");
		return builder.toString();
	}



	
}
