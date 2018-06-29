/* 학습내용
 * 1. 반복문
 * 		1. for : 반복 횟수가 명확할때 주로 사용 
 * 				    조건식이 true인 경우만 실행
 * 		2. while : 무한 루프, 반복횟수가 불명확할 때 주로 사용
 * 					조건식이 true인 경우만 실행
 * 		3. do~while : 반복횟수가 불명확할 때 주로 사용, 
 * 							 무조건 1번 이상 실행해야 할 경우 권장 */

package step01.syntax;

public class Step08Loop {
	//for - 1~5출력, 키보드의 tab과 동일한 키보드 "\t"
	/* 1~5까지 가변적인 데이터 보유하게 되는 변수
	 * 1~ 1씩 증가시키는 로직
	 * 변수값이 5와 비교해서 6이라면 종료...즉 조건식
	 * for(초기식; 조건식 ; 증감식){
	 *    조건식이 true인 경우 실행되는 블록
	 * }
	 *  */
	public static void forTest() {
		for(int i=1; i <= 5; i++) {  //i = i+1; 동일한 문장
			System.out.print(i + "\t");
		}
	}
	public static void forTest2() {
		for(int i=1; i <= 5; i++) {  
			System.out.print('*' + "\t");
		}
	}
	//반복하는 수 만큼 데이터 적재(누적, 저장)해서 출력
	public static void forTest3() {
		char star = '*';
		String star2 = "";
		for(int i=1; i <= 5; i++) {  
			star2 = star2+star;  
			System.out.println(star2);
		}
	}
	public static void forTest4() {
		char star = '*';
		//다섯 라인을 실행하기 위한 반복문
		for(int lineCount=1; lineCount <= 5; lineCount++) {
			//한 라인에서 별을 찍기 위한 실행 반복문
			for(int starCount=5; starCount >= lineCount; starCount--) {
				System.out.print(star);		
			}//end of inner for
			System.out.println();
		}//end of out for
	}
	public static void forTest5() {
		char star = '*';
		String star2 = "";
		for(int lineCount=1; lineCount <= 5; lineCount++) {
			for(int starCount=5; starCount >= lineCount; starCount--) {
				star2 = star2+star;	
			}//end of inner for
			System.out.println(star2);
			star2 = "";//초기화 필수
		}//end of out for
	}
	
	//while
	public static void whileTest() {
		int no = 1;
		while(no < 6) {
			System.out.print(no + "\t");
			//no = no+1;
			no++;
		}
	}
	//do~while
	public static void doWhileTest() {
		int no = 1;
		do{
			System.out.print(no + "\t");
			no++;
		}while(no < 6);
	}
	
	public static void main(String[] args) {
		whileTest();
		System.out.println();
		doWhileTest();
		
		
		//step01 - for
	/*	Step08Loop.forTest();
		System.out.println("\n--- 2. * 찍기");
		forTest2();
		System.out.println("\n--- 3. * 누적찍기");
		forTest3();
		System.out.println("\n--- 4. * 거꾸로 찍기");
		forTest4();
		System.out.println("\n--- 5. * 거꾸로 찍기");
		forTest5();*/
		
		
	}

}
