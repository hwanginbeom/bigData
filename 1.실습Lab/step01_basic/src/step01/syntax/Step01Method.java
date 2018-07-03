/* 학습내용
 * 1. 메소드 구현(개발, 만들기)
 * 		- 사칙연산 로직으로 test
 * 2. 메소드 호출(사용)
 * 3. 구현 위치
 * 		- class 영역 내에서만 개발 가능
 * 		- 메소드 내부에 메소드 구현 불가 
 * 		- 메소드 내부에서 다른 메소드 호출 가능 
 * 4.기본 문법(*)
 * 	- 반환타입 메소드명( [arguments] ){ [로직] }
 * 	- 반환값 타입에 맞게 반환타입 설정
 * 	- 반환값 없는 메소드인 경우 반환 타입에 void로 선언
 * 5. 참고
 * 	- 생성자와 문법 비교
 * 		생성자 문법 : 클래스명([arguments] ){ [로직] }
 */
package step01.syntax;

public class Step01Method {
	public Step01Method() {}
	public int sum(){
		return 3+5;
	}
	public int sum(int no1, int no2){
		return no1 + no2;
	}
	public void sum(int no1, int no2, int no3){
		System.out.println(no1 + no2 + no3);
	}
	public static void main(String[] args) {
		Step01Method s = new Step01Method();
		int v1 = s.sum();
		System.out.println(v1);
		System.out.println(s.sum(100, 200));
		System.out.println("eee");
		s.sum(3, 5, 6);
	}
}



















