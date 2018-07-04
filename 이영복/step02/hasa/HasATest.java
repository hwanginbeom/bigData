/*
 *  학습내용
 *  1. 객체간에 멤버로 사용(포함)되는 관계를 "has a" 관계라고 한다.
 *  2. 
 *  3. 참고
 *  	- 상속은 is a 로 표현
 *   	- 즉 속성(데이터)들이 동일한 경우에만 상속 권장
 *   	예시 : 직원 클래스와 고객 클래스 간에는 상속 비추
 */


package step02.hasa;

public class HasATest extends Person{

	public static void main(String[] args) {
		//String -> Engine -> Car -> Person & String
		/*
		 * 두사람의 즉 개별 Person 객체 생성
		 * ? 엔진이름, cc, Person의 이름을 다 수정하시고 출력
		 */
		/* =====================================*/
		Person p1 = new Person();
		Person p2 = new Person();
		/* =====================================*/ 
		System.out.println("===Person 1의 Car 정보===");
		p1.printEngineName();
		p1.printCC();
		p1.printName();
		/* =====================================*/
		p2.setEngineName("파워엔진2");  //엔진이름, CC, Person의 이름 수정
		p2.setCc(5000);
		p2.setName("김경남");
		/* =====================================*/
		System.out.println("===Person 2의 Car 정보===");
		System.out.println(p2.getEngineName());
		System.out.println(p2.getCc());
		System.out.println(p2.getName());
		/* =====================================*/
		p2.printEngineName();
		p2.printCC();
		p2.printName();
	}
}
