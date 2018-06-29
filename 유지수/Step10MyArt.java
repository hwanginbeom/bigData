//작품내용
//1.오늘 배운 내용에 하해서 3개의 메소드를 개발
//2.반복, 조건등에 대한 연습이 될 수 있는 하나의 lab개발
//3.마음 : 내 짝궁을 생각하는 마음...

package step01.syntax;

public class Step10MyArt {

	// 구구단 출력하기 2*1=2 형식
	public static void m1() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}

	}

	// if문: value의 값이 10이상 100미만이면 성공 출력/ 아니면 실패 출력
	public static void m2(int value) {

		if (value >= 10 && value < 100) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}

	}

	// while과 if문 혼합사용
	// 변수 value의 값을 하나씩 증가시키면서 10이상이 되면 성공을 출력(value의 초기값은 1)
	public static String m3() {

		int value = 1;
		while (true) {
			System.out.print(value);
			if (value == 10) {
				return "성공";
			} else {
				value++;
			}

		}
	}

	public static void main(String[] args) {

		System.out.println("<1번>");
		m1();
		System.out.println("<2번>");
		m2(20);
		System.out.println("<3번>");
		System.out.println(m3());
	}

}
