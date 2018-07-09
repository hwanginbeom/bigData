/* 학습내용
 * 1. 객체간에 멤버로 사용(포함)되는 관계를 "has a" 관계
 * 2. 발음
 * 		has a [해즈어, 해저]
 * 
 * 3. 참고
 * 		 - 상속은 is a[이즈어, 이저] 로 표현
 * 		 - 즉 속성(데이터)들이 동일한 경우에만 상속 권장
 * 		예시 : 직원 클래스와 고객 클래스 간에는 상속 비추 
 */
package step02.hasa;

public class HasATest {

	public static void main(String[] args) {
		//String -> Engine -> Car -> Person & String
		/* 두 사람의 즉 개별 Person 객체 생성
		 * ? 엔진이름, cc, Person의 이름을 다 수정하시고 출력  */
		Person p1 = new Person();
		Person p2 = new Person();
		
		/* p1.myCar.engine.setEngineName("A엔진")
		 * p1 - Person 객체
		 * p1.myCar - Car 객체 
		 * p1.myCar.engine - Engine 객체
		 * p1.myCar.engine.setEngineName() - Engine객체의 메소드 */
		p1.myCar.engine.setEngineName("A엔진");
		p1.getMyCar().engine.setCc(10000);
		
		System.out.println(p1.myCar.engine.engineName);
		/* p1.myCar.engine.engineName
		 * A엔진 의 데이터 중에서 A라는 첫 음절의 char 데이터만 착출
		 * 출력
		 * 
		 * engineName 타입 String
		 * String 클래스에서 index값으로 char를 반환
		 * String API 	 */
		char v = p1.myCar.engine.engineName.charAt(0);
		System.out.println(v);
		//System.out.println(p1.myCar.engine.engineName.charAt(0));
	}
}










