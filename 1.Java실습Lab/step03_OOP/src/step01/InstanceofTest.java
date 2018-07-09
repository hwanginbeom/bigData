package step01;

public class InstanceofTest {
	
	public static void main(String[] args) {
		//String 객체의 내용값 비교
		System.out.println("data".equals("data"));//true
		
		//Integer 객체의 내용값 비교
		Integer i = new Integer("3");
		Integer i2 = new Integer("33");
		System.out.println(i.equals(i2));//false
		//서로 다른 타입이긴 하나 equals()의 parameter가 Object
		/* java.lang.Object는 모든 객체 타입의 최상위
		 * 기본 타입 8가지를 제외한 모든 타입 다 수용 가능	 
		 * 데이터 타입
		 * 	1. 기본 타입
		 * 		- 정수,실수,문자,논리
		 * 2. 참조 타입
		 * 		- 기본 제외한 모든 타입
		 * */
		System.out.println(i.equals("문자열"));//false
		
		//1
		System.out.println(i.equals("3"));//false
		//2
		System.out.println("3".equals(i));//false
		//사용자 정의 객체의 내용값 비교
		
		
		//Object의 자식 String, Integer,...
		/* * 객체 타입 비교 연산자
		 * 1. instanceof
		 * 2. 제약조건 : 상속 관계에서만 비교 가능	 */
		System.out.println("string" instanceof Object);//true
		System.out.println("string" instanceof String);//t
		//String과 Integer은 상속 관계가 아님 따라서 비교 불가
		//	System.out.println("string" instanceof Integer);//t
		
		System.out.println("---- 재정의 ");
		AA a = new AA(5);
		AA a2 = new AA(15);
		System.out.println(a.equals(a2));//true
	}
}
class AA extends Object{
	int data;
	AA(){}
	AA(int d){
		data = d;
	}
	//객체의 주소값 비교했던 메소드를 내용값(변수값) 비교로 재정의
	/* AA 객체들 비교
	 * 1. AA 타입 여부 비교 - instanceof
	 * 2. AA 타입이 일치된다면 AA객체들이 보유한 
	 * 		멤버 변수값 비교
	 * 		Object 타입의 변수는 상속시킨 메소드만 호출
	 * 		자식만의 멤버를 호출하기 위해서는 형변환 필수  */
	public boolean equals(Object o) {
		if(o instanceof AA) {
			AA a = (AA)o;//data 멤버 변수 비교를 위한 형변환
			
			//이 메소드를 보유한 객체의 data 변수와
			//parameter로 유입된 객체의 data 변수 비교
			if(data == a.data) {
				return true;
			}
		}
		return false;
	}

}






