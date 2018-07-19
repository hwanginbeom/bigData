package country.view;

import java.util.ArrayList;

import country.domain.CountryDTO;

public class EndView {
	
	public static void printAll(ArrayList<CountryDTO> all) { // 리스트 모두 출력
		for(int i = 0 ; i < all.size(); i++) {
			if(all.get(i) != null) {        // 발생 가능한 비실행 경우를 모두 포함할 수 있어야 한다. 
			System.out.println(all.get(i).toString());
			}
		}
	}
	
	public static void printOne(CountryDTO one) {
		System.out.println(one.toString());
	}

	public static void printMsg() {
		System.out.println("검색한 데이터는 존재하지 않습니다.");
	}
	
	public static void printMsg(String msg) {
		System.out.println(msg);
	}
}
