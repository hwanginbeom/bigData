/*작품 내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건 등에 대한 연습이 될 수 있는 하나의 lab 개발
 * 3. 마음: 내 짝꿍을 생각하는 마음...
 * 
 * */

package step01.syntax;

import java.util.Scanner;

public class Step10MyArt {
	
	public static void cal(char operator, int a, int b) {
		int result=0;
		if(operator == '+') {
			result = a+b;
		}else if(operator == '-') {
			result = a-b;
		}else if(operator == '*') {
			result = a*b;
		}else if(operator == '/') {
			if(b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				result = a/b;
			}
		}else {
			System.out.println("사칙연산 기호(+,-,*,/)를 입력해주세요.");
		}
	
		System.out.println(a+" "+operator+" "+b+" = "+result);
	}
	
	
	public static void avg(int n) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum = 0;
		double result;
		
		System.out.print("숫자 입력("+n+"개): ");
		for(int i=0; i<n; i++) {
			num = sc.nextInt();
			sum = sum+num;
		}
		result = sum/n;
		System.out.println("의 평균값은 "+result+"입니다.");
	}
	public static void main(String[] args) {
		System.out.println("-----사칙연산-----");
		cal('-',5,2);
		System.out.println("-----평균구하기-----");
		avg(5);
		
	}

}
