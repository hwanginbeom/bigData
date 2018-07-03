/* 학습내용
 * 1. 조건식
 * 	2. 문법
 * 		1. 조건 상황이 하나인 경우
 * 				if(조건식){}   		1번
 * 		2. 조건 상황이 다수인 경우
 * 				if(조건식){				1번
 * 				}else if(조건식2){	0~*번
 * 				}else if(조건식3){
 * 				}else if(조건식4){
 * 				}else{ 모든 조건식에 해당되지 않을 경우 }	 1번
 * 		3. 조건 상황들이 아닌 경우도 고려해야 하는 경우 
 * 				if(){}else{}
 */
package step01.syntax;

public class Step09If {
	public static char getGrade(int value) {//91
		char retVal = 'A';
		if(value >= 90) {
			retVal = 'A';
		}else if(value >= 80) {
			retVal = 'B';
		}else if(value >= 70) {
			retVal = 'C';
		}else {
			retVal = 'F';
		}
		return retVal;
	}
	
	public static char getGrade2(String value) {
		char retVal = 'A';
		int value2 = Integer.parseInt(value);
		if(value2 >= 90) {
			retVal = 'A';
		}else if(value2 >= 80) {
			retVal = 'B';
		}else if(value2 >= 70) {
			retVal = 'C';
		}else {
			retVal = 'F';
		}
		return retVal;
	}
	
	public static void main(String[] args) {
		System.out.println(getGrade(91));
		System.out.println(getGrade2("50"));
	}

}




