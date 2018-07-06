package country.model;

import java.util.ArrayList;

import country.domain.CountryDTO;

public class CountryModel {

	private static CountryModel instance = new CountryModel();
	ArrayList<CountryDTO> CountryList = new ArrayList<CountryDTO>();
	
	private CountryModel() {}
	
	public static CountryModel getInstance() {
		return instance;
	}
	
	public ArrayList<CountryDTO> getAllCountry(){
		return CountryList;
	}
	
	public CountryDTO getCountry_by_Item(String item) {
		CountryDTO getOne = null;
		for (int i = 0 ; i < CountryList.size() ; i ++) {
			if(CountryList.get(i).getItem().equals(item)) {
				getOne = CountryList.get(i);
				break;
			}
		}
		return getOne;
	}
	
	public void insertItem(CountryDTO Item) {
		CountryList.add(Item);
	}
	
	public void DeleteItem(String ItemName) {
		for (int i = 0 ; i < CountryList.size() ; i++) { 
			if (CountryList.get(i).getItem().equals(ItemName)) {
				CountryList.remove(i);
				break;
			}
		}
	}
	public void projectUpdate(String ItemName, String country_name, int num1, int num2){
		// num1 : 해당 분야 구직자 , num2 : 고용 매칭
		for(int i = 0 ; i < CountryList.size() ; i++) {
			if(CountryList.get(i) != null && CountryList.get(i).getItem().equals(ItemName)) {
				if(CountryList.get(i).getKorea().getName().equals(country_name)) {
					CountryList.get(i).getKorea().setJob_hunter(num1);
					CountryList.get(i).getKorea().setJob_match(num2);
				}else if(CountryList.get(i).getJapan().getName().equals(country_name)) {
					CountryList.get(i).getJapan().setJob_hunter(num1);
					CountryList.get(i).getJapan().setJob_match(num2);
				}else if(CountryList.get(i).getChina().getName().equals(country_name)) {
					CountryList.get(i).getChina().setJob_hunter(num1);
					CountryList.get(i).getChina().setJob_match(num2);
				}
			}
		}	
	}
}
