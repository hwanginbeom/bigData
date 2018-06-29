/* 작품 내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건등에 대한 연습이 될 수 있는 하나의 lab 개발  
 * 3. 마음
 */
package step01.syntax;

public class Step10MyArt {
	
	public static String getConc(int value) {
		
		String Accept="적합.";
		if(value>=65) {
			Accept="적합.";
		}else { Accept="부적합.";
				}
		return Accept;
	}

	public static String getHealth(int value2) {
		
		String Good="청신호.";
		if(value2>=70) {
			Good="청신호.";
		}else if(value2>=55) {
			Good="황신호.";
		}else {
			Good="적신호.";
		}
		return Good;
	}
	
	public static void cryList(int value, int value2, int list) {
			System.out.println(list + "번 환자");
			System.out.print("대상자 :" + " "+ getConc(value));
			System.out.print("  지난 검진 결과 :" + " " + getHealth(value2));
			
	}

	public static void cryRemark(String human, String sign) {
		if(human=="적합" && sign=="청신호") {
			System.out.println("***본 환자분은 귀가조치 하시기 바랍니다.");
		}else if(human=="적합" && sign=="적신호") {
			System.out.println("***본 환자분은 치료를 위한 입원을 권장합니다.");
		}else if(human=="적합" && sign=="황신호") {
			System.out.println("***본 환자분은 의약품 처방 후 귀가 조치 하시기 바랍니다.");
		}else {
			System.out.println("\n***4시간 후 재 검진을 지시하십시오.");
		}
	}
	
	public static void main(String[] args) {
		
		cryList(64,35,666);
		cryRemark("부적합","적신호");
	}

}
