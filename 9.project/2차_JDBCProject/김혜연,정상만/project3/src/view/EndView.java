package view;

import java.util.ArrayList;
import model.domain.RestaDTO;


public class EndView {

	public static void errorMsg(String string) {
		System.out.println("\n비정상 실행 : "+string);
	}


	public static void succMsg(String string) {
		System.out.println("\n정상 실행 : " +string);
	}
	
	public static void printAll1(ArrayList<RestaDTO> datas) {
		//jdk1.5 부터 추가된 반복문
		for(RestaDTO dto :datas) {
			System.out.println(dto);
		}
	}


	public static void printOne1(RestaDTO datas) {
		System.out.println(datas);
	}

}
