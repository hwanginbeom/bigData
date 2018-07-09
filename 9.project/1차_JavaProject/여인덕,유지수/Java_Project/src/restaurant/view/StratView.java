package restaurant.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import restaurant.controller.RestaurantController;

public class StratView {

	public static void main(String[] args) {
		// Interface
		//System.out.println("<원하시는 항목을 선택해 주세요>");
		//System.out.println("1. 매장 추가 2. 매장 검색 3. 정보 수정  4. 정보 삭제 ");

		RestaurantController controller = new RestaurantController();
		controller.fileIO();// 파일 읽어오기(처음 한번)

		// 키보드 입력받아서 경우의 수 나누기
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = "";

			while (!input.equals("q")) {
				System.out.println();
				
				System.out.println("<원하시는 항목을 선택해 주세요>");
				System.out.println("1. 매장 추가  2. 매장 검색  3. 정보 수정   4. 정보 삭제 ");
				input = in.readLine();
				if (input.equals("1")) {
					controller.create();
				} else if (input.equals("2")) {
					System.out.println("1. 업소명으로 검색  2. 음식종류로 검색");
					String input2 = in.readLine();
					controller.read(input2);
				} else if (input.equals("3")) {
					controller.upgrade();
				} else if (input.equals("4")) {
					controller.delete();
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
