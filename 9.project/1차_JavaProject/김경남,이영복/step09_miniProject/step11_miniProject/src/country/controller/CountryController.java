package country.controller;

import country.domain.CountryDTO;
import country.model.CountryModel;
import country.view.EndView;
	
public class CountryController {
	
	public static void all() {
		EndView.printAll(CountryModel.getAllCountry());
	}
	
	public static void getOne(String id) {
		CountryDTO one = CountryModel.getCountryByItem(id);
		if(one != null) {
			EndView.printOne(one); // 검색된 데이터가 존재할 경우 true
		}else {
			EndView.printMsg();
		}
	}
	
/*	public static void addOne(String itemName, Data data) {
		boolean result = CountryModel.insertItem(itemName, data);
		if(result) {
			EndView.printMsg("해당 item의 국가 정보 추가 완료");
		}else {
			EndView.printMsg("해당 분야의 Item은 존재하지 않습니다.");
		}
			
	}*/
	
	public static void deleteOne(String item) {
		boolean result = CountryModel.DeleteItem(item);
		if(result) {
			EndView.printMsg(item + "삭제 완료\n");
		}else {
			EndView.printMsg(item + "삭제 실패\n");
		}
	}
	
	public static void CountryUpdate(String ItemName, String country_name, int num1, int num2) {
		boolean result = CountryModel.CountryUpdate(ItemName, country_name, num1, num2);
		if(result) {
			EndView.printMsg("수정 완료");
		}else {
			EndView.printMsg("수정 불가");
		}
	}
	
	public static void CountryMatching(String ItemName, String CountryName) {
		boolean result = CountryModel.Matching(ItemName, CountryName);
		if(result) {
			EndView.printMsg("해당 분야는 투자할 가치가 있습니다");
		}else {
			EndView.printMsg("해당 분야는 투자할 가치가 없습니다.");
		}
	}
}
