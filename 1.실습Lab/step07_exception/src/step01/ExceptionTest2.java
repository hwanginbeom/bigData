/* 학습내용
 * 1. 예외 처리 문법 익숙해지기
 * 	2. 처리 문법
 * 		1. try~catch
 * 			- 예외가 발생될 수도 있는 가능성 있는 로직 자체에 직접 처리 
 * 		2. throws
 * 			- 예외 발생시 예외 처리를 호출한 곳으로 위임
 * 		3. 예외 발생 여부와 무관하게 100% 실행 보장 블록
 * 			- 자원 반환 로직 등에 권장
 * 			- DB접속 자원 해제, 입출력(IO) 자원들 반환..에 주로
 * 			- try~catch~finally
 * 3. 사용자 발생 exception  */
package step01;

public class ExceptionTest2 {
	//step01 -  메소드 내부에서 예외 처리 
	static void m1() {
		try {//예외 발생 가능성 있는 코드들 영역
			Class.forName("step01.A");
		} catch (ClassNotFoundException e) {//해당 예외가 발생시 처리블록
			e.printStackTrace();//예외 발생시 상세 상황 파악 가능한 메소드
		}
	}
	//step02 - 예외 처리를 호출한 곳으로 위임
	static void m2() throws ClassNotFoundException {
		Class.forName("step01.A");
	}
	//step03 - 
	static void m3() {
		try {
			Class.forName("step01.Aㅂㄱ	ㅀㅈㅎ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외 발생 여부와 무관하게 100% 실행 보장");
		}
	}
	//step04 - 
	static String m4() {
		try {
			Class.forName("step01.A");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("미 존재하는 byte code입니다");
		}finally {
			System.out.println("예외 발생 여부와 무관하게 100% 실행 보장");
		}
		return "데이터 반환?";
	}
	
	public static void main(String[] args) {
		System.out.println(m4());
		/*m1();
		try {
			m2();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		m3();*/
	}
}








