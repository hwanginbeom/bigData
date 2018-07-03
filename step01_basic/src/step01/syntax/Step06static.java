/* 학습내용
 * 1. static 키워드 
 * 2. 적용 문법
 * 		1. 멤버 변수 선언구
 * 			- 생성되는 모든 객체들이 공유하는 변수
 * 				: 공유 자원이 아닌 변수들에 사용 금지
 * 			- static 변수가 메모리에 실제 사용 가능하게 
 * 			  생성되는 시점은?
 * 				: 실행 코드인 byte code가 메모리에 
 * 				  로딩(저장)될때 자동 실행
 * 			
 * 		2. 메소드 선언구 
 * 			- 객체 생성없이 클래스명만으로 메소드 호출 가능
 * 		3. static{}
 * 			- web server가 시작될때 모든 user가 공유하는 
 * 			  자원이 있다면 단 한번 실행 보장을 할수 있는 문법
 * 			  이름이 없음 따라서 코드로 호출 불가
 * 			- byte code가 메모리에 로딩될때 자동 실행 
 */
package step01.syntax;

public class Step06static {
	//step02 - static 변수
	static int no = 100;
	static String msg = "문자열";
	
	//instance 변수
	int no2 = 200;
	String msg2 = "문자열 2";
	
	void m1() {
		System.out.println("일반 메소드");
	}
	//객체 생성없이도 class명.m2() 또는 동일한 클래스라면 m2(); 호출 가능
	static void m2() { 
		System.out.println("static 메소드");
	}
	//>java Step06static       Step06static.main();
	public static void main(String [] args) {
		m2();
		Step06static.m2();
		
		Step06static s = new Step06static();
		System.out.println(s.no2);
		
		System.out.println(no);//100
		System.out.println(msg);//문자열
		
		System.out.println(Math.random());
		
		//java.lang.Integer의 메소드 호출
		//"3" -> int로 변환하는 메소드 호출해서 변환하기
		/* 필요한 데이터 - int로 변경할 문자열 데이터
		 * 결과 데이터 - int로 변환된 데이터
		 * 
		 * 이 로직을 어떤 클래스에서 제공할 것인가?
		 * 		String? Integer?
		 * 		혹 문자열 데이터를 제외한 메소드를 보유한 객체가 필요한가?
		 * 
		 *byte : Byte 
		 *		- public static byte parseByte(String v){}
		 */
		int no3 = Integer.parseInt("3");
		System.out.println(no3);
	}
	
	//step01 - static{}
	/*static {
		System.out.println(1);
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
	static {
		System.out.println(2);
	}*/

}
