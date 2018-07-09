package restaurant.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import restaurant.domain.RestaurantDTO;

public class RestaurantModel {

	public static HashMap<String, RestaurantDTO> restaurant = new HashMap<>();

	public static HashMap<String, ArrayList<RestaurantDTO>> restaurant2 = new HashMap<>();

	public static ArrayList<RestaurantDTO> array_restaurant1 = new ArrayList<RestaurantDTO>(); // 한식
	public static ArrayList<RestaurantDTO> array_restaurant2 = new ArrayList<RestaurantDTO>(); // 중식
	public static ArrayList<RestaurantDTO> array_restaurant3 = new ArrayList<RestaurantDTO>(); // 일식
	public static ArrayList<RestaurantDTO> array_restaurant4 = new ArrayList<RestaurantDTO>(); // 양식

	public static void fileIO() {
		RestaurantDTO r = null;

		// #1. 파일 불러오기
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("dataset.txt"));
			String data = in.readLine();
			String[] data2 = null;

			// #2. 데이터 불러오기
			while (data != null) {
				data2 = data.split(",");

				// #2.1. DTO를 ArrayList에 넣기
				r = new RestaurantDTO(data2[0], data2[1], data2[2].replace(" ", ""), data2[3].replace(" ", ""),
						data2[4], data2[5]);
				if (data2[4].equals("한식")) {
					array_restaurant1.add(r);
				} else if (data2[4].equals("중식")) {
					array_restaurant2.add(r);
				} else if (data2[4].equals("일식")) {
					array_restaurant3.add(r);
				} else if (data2[4].equals("양식")) {
					array_restaurant4.add(r);
				}

				// #2.2 업소명을 기준으로 Hashmap에 넣기
				restaurant.put(data2[0], r);
				// 이렇게 데이터 셋을 구성한 이유는 검색 속도 향상을 위해서 자료 구조를 2개 사용하였다.
				data = in.readLine();
			}
			restaurant2.put("한식", array_restaurant1);
			restaurant2.put("중식", array_restaurant2);
			restaurant2.put("일식", array_restaurant3);
			restaurant2.put("양식", array_restaurant4);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// try {
			// in.close();// 사용했던 시스템 자원을 반환하기(정상 실행 되지만 나중에 시스템이 다운 될 수 있다)
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
		}
	}

	// CRUD 만들기
	// #1. Create
	public boolean create() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean result = false;
		try {
			String input = in.readLine();
			String data[] = input.split(",");
			RestaurantDTO restaurantadd = new RestaurantDTO(data[0], data[1], data[2], data[3], data[4], data[5]);

			// 1번 [DTO를 HashMap에 넣은 객체]
			restaurant.put(data[0], restaurantadd);

			// 2번 [DTO를 ArrayList에 넣은 객체]

			if (data[4].equals("한식")) {
				if (array_restaurant1.add(restaurantadd)) {
					result = true;
				}
			} else if (data[4].equals("중식")) {
				if (array_restaurant2.add(restaurantadd)) {
					result = true;
				}
			} else if (data[4].equals("일식")) {
				if (array_restaurant3.add(restaurantadd)) {
					result = true;
				}
			} else if (data[4].equals("양식")) {
				if (array_restaurant4.add(restaurantadd)) {
					result = true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return result;
	}

	// 2. 특정 음식점 불러오기 (입력 값 반환하여 찾아주기 )
	public static void read1() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String search = null;
		try {
			search = in.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (restaurant.get(search) != null) {
			System.out.println(restaurant.get(search).toString());
			//return restaurant.get(search);
		} else {
			System.out.println("입력하신 업소를 찾지 못했습니다.");
			//return null;
		}

	}

	// 2. 특정 음식종류를 갖는 업소명
	public static ArrayList<RestaurantDTO> read2() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String search = null;
		try {
			search = in.readLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (restaurant2.get(search) != null) {
			return restaurant2.get(search);
		} else {
			return null;
		}
	}

	public static boolean update() {
		boolean c = false;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input1 = null;
		String input2 = null;
		RestaurantDTO a = new RestaurantDTO();
		try {
			System.out.println("수정할 업소명을 입력해 주세요");
			input1 = in.readLine();
			a = restaurant.get(input1);
			if (a != null) {
				System.out.println("수정할 값을 입력해 주세요");
				input2 = in.readLine();
				a.setTelephone_number(input2);
				if (restaurant.put(input1, a) != null) {
					c = true;
				}
			} else {
				System.out.println("잘못된 업소명 입니다.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return c;
	}

	// 4. 해당 음식점 탈퇴
	public static boolean delete() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		boolean result = false;
		try {
			input = in.readLine();
			if (restaurant.remove(input) != null) {
				result = true;
			} else {
				System.out.println("잘못된 업소명 입니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

}
