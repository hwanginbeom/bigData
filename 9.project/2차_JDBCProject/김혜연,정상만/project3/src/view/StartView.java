package view;

import java.util.Scanner;

import controller.Controller;
import model.domain.RestaDTO;

public class StartView {
	public static void main(String[] a) {
		Controller controller = Controller.getInstance();

	/* 		모든 검색
		 controller.getRestaAll();
		 하나 검색
		 controller.getAddress("강서구");
		 controller.getCategory("양식");
		 insert
		 controller.insert(new RestaDTO("김가네 맛있는 상상", "한식", "분식 & 김밥", "서울시 강남구 역삼동
		 444-666", "11:00 ~ 12:00" , "월~토 휴일" , "02-444-4444", "주차가능", "10% 할인" ) );
		 delete
		 controller.delete("서울시 강남구 역삼동 444-666");
	* 
	*/

		Scanner scan = new Scanner(System.in);

		System.out.println("***현재 위치를 입력하세요 (ex : 동작구) : ");
		String ad = scan.next();
		System.out.println("***원하시는 메뉴를 선택하세요 [한식, 양식, 중식, 일식] : ");
		String cg1 = scan.next();
		System.out.println("***입력하신 위치 주변의 디저트샵이나 카페, 공공장소등의 정보도 원하십니까? (Y/N) : ");
		String cg2 = scan.next();
		
		if (cg2.equals("Y")) {
			System.out.println("\n\n----------(@ RESTAURANT INFORMATION @)----------");
			controller.getAddcat(ad, cg1);
			System.out.println("\n----------(@ CAFE INFORMATION @)----------");
			controller.getAddcat(ad, "카페");
		} else if (cg2.equals("N")) {
			System.out.println("----------(@ RESTAURANT INFORMATION @)----------");
			controller.getAddcat(ad, cg1);
		} else {
			System.out.println("Y 또는 N 만 입력 가능합니다. 다시 실행하십시오.");
		}

	}
}
