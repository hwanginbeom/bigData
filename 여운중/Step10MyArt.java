/* 작품 내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건등에 대한 연습이 될수 있는 하나의 lab 개발
 * 
 * */
//1
package step01.syntax;

public class Step10MyArt {

	public static String job(double value) {
		String retVal = "AA";
		if(value >= 4) {
			retVal = "취업";
		}else if(value >= 3) {
			retVal = "취업가능";
		}else if(value >= 2) {
			retVal = "심각함";
		}else {
			retVal ="빠른 창업 추천";
		}
		return retVal;
	}

	public static void main(String[] args) {
		System.out.println(job(1.4));
		
		
	}

}
	
