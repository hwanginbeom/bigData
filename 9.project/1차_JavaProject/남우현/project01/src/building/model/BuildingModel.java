package building.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import building.domain.Building_DTO;

public class BuildingModel {
	
	// 데이터 입력
	static ArrayList<Building_DTO> aListdata = new ArrayList<>();

	static {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(
					new FileInputStream("/Users/namwoohyun/Desktop/ITStudy/information.csv"), "UTF-8"));
			String data = in.readLine();
			String[] readData = null;
			while (data != null) {
				readData = data.split(",");
				aListdata.add(new Building_DTO(readData[0], Integer.parseInt(readData[1]),
						Integer.parseInt(readData[2]), Integer.parseInt(readData[3])));
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

	}

	// 수정
	public static boolean editOne(String name, int price) {
		for (int i = 0; i < aListdata.size(); i++) {
			if (aListdata.get(i).getName() != null && aListdata.get(i).getName().equals(name)) {
				aListdata.get(i).setPrice(price);
				return true;// 반복문 끝내
			}
		}
		return false;
	}

	// delete
	public static boolean deleteOne(String name) {
		for (int i = 0; i < aListdata.size(); i++) {
			if (aListdata.get(i).getName() != null && aListdata.get(i).getName().equals(name)) {
				aListdata.set(i, null);
				return true;// 반복문 끝내기
			}
		}
		return false;
	}

	// add
	public static boolean addOne(Building_DTO newDTO) {
		for (int i = 0; i < aListdata.size(); i++) {
			if (!aListdata.get(i).getName().equals(newDTO.getName())) {
				aListdata.add(newDTO);
			return true;
			}			
		} return false;
	}

	// get all
	public static ArrayList<Building_DTO> getAll() {
		return aListdata;
	}

}

