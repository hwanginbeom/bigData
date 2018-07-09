/* 작품 내용
 * 1. 오늘 배운 내용에 한해 2~3개의 메소드를 개발
 * 2. 반복, 조건 등에 대한 연습이 될 수 있는 하나의 lab개발
 * 3. 마음: 내 짝꿍을 생각하는 마음...
 */


package step01.syntax;

public class Step10MyArt {
	//메소드 1 , 쉬는 시간에 같이 나가는 인원에 따른 짝궁의 행동 연구
	public static String getRest(int people) {
		String retPeo = "cigarettes";
		
		if( people >=4) {
			retPeo ="cigarettes";
		
		} else if (people>=2) {
			retPeo= "water";
		
		} else {
			retPeo= "toliet";
		}
		return retPeo;		
	}
	//메소드 2 , 별 감소하기
	public static void forTest1() {
		char star='*';
		for(int lineCount = 1; lineCount <=5; lineCount++ ) {
			for(int starCount=5; starCount>=lineCount; starCount--) {
				System.out.print(star);
			}
			System.out.println();
		}
	}
	//메소드 3, 1,2번째 줄은 *, 3~5번째줄 # 찍기
	public static void whileTest() {
		int no =1; 
		while(no<6) { 
			char star='*';
			char star2='#';
			
			if(no>=4) {
				System.out.println(star);
				
			} else if (no<4) {
				System.out.println(star2);
			
						}
			no++; 
		}
	}
	public static void main(String[] args) {
		System.out.println(getRest(5));
		System.out.println(getRest(2));
		System.out.println(getRest(1));
		forTest1();
		whileTest();
	}

}
