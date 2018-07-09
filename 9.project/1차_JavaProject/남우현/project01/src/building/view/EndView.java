package building.view;

import java.util.ArrayList;

import building.domain.Building_DTO;


public class EndView {

	
	//하나만 검색 할 때
	public static void printOne(Building_DTO one) {
		System.out.println(one.toString());
	}
	
	
	// 바뀐 정보가 있을때
	public static void printMsg(String msg) {
		System.out.println(msg);
		
	}
	
	public static void printMsg() {//정보가 없을 때
		System.out.println("요청하신 정보가 미 존재합니다.");
	
	}
		
	//print all
	public static void printAll(ArrayList<Building_DTO> all) {
		for (int i = 0; i < all.size(); i++)
			System.out.println(all.get(i));

	}



}
