/* 작품 내용
 * 	1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건 등에 대한 연습이 될 수 있는 하나의 lab 개발
 * 3. 마음 : 내 짝꿍을 생각하는 마음...
 */

package step01.syntax;

import java.util.Date;

public class Step10MyArt {

	public static String timeclassify(int hr) {
		String Hr = "쉬는시간";
		if (hr >= 7 && hr <= 9) {
			Hr = "등교시간";
		} else if (hr >= 9 & hr <= 11 || hr >= 13 & hr <= 18) {
			Hr = "수업시간";
		} else if (hr >= 12  & hr <= 13) {
			Hr = "점심시간";
		} else if (hr >= 19 & hr <= 22) {
			Hr = "치맥시간";
		} else {
			Hr = "쉬는시간";
		}
		return Hr;
	}
	
	public static void makeStar() {
		String star = "*";
		for(int l=1; l<= 5; l ++) {
			if (l==1) {
			star = "   *   ";
			} else if (l==2) {
			star = "  **  ";
			} else if (l==3) {
			star = "*****";
			} else if (l==4) {
			star = " *** ";
			} else if (l==5) {
			star = " *  * ";
			}
		System.out.println(star);
			}
		}
	
	public static void main(String[] args) {
		Date date = new Date();		
		System.out.println("지금은 무슨시간? 현재 시간에 맞춰서 업데이트됨");
		System.out.println("지금은 " + timeclassify(date.getHours()));
		System.out.println("\n"+"별을 만들어보자");
		makeStar();
	}

}
