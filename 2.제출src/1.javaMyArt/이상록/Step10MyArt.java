/* 작품 내용
 * 1. 오늘 배운 내용에 한해서 2~3개의 메소드를 개발
 * 2. 반복, 조건등에 대한 연습이 될수 있는 하나의 lab 개발
 * 3. 마음 : 내 짝꿍을 생각하는 마음
 * 
*/

package step01.syntax;

public class Step10MyArt {
	public static void a(int sleep) {
		if(sleep<=4) {
			System.out.println("잠이 부족합니다.");
		}
		else if(sleep<10) {
			System.out.println("잠이 충분합니다");
		}
		else {
			System.out.println("잠을 줄여야합니다");
		}
	}
	public static void b() {
		System.out.println("구구단:");
		for(int i=1;i <=9; i++) {
			for(int j=1;j <=9;j++) {
				System.out.print(i+" * "+j+"="+(i*j)+"\t");
				}
			System.out.println();
			}
	}
	public static void c() {
		System.out.println("어떤 일을 성공하기 위해서는 어느정도의 회수이상의 노력이 필요하다");
		int study=0;
		for(int lecture=1; lecture<10; lecture++) {
			while(study<10) {
				study++;
				if(lecture+study>10) {
					System.out.println("수업회수 : "+lecture+"공부회수 : "+study+"\n성공할 만큼 노력을 하였다.");
					}
				else{
									
					}
				}
			study=0;
			}
	}

	public static void main(String[] args) {
		a(8);
		System.out.println("------------------------------------");
		b();
		System.out.println("------------------------------------");
		b();

		
		
	}

}
