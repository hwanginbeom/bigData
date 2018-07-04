package step01.syntax;

import step01.domain.FriendVO;

public class Step03Type {

	public Step03Type(){}
	
	//FriendVO 반환 메소드
	FriendVO getInstance() {
		return new FriendVO();//0x
	}
	//FriendVO 를 메소드 parameter 로 반영하는 메소드 
	void m(FriendVO v) {//참조변수.m(FriendVO 객체);   0x
		System.out.println(2 + " ---- " + v.name);//황인범
		v.name = "손영정";
	}
	public static void main(String[] args) {
		Step03Type s = new Step03Type();
		FriendVO v2 = s.getInstance();//0x라 가정
		
		System.out.println(1+ " " + v2.name);//황인범
		s.m(v2);//0x
		System.out.println(3 + " " + v2.name);//손영정
	}
}









