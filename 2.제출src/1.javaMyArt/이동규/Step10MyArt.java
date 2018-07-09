/*
 * 작품 내용
 * 1. 오늘 배운 내용에 한해서 2~3개의 메소드를 개발
 * 2. 반복, 조건 등에 대한 연습이 될 수 있는 하나의 lab 개발
 * 3. 마음 : 내 짝꿍을 생각하는 마음...
 * 
 * 제목 : 운중이 형 건강관리 프로젝트
 * 
 * 끝이 1,3,5,7,9인 날(홀수일)에는 해당 갯수만큼 흡연 가능, 짝수일 (2,4,6,8,0)은 흡연 불가.
 * 단, 주말은 자유롭게 흡연 가능
 * 
 * 먼저 짝수일과 홀수일을 메인메소드 안의 새롭게 만들어 낸 argument에서 받아들였을 때 
 * 
 */

package step01.syntax;

public class Step10MyArt {
	
	
	
	public static void smokeDays() {				
		for (int i =0; i<=30; i++) {
			
			int sunday = 7*i +3;
			int saturday = 7*i+2;
			int smoke = 2*i+2;
			int nonsmoke = 2*i+1;
			
			String ycs = "Smoke Free Boy!!";
			String nosmke = "Don't Smoke Today Boy!!";
			String ycsn = "오늘 날짜 첫자리 숫자만큼 피우실 수 있어요";//이거 숫자 프로그래밍으로 자동화 못하나
			
			if (sunday==3 || sunday== 10 ||  sunday==17 || sunday==24||saturday==2||saturday==9||saturday==16||saturday==23||saturday==30) 
			{System.out.println(i+"일은"+"휴일!" + ycs);}
			else {i+"일은"+
				}
			else if(smoke) {
				System.out.println(i+"일은"+ nosmke );
				}
		}
	

	public static void main(String[] args) {
			smokeDays();
		}	
	
	}

}
