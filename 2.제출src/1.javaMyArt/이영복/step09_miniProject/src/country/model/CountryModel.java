package country.model;

import java.util.ArrayList;

import country.domain.CountryDTO;

public class CountryModel {

	private static CountryModel instance = new CountryModel(); // 싱글톤 방식 사용
	static ArrayList<CountryDTO> CountryList = CsvInput.countryList; // CountryList 생성

	private CountryModel() {}

	public static CountryModel getInstance() {  // instance 호출할 method 생성
		return instance;
	}

	public static ArrayList<CountryDTO> getAllCountry() {  // 모든 Item의 Country를 출력하기 위해 CountryList 반환 
		return CountryList;
	}

	public static CountryDTO getCountryByItem(String ItemName) { // Item을 입력할 때 해당 Item이 아시아 3개국에서 어떤 동향을 띄고 있는지 검색하기 위한 Method 
		CountryDTO getOne = null;
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i).getItem().equals(ItemName)) {
				getOne = CountryList.get(i);
				break;
			}
		}
		return getOne;
	}
	 /*public static boolean insertItem(String ItemName, Data data) {
	 for(int i = 0 ; i < CountryList.size() ; i ++) {
	 if(CountryList.get(i) != null &&
	 CountryList.get(i).getItem().equals(ItemName)) {
	 if(data instanceof Korea) {
	 CountryList.get(i).setKorea((Korea)data);
	 } else if(data instanceof Japan) {
	 CountryList.get(i).setJapan((Japan)data);
	 } else if(data instanceof China) {
	 CountryList.get(i).setChina((China)data);
	 }
	 return true;
	 }
	 }
	 return false;
	 }*/

	public static boolean DeleteItem(String ItemName) {      // 해당 Item의 존재 가치가 사라질 경우 Item 삭제 
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i).getItem().equals(ItemName)) {
				CountryList.remove(i);
				return true;
			}
		}
		return false;
	}

	public static boolean CountryUpdate(String ItemName, String CountryName, int num1, int num2) { // 구직자 수와 고용 매칭 수가 변동이 있을 시 변경
		// num1 : 해당 분야 구직자 , num2 : 고용 매칭
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i) != null && CountryList.get(i).getItem().equals(ItemName)) {
				if (CountryList.get(i).getKorea().getName().equals(CountryName)) {
					CountryList.get(i).getKorea().setJob_hunter(num1);
					CountryList.get(i).getKorea().setJob_match(num2);
				} else if (CountryList.get(i).getJapan().getName().equals(CountryName)) {
					CountryList.get(i).getJapan().setJob_hunter(num1);
					CountryList.get(i).getJapan().setJob_match(num2);
				} else if (CountryList.get(i).getChina().getName().equals(CountryName)) {
					CountryList.get(i).getChina().setJob_hunter(num1);
					CountryList.get(i).getChina().setJob_match(num2);
				}
				return true;
			}
		}
		return false;
	}

	public static boolean Matching(String ItemName, String CountryName) { // 기준점 : 수입 증가율이 2.5  또는 취업증가율 7% 에 따라 투자 가치 반환
		for (int i = 0; i < CountryList.size(); i++) {
			if (CountryList.get(i) != null && CountryList.get(i).getItem().equals(ItemName)) {
				if (CountryList.get(i).getKorea().getName().equals(CountryName)) {
					if ((CountryList.get(i).getKorea().getYear_2014()
							/ CountryList.get(i).getKorea().getYear_2006()) > 2.5
							|| CountryList.get(i).getKorea().getGet_percent() >= 7) {
						return true;
					}
				} else if (CountryList.get(i).getJapan().getName().equals(CountryName)) {
					if ((CountryList.get(i).getJapan().getYear_2014()
							/ CountryList.get(i).getJapan().getYear_2006()) > 2.5
							|| CountryList.get(i).getJapan().getGet_percent() >= 7) {
						return true;
					}
				} else if (CountryList.get(i).getChina().getName().equals(CountryName)) {
					if ((CountryList.get(i).getChina().getYear_2014()
							/ CountryList.get(i).getChina().getYear_2006()) > 2.5
							|| CountryList.get(i).getChina().getGet_percent() >= 7) {
						return true;
					}
				}
			}
		}
		return false;
	}
}