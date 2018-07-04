/*학습내용
 * 1. 객체 간에 멤버로 사용(포함)되는 관걔를 "has a"관계
 * 2. 발음
 * 		has a [해즈어, 해저]
 * 3. 참고
 * 		- 상속은 is a[이즈어,이저]로 표현
 * 		- 즉 속성(데이터)들이 동일한 경우에만 상속 권장
 * 		예시 : 직원 클래스와 고객 클래스 간에는 상속 비추
 * 
 */
package step02.hasa;

public class HasATest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Car c = p1.myCar;
		Engine e = c.engine;
		
		e.EngineName="고강도 파워 엔진";
		e.cc=200;
		
		p1.name="김정은";
		p2.name="트럼프";
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p1.myCar.engine.getEngineName());
		System.out.println(e.getEngineName());
		
		
		
		System.out.println("----강사님 답안-----");
		/*p1.myCar.engine.setEngineName("A")
		 *p1 - person 객체
		 *p1.myCar - myCar 객체
		 *p1.myCar.engine - Engine 객체
		 *p1.myCar.engine.setEngineName("A") 
		 * */
		System.out.println(p1.myCar.engine.setEngineName("A클라스"));
		
		
		
		//String -> Engine -> Car -> Person & String
		/*두사람의 즉 개별 Person 객체 생성
		 * 엔진이름, cc, Person의 이름을 다 수정하시고 출력
		 */
		

	}

}
