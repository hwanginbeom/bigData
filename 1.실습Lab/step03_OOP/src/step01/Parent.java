package step01;

public class Parent extends Object{
	String name;
	int age;
	
	public Parent() {
		super();//Object 객체가 생성
		System.out.println("부모의 기본 생성자");
	}//name, age 변수 공간이 사용 가능하게 heap 객체 내부에 생성
	//Parent 객체 생성 완료
	
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("부모의 생성자");
	}
	public void printAll() {
		System.out.println(name);
		System.out.println("1" + age);
	}
}





