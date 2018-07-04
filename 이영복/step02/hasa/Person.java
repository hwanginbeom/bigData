package step02.hasa;

public class Person extends Car{
	Car myCar = new Car();
	String name = "ÀÌ¿µº¹";
	public Car getMyCar() {
		return myCar;
	}
	public void setMyCar(Car myCar) {
		this.myCar = myCar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void printName() {
		System.out.println(name);
	}
}
