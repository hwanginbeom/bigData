package step02.hasa;

public class Car extends Engine{
	Engine engine = new Engine();
	
	//engine 이름이 출력되는 메소드 개발
	void printEngineName( ) {
		System.out.println(engine.getEngineName());
	}
	//engine의 기본 cc만 출력
	void printCC() {
		System.out.println(engine.getCc());
	}
	
}
