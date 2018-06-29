/*작품 내용
 *  1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 *  2. 반복, 조건등에 대한 연습이 될 수 있는 하나의 lab 개발
 *  3. 마음: 내 짝꿍을 생각하는 마음... 
 */ 
package step01.syntax;

public class Step10MyArt {

	public static void height1(int height) {
	
		if (height >= 190) {
			System.out.println("Big guy");
		} else if (height >= 180) {
			System.out.println("Cool guy");
		} else if (height >= 170) {
			System.out.println("Nice guy");
		} else if (height >= 160) {
			System.out.println("Good guy");
		} else {
			System.out.println("Angel");
		}
	}	

	public static void main(String[] args) {
		height1(158);
		 
		}}
