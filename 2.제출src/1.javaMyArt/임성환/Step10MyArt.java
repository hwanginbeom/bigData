/* 작품내용
 * 1. 오늘 배운 내용에 한해서 3개의 메소드를 개발
 * 2. 반복, 조건등에 대한 연습이 될 수 있는 하나의 lab 개발
 * 3. 마음 : 내 짝꿍을 생각하는 마음...
 */


package step01.syntax;

public class Step10MyArt {
		public static String getAge(int age) {
			String retSchool = "직장인";
			if(age >= 0 & age<=4) {
				retSchool = "어린이집";
			}else if(age>=5 & age<=7) {
				retSchool = "유치원";
		}	 else if(age>=8 & age<=13) {
			    retSchool = "초등학교";
		}   else if(age>=14 & age<=16) {
			retSchool = "중학교";
		}	 else if(age>=17 & age <=19) {
			retSchool = "고등학교";
		}	 else if(age>=20 & age <=28) {
			retSchool = "대학생";
		}   else { retSchool = "학생이 아닙니다.";
		}   return retSchool;
	}   
	
		public static void present() {
			char star = '*';
			for(int i=1; i<=5; i ++) {
				if(i==2) {System.out.println(star+"\t"+star+"\t");
				}
				   else if(i==3){System.out.println(star+" "+star+" "+star+" "+star+"\t"+star);
			}	   else {System.out.println(star+"\t"+star+"\t"+star);
			
			}
				}
		}
					
	public static void main(String[] args) {
		System.out.println("나이에 맞는 학교");
		System.out.println(getAge(26));
		System.out.println(getAge(46));
		System.out.println("\n");
		present();
		System.out.println("안녕");
	}

}
