package step01.test;

public class Test {
	String message;//변수
	int age;//변수
	
	public Test() {}//생성자
	public Test(String m, int a) {
		message = m;
		age = a;
	}
	//? 객체 생성없이 message, age 사용 가능한 방법이 있나요?
	//없다
	public static void main(String[] args) {
		Test t = new Test("오늘은 비가 오네요", 46);
		System.out.println(t.message);
		System.out.println(t.age);
	}
}
/* 
 * 1. 컴파일 직후 자동 추가되는 코드는?
 * 		public Test() {}
 * 2. "오늘은 비가 오네요"..라는 데이터를 저장할수 있는
 *    변수를 선언
 * 3. 46 이라는 숫자 저장 가능한 변수 선언
 * 4. 객체 생성 시점에 가변적인 데이터로 변수값 저장
 * 	    할수 있는 parameter(argument,매개변수)가 있는 
 *    생성자 만들기
 * 5. "오늘은 비가 오네요", 46이라는 데이터로 
 * 		객체 생성 후 변수값 출력하기
 * 힌트 : 객체 생성 문법
 * 		타입 변수명 = new 생성자호출(..);
*/





