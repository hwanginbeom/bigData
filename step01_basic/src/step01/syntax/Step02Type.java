/* 학습 내용
 * 1. 기본 syntax 복습
 * 2. 변수 생성(선언), 변수 초기화(값 대입)
 *     메소드 생성(구현), 메소드 호출
 *     생성자 구현, 생성자 호출
 * 3. 각 구성 요소의 용도
 * 		1. 변수 - 데이터 표현
 *     2. 메소드 - 다양한 처리 기능 구현
 *     		 반환타입 메소드명( [] ){[..]}
 *     3. 생성자 - 객체 생성시 호출되는 필수 구성 요소
 */
package step01.syntax;

public class Step02Type {
	//황인범, 27
	String name;
	int age;
	public Step02Type() {}//기본 생성자
	
	//Step02Type 객체 반환 메소드 
	Step02Type getObject() {
		Step02Type s = new Step02Type();//객체 생성 문법
		return s;
	}
	Step02Type getObject2() {
		return new Step02Type();
	}
	public static void main(String[] args) {
		//step02 - 메소드 호출해서 객체 받아오기
		//클래스 내에 존재하는 변수, 메소드들을 실제 실행하기 위해서는
		//반드시 변수, 메소드를 보유한 객체 생성이 우선
		//? getObject() 호출해보기
		Step02Type s2 = new Step02Type();//s2는 0x라 가정
		Step02Type v = s2.getObject();//v는 0x주소값? 0x가 아닐까요?
		
		System.out.println(s2);
		System.out.println(v.age);
		
		
		//반장님 정보를 각 변수에 저장, 화면 콘솔창에 출력
		/* 1. 객체 생성 - new 생성자()
		 * 2. 생성한 객체를 참조하는 변수로 호출해서
		 *    각각의 name,age 변수에 값을 대입
		 * 3. 각 변수값 호출해서 출력   */
		//step01
		/*Step02Type s = new Step02Type();
		s.name = "황인범";
		s.age = 27;
		System.out.print(s.name);
		System.out.println(s.age);*/
	}

}






