package view;

import java.util.ArrayList;

import model.domain.ApartDTO;

public class EndView {

	public static void errorMsg(String string) {
		System.out.println("비정상 실행 : "+string);
	}

	public static void succMsg(String string) {
		System.out.println("정상 실행 : " + string);
	}
	
	public static void printAll(ArrayList<ApartDTO> datas) {
		//jdk1.5 부터 추가된 반복문
		for(ApartDTO dto :datas) {
			System.out.println(dto);
		}
	}

	public static void printOne(ApartDTO datas) {
		System.out.println(datas);
	}
}
