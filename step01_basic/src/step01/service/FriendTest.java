package step01.service;

import step01.domain.FriendVO;

public class FriendTest {
	//java program의 start point 필수 메소드
	public static void main(String [] a) {
		FriendVO p1 = new FriendVO();
		System.out.println(p1.name + " " + p1.cellPhone + " " + p1.age);
		
		FriendVO p2 = new FriendVO();
		p2.name = "이영복";
		p2.cellPhone = "000-1111-0000";
		p2.age = 26;
		System.out.println(p2.name);
		
		FriendVO p3 = new FriendVO("김혜경", "000-1111-0000", 25);
		System.out.println(p3.name);
	}//end of main
}//end of class




