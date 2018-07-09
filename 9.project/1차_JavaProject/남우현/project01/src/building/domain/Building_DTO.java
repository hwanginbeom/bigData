package building.domain;//빌딩 정보

public class Building_DTO {
	private	String name;
	private int	age;
	private int price;
	private int	sqm;
	public Building_DTO(String name, int age, int price, int sqm) {
		//super();
		this.name = name;
		if(age>0) {
			this.age = age;
		}
		this.price = price;
		this.sqm = sqm;
		
		
	}
	public String getName() {//함부로 내용을 바꾸지 못하도록 방지하는 메소드
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSqm() {
		return sqm;
	}
	public void setSqm(int sqm) {
		this.sqm = sqm;
	}
	@Override
	public String toString() {//원래는 위치값이 출력되는데 이걸 내용값으로 받아주는 메소드
		return "Building_DTO [name=" + name + ", age=" + age + ", price=" + price + ", sqm=" + sqm + "]";
	}

	
}
