/*작품내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건등에 대한 연습이 될 수 있는 하나의 lab개발
 * 3. 마음 : 내 짝꿍을 생각하느 마음... 
 */



package step01.syntax;

public class Step10Myart {
	public static String getAtdscore(int value) {	//질문// 이게 뭔지 많이 봤는데 읽는 법 모름
		String retval = "성실";
		
		if(value >=400) {
			retval = "성실";
		}else if(value >= 350) {
			retval = "착함";
		}else if(value >= 300) {
			retval = "노력했음";
		}else {
			retval = "노력필요";
		}
		return retval;	
}

	//while
	public static void whileGreeting() {
		int no = 1; 
		
		while(no<=6) {
			System.out.println("안녕나리얌권열오빠");
			no++;
		}
	}
	public static void main(String[] args) {
		System.out.println(getAtdscore(370));
		whileGreeting();
	}

}
