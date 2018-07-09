package restaurant.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import restaurant.domain.RestaurantDTO;

public class RestaurantService {

	private static RestaurantService instance = new RestaurantService();

	public static ArrayList<RestaurantDTO> aListdata;
	
	public static ArrayList<RestaurantDTO> sb_gangnam;
	
	public static ArrayList<RestaurantDTO> sb_gangdong;
	
	public static ArrayList<RestaurantDTO> sb_gangbuk;
	
	public static ArrayList<RestaurantDTO> sb_gangseo;
	
	public static ArrayList<RestaurantDTO> sb_gwanak;
	
	public static ArrayList<RestaurantDTO> sb_gwangjin;
	
	public static ArrayList<RestaurantDTO> sb_gooro;
	
	public static ArrayList<RestaurantDTO> sb_guemcheon;
	
	public static ArrayList<RestaurantDTO> sb_nowon;
	
	public static ArrayList<RestaurantDTO> sb_dobong;
	
	public static ArrayList<RestaurantDTO> sb_dongdaemun;
	
	public static ArrayList<RestaurantDTO> sb_dongjak;
	
	public static ArrayList<RestaurantDTO> sb_mapo;
	
	public static ArrayList<RestaurantDTO> sb_seodaemun;
	
	public static ArrayList<RestaurantDTO> sb_seocho;
	
	public static ArrayList<RestaurantDTO> sb_seongdong;
	
	public static ArrayList<RestaurantDTO> sb_seongbuk;
	
	public static ArrayList<RestaurantDTO> sb_songpa;
	
	public static ArrayList<RestaurantDTO> sb_yangcheon;

	public static ArrayList<RestaurantDTO> sb_youngdeungpo;
	
	public static ArrayList<RestaurantDTO> sb_yongsan;
	
	public static ArrayList<RestaurantDTO> sb_eunpyeong;
	
	public static ArrayList<RestaurantDTO> sb_jongro;
	
	public static ArrayList<RestaurantDTO> sb_joongu;
	
	public static ArrayList<RestaurantDTO> sb_joongrang;
	
	
	
	private RestaurantService() {
		BufferedReader in = null;
		aListdata = new ArrayList<>();
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ITStudy\\restaurant.csv"), "UTF-8"));
			String data = in.readLine();
			String[] readData = null;
			while (data != null) {
				readData = data.split(",");
				aListdata.add(new RestaurantDTO(readData[0], readData[1], readData[2], readData[3]));
				data = in.readLine();

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close(); // 사용했던 시스템 자원을 반환하기
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		sb_gangnam = new ArrayList<RestaurantDTO>();
		sb_gangdong = new ArrayList<RestaurantDTO>();
		sb_gangbuk = new ArrayList<RestaurantDTO>();
		sb_gangseo = new ArrayList<RestaurantDTO>();
		sb_gwanak = new ArrayList<RestaurantDTO>();
		sb_gwangjin = new ArrayList<RestaurantDTO>();
		sb_gooro = new ArrayList<RestaurantDTO>();
		sb_guemcheon = new ArrayList<RestaurantDTO>();
		sb_nowon = new ArrayList<RestaurantDTO>();
		sb_dobong = new ArrayList<RestaurantDTO>();
		sb_dongdaemun = new ArrayList<RestaurantDTO>();
		sb_dongjak = new ArrayList<RestaurantDTO>();
		sb_mapo = new ArrayList<RestaurantDTO>();
		sb_seodaemun = new ArrayList<RestaurantDTO>();
		sb_seocho = new ArrayList<RestaurantDTO>();
		sb_seongdong = new ArrayList<RestaurantDTO>();
		sb_seongbuk = new ArrayList<RestaurantDTO>();
		sb_songpa = new ArrayList<RestaurantDTO>();
		sb_yangcheon = new ArrayList<RestaurantDTO>();
		sb_youngdeungpo = new ArrayList<RestaurantDTO>();
		sb_yongsan = new ArrayList<RestaurantDTO>();
		sb_eunpyeong = new ArrayList<RestaurantDTO>();
		sb_jongro = new ArrayList<RestaurantDTO>();
		sb_joongu = new ArrayList<RestaurantDTO>();
		sb_joongrang = new ArrayList<RestaurantDTO>();
		
		for(int i=0;i<aListdata.size();i++) {
			if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*강남구.*")) {
				sb_gangnam.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*강동구.*")){
				sb_gangdong.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*강북구.*")) {
				sb_gangbuk.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*강서구.*")) {
				sb_gangseo.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*관악구.*")) {
				sb_gwanak.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*광진구.*")) {
				sb_gwangjin.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*구로구.*")) {
				sb_gooro.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*금천구.*")) {
				sb_guemcheon.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*노원구.*")) {
				sb_nowon.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*도봉구.*")) {
				sb_dobong.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*동대문구.*")) {
				sb_dongdaemun.add(aListdata.get(i));
			}
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*동작구.*")) {
				sb_dongjak.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*마포구.*")) {
				sb_mapo.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*서대문구.*")) {
				sb_seodaemun.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*서초구.*")) {
				sb_seocho.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*성동구.*")) {
				sb_seongdong.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*성북구.*")) {
				sb_seongbuk.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*송파구.*")) {
				sb_songpa.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*양천구.*")) {
				sb_yangcheon.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*영등포구.*")) {
				sb_youngdeungpo.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*용산구.*")) {
				sb_yongsan.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*은평구.*")) {
				sb_eunpyeong.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*종로구.*")) {
				sb_jongro.add(aListdata.get(i));
			}
			
			else if(aListdata.get(i).getAddress() != null && aListdata.get(i).getAddress().matches(".*중구.*")) {
				sb_joongu.add(aListdata.get(i));
			}
			else{ 
				sb_joongrang.add(aListdata.get(i));
			}
		}
	
			/*for(int i=0;i<sb_gangnam.size();i++) {
				sb_gangnam.add(new RestaurantDTO(sb_gangnam[i]);
				data = in.readLine();*/
			}		
				
				
	
		

	public static RestaurantService getInstance() {
		return instance;
	}

	public static ArrayList<RestaurantDTO> getAllRestaurant() {
		return aListdata;
	}

/*	public static Set<String> getAllSubway() {
		return hmSubway.keySet();
	}*/
		/*Iterator<String> allKey = hmSubway.keySet().iterator();
		String k = null;
		while(allKey.hasNext()) {
			k = (String)allKey.next();
			System.out.println(k + " " + hmSubway.get(k));*/

	//Set keys = map.keySet();
	/*Iterator allKey = keys.iterator();
	String k = null;
	while(allKey.hasNext()) {
		k = (String)allKey.next();
		System.out.println(k + " " + map.get(k));*/
	
	/*public static boolean getKey(String subwayName) {
		RestaurantDTO restaurant = null;
			if (hmSubway.get(subwayName).matches(subwayName)) {
				restaurant = aListdata.get(i);
				return true;
			}
		} return false;*/
	
	public static boolean getRestaurant(String restaurantName) {
		RestaurantDTO restaurant = null;
		for (int i = 0; i < aListdata.size(); i++) {
			if (aListdata.get(i).getRestaurantName().equals(restaurantName)) {
				restaurant = aListdata.get(i);
				return true;
			}
		}
		return false;
	}

	public static boolean restaurantInsert(RestaurantDTO restaurant) {
		return aListdata.add(restaurant);
	}

	public static boolean restaurantUpdate(String restaurantName, String pNumber) {
		for (int i = 0; i < aListdata.size(); i++) {
			if (aListdata.get(i).getRestaurantName().equals(restaurantName)) {
				aListdata.get(i).setpNumber(pNumber);
				return true;
			}
		}return false;
	}

	public static boolean restaurantDelete(String restaurantName) {
		for (int i = 0; i < aListdata.size(); i++) {
			if (aListdata.get(i).getRestaurantName().equals(restaurantName)) {
				aListdata.remove(i);
				return true;
			}
		}return false;
	}
	
	public static void getFire(String subwayName) {
		for(int i=0;i<aListdata.size();i++) {	
			if(aListdata.get(i).getAddress() != null) {
				aListdata.get(i).getAddress().matches(".*중구.*"); {
					
				}
			} 
		} 
	}
}
	

	/*public static void hmAlistData() {
		hmSubway = new HashMap<>();*/
		
		/*for(int i=0;i<aListdata.size();i++) {
			
			if(aListdata.get(i).getAddress().matches(".*강남구.*")) {//.*   <- 문자열이 행의 어디에 있든지 찾을 수 있게
				hmSubway.put("강남",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*강동구.*")) {
				hmSubway.put("강동",aListdata.get(i));	
			}
			
			if(aListdata.get(i).getAddress().matches(".*강북구.*")) {
				hmSubway.put("수유",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*강서구.*")) {
				hmSubway.put("마곡",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*관악구.*")) {
				hmSubway.put("서울대입구",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*광진구.*")) {
				hmSubway.put("군자",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*구로구.*")) {
				hmSubway.put("구로",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*금천구.*")) {
				hmSubway.put("가산디지털단지",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*노원구.*")) {
				hmSubway.put("노원",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*도봉구.*")) {
				hmSubway.put("도봉",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*동대문구.*")) {
				hmSubway.put("청량리",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*동작구.*")) {
				hmSubway.put("노량진",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*마포구.*")) {
				hmSubway.put("합정",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*서대문구.*")) {
				hmSubway.put("가좌",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*서초구.*")) { 
				hmSubway.put("역삼",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*성동구.*")) { 
				hmSubway.put("왕십리",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*성북구.*")) { 
				hmSubway.put("성신여대입구",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*송파구.*")) { 
				hmSubway.put("잠실",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*양천구.*")) { 
				hmSubway.put("목동",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*영등포구.*")) { 
				hmSubway.put("여의도",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*용산구.*")) { 
				hmSubway.put("이태원",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*은평구.*")) { 
				hmSubway.put("역촌",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*종로구.*")) { 
				hmSubway.put("종로3가",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*중구.*")) { 
				hmSubway.put("동대문역사문화공원",aListdata.get(i));
			}
			
			if(aListdata.get(i).getAddress().matches(".*중랑구.*")) { 
				hmSubway.put("사가정",aListdata.get(i));
			}
		}
	}*/
	
/*	public void searchSubway(String subwayName) {
		System.out.println("----");
		hmSubway.keySet().size();
		for (int i = 0; i < hmSubway.keySet().size(); i++) {
			if (hmSubway.keySet().equals(subwayName)) {
				System.out.println(hmSubway.get(subwayName));
			}
		}
	}
}*/
