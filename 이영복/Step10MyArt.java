/*
 * 작품 내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건등에 대한 연습이 될 수 있는 하나의 lab개발
 * 3. 내 짝꿍을 생각하는 마음....
 */

package step01.syntax;

import java.util.Scanner;

public class Step10MyArt {
	
	public static void FindNumber(int choice, int a) {
		if(choice == 1) {
			System.out.println("홀수를 찾는 프로그램입니다.");
			System.out.print("해당하는 수까지의 홀수 : ");
			for(int i = 1; i <=a; i++) {
				if(i%2 == 1) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
		}
		if(choice == 2) {
			System.out.println("짝수를 찾는 프로그램입니다.");
			System.out.print("해당하는 수까지의 짝수 : ");
			for(int i = 1; i <=a; i++) {
				if(i%2 == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
		}
		if(choice == 3) {
			int num, i, count;
			System.out.println("소수를 찾는 프로그램입니다.");
			System.out.print("해당하는 수까지의 소수 : ");
			for(num=2; num<a; num++) {
				count = 0;
				for(i=2; i<num; i++) {
					if(num%i == 0)
						count++;
				}
				if(count == 0)
					System.out.print(i + " ");
			}
			System.out.println("");
		}
	}
	
	
	public static void SelectCalculator(int choice, int a, int b) {
			int result;
			if(choice == 1) {
				result = a+b;
				System.out.println("해당 프로그램은 '+' 입니다.");
				System.out.println("a + b : " + result);
			}
			else if(choice ==2) {
				result = a-b;
				System.out.println("해당 프로그램은 '-' 입니다.");
				System.out.println("a - b : " + result);
			}
			else if(choice ==3) {
				result = a*b;
				System.out.println("해당 프로그램은 '*' 입니다.");
				System.out.println("a * b : " + result);
			}
			else if(choice ==4) {
				result = a/b;
				System.out.println("해당 프로그램은 '/' 입니다.");
				System.out.println("a / b  : " + result);
			}
			else if(choice == 5) {
				result = a%b;
				System.out.println("해당 프로그램은 '%' 입니다.");
				System.out.println("a % b  : " + result);
			}
			else {
				System.out.println("* Error * 정확한 값을 입력해주세요.");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("====================================================================");
		System.out.println("원하는 프로그램을 선택해주세요 < 1: 계산기 2: 원하는 수 찾기 >");
		int pro = scan.nextInt();
		if(pro == 1) {
			while(true) {
				System.out.println("====================================================================");
				System.out.println("원하는 프로그램을 선택해주세요 < 1: 덧셈 2: 뺄셈 3: 곱셈 4: 나눗셈 5: 나머지 계산   * 0 입력시 종료 >*");
				int select = scan.nextInt();
				if(select == 0) {
					System.out.println("해당 프로그램은 종료되었습니다.");
					System.out.println("====================================================================");
					break;
				}
				else {
					System.out.println("해당 항목에 사용할 두 수를 입력해주세요 :  ");
					int p = scan.nextInt();
					int q = scan.nextInt();
					SelectCalculator(select,p,q);
				}
			}
		}
		else if(pro == 2) {
			while(true) {
				System.out.println("====================================================================");
				System.out.println("원하는 프로그램을 선택해주세요 < 1: 홀수 출력 2: 짝수 출력 3: 소수 출력   * 0 입력시 종료 * >");
				int select = scan.nextInt();
				if(select == 0) {
					System.out.println("해당 프로그램은 종료되었습니다.");
					System.out.println("====================================================================");
					break;
				}
				else {
					System.out.println("해당 항목에 사용할 수를 입력해주세요 :  ");
					int p = scan.nextInt();
					FindNumber(select, p);
				}
			}
		}
	}

}
