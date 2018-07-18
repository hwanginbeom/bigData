package project02.view;

import java.util.ArrayList;
import java.util.Iterator;

import project02.domain.ArcadeInfoDTO;
import project02.domain.LineArcadeDTO;
import project02.domain.StationArcadeDTO;
import project02.domain.SubwayArcadeDTO;

public class RunningEndView {
	
	//전체 정보 출력
	public static void printAll(SubwayArcadeDTO subwayInfo) {
		int subwayIndex =subwayInfo.getSubwayArcade().size(); 
		String key =null;
		Iterator<String> allKey =null;
		
		for(int i=0; i<subwayIndex; i++) {
			
			allKey = subwayInfo.getSubwayArcade().get(i).getLineArcade().keySet().iterator();
			
			if(allKey.hasNext()) {
				key = allKey.next();
				//for문 안에서 여러번의 stationInfo를 불러오는 것 보다 한번의 선언이 효율적이라고 판단
				ArrayList<ArcadeInfoDTO> stationInfo = subwayInfo.getSubwayArcade().get(i).getLineArcade().get(key).getStationArcade();
				
				for( ArcadeInfoDTO arcadeInfo : stationInfo) {
					System.out.println(arcadeInfo);
				}
			}
		}
	}
	//호선 상가정보 출력
	public static void printLine(LineArcadeDTO lineInfo) {
		Iterator<String> allKey =lineInfo.getLineArcade().keySet().iterator();
		String key = null;
		
		if(allKey.hasNext()) {
			key = allKey.next();
			
			ArrayList<ArcadeInfoDTO> stationInfo = lineInfo.getLineArcade().get(key).getStationArcade();
			for( ArcadeInfoDTO arcadeInfo : stationInfo) {
				System.out.println(arcadeInfo);
			}
		}
	}
	
	//역 상가정보 출력
	public static void printStation(StationArcadeDTO stationInfo) {
		for(ArcadeInfoDTO arcadeInfo : stationInfo.getStationArcade()) {
			System.out.println(arcadeInfo);
		}
	}
	
	public static void printEmpty(StationArcadeDTO stationInfo) {
		for(ArcadeInfoDTO dto : stationInfo.getStationArcade()) {
			System.out.println(dto);
		}
	}
	
	public static void succMsg(String msg) {
		System.out.println("정상 실행 : " + msg);
	}

	public static void errorMsg(String msg) {
		System.out.println("비정상 실행 : " + msg);
	}
}
