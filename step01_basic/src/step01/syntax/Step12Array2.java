/* 학습내용
 * 1. 배열 타입을 이용한 응용력 향상
 * 2. String 데이터값 비교하기
 * 		 - public boolean equals(String v){문자열 비교}
 * 3. 동등비교 연산자
 * 		==
 * 		1. 기본 타입 : 순수 값비교
 * 		2. 객체 타입 : 주소값(위치) 비교 
 */
package step01.syntax;

import step01.domain.PeopleDTO;

public class Step12Array2 {
	//문자열 비교 
	public static void equalsTest(String v) {
		String id = "tester";
		System.out.println(id.equals(v));
	}
	//== 동등 비교 연산자로 기본 타입 비교
	public static void operator(int i) {
		int data = 10;
		System.out.println(data == i);
	}
	
	//== 객체 타입 비교 : 주소값 비교
	/*p.getName().equals( dto.getName() )  실행순서
	 * p : PeopleDTO
	 * p.getName() : PeopleDTO의 name String 값 반환된 로직
	 * p.getName().equals() : String의 equals() 호출만 
	 *  dto.getName() : dto의 getName() 즉 name변수값 획득
	 *  dto.getName() 의 결과값이 확실히 반환되면 equals() 실행
	 */
	public static void operator(PeopleDTO dto) {
		PeopleDTO p = new PeopleDTO("name", 10);
		System.out.println(p == dto);
		System.out.println(p.getName().equals( dto.getName() ) );
		
		//p.getName().equals( dto.getName() ) 와 동일한 코드
		String name = p.getName();
		String name2 = dto.getName();
		name.equals(name2);
	}

	//배열의 length 변수 사용 연습 - 5개를 반복문을 써서 출력
	public static void lenghtTest() {
		int [] i = {1, 4, 65, 7, 8};
		for(int index=0; index < i.length; index++) {
			System.out.print(i[index] + "\t");
		}
	}
	
	public static void main(String[] args) {
		equalsTest("tester");//true
		equalsTest("e");//false
		operator(10);//true
		operator(3);//false
		operator(new PeopleDTO("name", 10));//false
		lenghtTest();
		

		
		
	}
}







