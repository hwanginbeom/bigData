/*작품 내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건 등에 대한 연습이 될 수 있는 하나의 lab 개발
 * 3. 마음: 내 짝궁을 생각하는 마음..
 */



package step01.syntax;

public class Step10MyArt {
	
	public static int proPrecipit(int humRate) {//습도와 강수확률
		int humRate1 = 10;
		int proPrecipit = 0;
		if(humRate1>=50) {
			proPrecipit=90;
		}else if(humRate1>=40) {
			proPrecipit = 80;
		}else if(humRate1>=30) {
			proPrecipit=70;
		}else {
			proPrecipit=60;
		}
				
		return proPrecipit;
	}
	

	public static int oddPlus() { //15까지 홀수 더하기
		int oddSum=0;
		for (int i=1; i<15; i++) {
			if (i%2==1) {
				oddSum=oddSum+i;
			}
			
		}
		return oddSum;
	}

	
	
	
	public static void main(String[] args) {
			//System.out.println(proPrecipit(50));
			System.out.println(oddPlus());
	}

}
