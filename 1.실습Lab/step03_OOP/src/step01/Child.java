package step01;

public class Child extends Parent{
	String job;
	
	Child(){
		super("창윤", 28) ;//Object -> Parent(name, age) -> Child(job)
		System.out.println("자식의 기본 생성자");
	}
	//재정의
	public void printAll() {
		super.printAll();
		System.out.println(job);
	}
	public static void main(String[] args) {
		//step02 - 다형성 
		Parent p = new Child();
		p.name = "윤길";
		//p.job = "IT man"; //문법 오류
		//자식만의 멤버에 access를 위한 필수 문법 - 객체간의 형변환
		Child c2 = (Child)p;
		c2.job = "IT man";
		p.printAll();
		
		System.out.println("-----------------");
		//step01 - 상속 관계의 객체 생성 학습
	/*	Child c = new Child();
		System.out.println(c.name);
		c.name = "상만";
		System.out.println(c.name);
		c.printAll();*/
	}

}
