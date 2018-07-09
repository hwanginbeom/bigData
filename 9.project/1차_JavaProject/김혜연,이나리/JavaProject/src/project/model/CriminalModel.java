package project.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import project.domain.CriminalDTO;

public class CriminalModel {
	
	static ArrayList<CriminalDTO> list = new ArrayList<CriminalDTO>();
	static BufferedReader in = null;
	static BufferedWriter out = null;
	static {
		try {
			in = new BufferedReader (new FileReader("criminal.csv"));
			out = new BufferedWriter(new FileWriter("result.csv"));
			String data = in.readLine();
			data = in.readLine();	//첫행 넘기기
			String[] splitData = data.split(",");
			
			while(data != null) {
				
				splitData = data.split(",");
				data = in.readLine();
				
				list.add(new CriminalDTO(splitData[0], Integer.parseInt(splitData[1]), Integer.parseInt(splitData[2]), Integer.parseInt(splitData[3]), Integer.parseInt(splitData[4]), Integer.parseInt(splitData[5]), Integer.parseInt(splitData[6]), Integer.parseInt(splitData[7]), Integer.parseInt(splitData[8]), Integer.parseInt(splitData[9]), Integer.parseInt(splitData[10]), Integer.parseInt(splitData[11]), Integer.parseInt(splitData[12]), Integer.parseInt(splitData[13])));
				
					//out.write(data);
					//out.newLine();
				out.flush();	//데이터 손실을 위해서 목적지에 데이터 출력 보장
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {	//자원반환
			try {
				in.close();	//예외처리가 필요함
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	//static
	
	 	
	//모두 출력
	public static ArrayList<CriminalDTO> getAll() {
		System.out.println("\t\t< 2016년 서울시 자치구별 5대 범죄 발생 및 검거 현황>");	
		return list;
	}
	
	
	//범죄별 검거율 계산 메소드
	public static HashMap<String, Double> calArrestRate(){
		HashMap<String,Double> criminalRateMap = new HashMap<String, Double>();	//범죄이름, 검거율
		String[] criminalName = {"살인 검거율", "강도 검거율", "성범죄 검거율", "절도 검거율", "폭력 검거율"};
		double[] criminalRate = new double[5];
		int index = list.size()-1;

		criminalRate[0] = (double)list.get(index).getKillArrest() / (double)list.get(index).getKillCase() * 100;	//살인검거율
		criminalRate[1] = (double)list.get(index).getRobberArrest() / (double)list.get(index).getRobberCase() * 100;	//강도 검거율
		criminalRate[2] = (double)list.get(index).getRapeArrest() / (double)list.get(index).getRapeCase() * 100;	//성범죄검거율
		criminalRate[3] = (double)list.get(index).getTheftArrest() / (double)list.get(index).getTheftCase() * 100;	//절도검거율
		criminalRate[4] = (double)list.get(index).getAttackArrest() / (double)list.get(index).getAttackCase() * 100;	//폭력검거율
		
		
		for(int i=0; i<criminalName.length; i++) {
			criminalRateMap.put(criminalName[i], criminalRate[i]);
		}
		
		System.out.println("\t\t<범죄별 검거율>");
		return criminalRateMap;
		
	}
	
	
	//구 별 총 범죄 순위
	public static HashMap<Integer, String> districtRank(){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int index = list.size()-1;
		String[] districtName = new String[index];	//합계 제외
		int[] criminalSum = new int[index];
		HashMap<Integer, String> sortedMap = new HashMap<Integer, String>();
		
		
		for(int i=0; i<index; i++) {
			districtName[i] = list.get(i).getDistrict();
			criminalSum[i] = list.get(i).getCaseSum();
			
			map.put(districtName[i], criminalSum[i]);
		}
		
		
		Iterator it = sortByValue(map).iterator();
        
        
        
        for(int i=1; i<=index; i++) {
        	String temp = (String) it.next();
        	sortedMap.put(i, temp);
        	// System.out.println(i+"위: "+temp);
        }
        
        return sortedMap;
	
	}
	
	
	//hashMap 정렬하는 메소드
	public static ArrayList<String> sortByValue(HashMap<String, Integer> map){
		ArrayList<String> list = new ArrayList<String>();
        list.addAll(map.keySet());
         
        Collections.sort(list, new Comparator(){
             
            public int compare(Object o1,Object o2){
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                 
                return ((Comparable) v1).compareTo(v2);
            }
             
        });
        Collections.reverse(list); // 주석시 오름차순
        return list;
    }
	
	
	
	//각 구 검거율
	public static HashMap<String, Double> distArrestRate(){
        HashMap<String,Double> criminalRateMap2 = new HashMap<String, Double>();   //범죄이름, 검거율
        String[] distName = {"종로구 검거율","중구 검거율", "용산구 검거율","성동구 검거율","광진구 검거율", "동대문구 검거율", 
                                   "중랑구 검거율", "성북구 검거율", "강북구 검거율",  "도봉구 검거율", "노원구 검거율","은평구 검거율",
                                   "서대문구 검거율", "마포구 검거율","양천구 검거율"," 강서구 검거율","구로구 검거율","금천구 검거율",
                                   "영등포구 검거율","동작구 검거율","관악구 검거율", "서초구 검거율","강남구 검거율","송파구 검거율", "강동구 검거율"};
        double[] criminalRate = new double[26];
       
        for(int i = 0; i<distName.length;i++) {
           criminalRate[i] = (double)list.get(i).getArrestSum() / (double)list.get(i).getCaseSum() *  100;
           criminalRateMap2.put(distName[i],criminalRate[i]);
        }
        
        
        System.out.println("\t\t<각 구 별 검거율>");
        
        return criminalRateMap2;
  }
	
	
	//검색하는것
		public static CriminalDTO getOne(String district) {
	       
			CriminalDTO project = null;
			for(int i = 0; i < list.size(); i++) {
				if (list.get(i).getDistrict().equals(district)) { 
					project = list.get(i);
					break;
				}
			}
			return project;
		}
		
	
		
		//삭제하기
		public static  boolean CriminalDTOdelete(String district) {
	         int count = list.size();
	         for(int i=0; i<count; i++) {
	            if (list.get(i).getDistrict().equals(district)) {
	               list.remove(i); 
	               return true;
	            }
	         }   
	         return false;
	      }   

}
