package country.view;

import java.util.ArrayList;
import java.util.Scanner;

import country.controller.CountryController;
import country.domain.CountryDTO;
import country.model.CountryModel;

public class StartView {

	public static void main(String[] args) {
		CountryModel service = CountryModel.getInstance();
		ArrayList<CountryDTO> allCountry = service.getAllCountry();
		// 전체 데이터 불러오기
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"======================================================================================================================");

		int select = 1;
		boolean result = false;
		boolean result2 = false;
		String ItemName = "";
		String CountryName = "";

		while (select != 0) {
			System.out.println(
					"[ 원하는 기능을 선택해주세요 < 1: PrintAll  2: PrintOne 3: Delete Item 4:  Update 5: calculate 0: 종료 > ]");
			select = scan.nextInt();
			if (select == 0) {
				System.out.println("[ 해당 프로그램은 종료되었습니다. ]");
				System.out.println(
						"======================================================================================================================");
				break;
			}

			if (select == 1) {
				EndView.printAll(allCountry); // 전체 검색
			} else if (select == 2) {
				System.out.print("분야 이름을 입력하세요 : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				for (int i = 0 ; i < allCountry.size() ; i ++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result == true) {
					CountryController.getOne(ItemName);
				} else {
					System.out.println("분야 이름이 잘못되었습니다.");
				}

			} else if (select == 3) {
				result = false;
				System.out.print("다음의 분야 중 삭제하실 분야를 입력하세요 : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				for (int i = 0; i < allCountry.size(); i++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result == true) {
					CountryController.deleteOne(ItemName);
				} else {
					System.out.println("분야 이름이 잘못되었습니다.");
				}

			} else if (select == 4) {
				result = false;
				result2 = false;
				System.out.print("분야 이름을 입력하세요 : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				for (int i = 0; i < allCountry.size(); i++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result == true) {
					System.out.println("국가 이름을 입력하세요 : <한국, 일본, 중국>");
					CountryName = scan.next();
					for (int i = 0 ; i < allCountry.size() ; i++) {
						if (allCountry.get(i).getKorea().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getJapan().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getChina().getName().equals(CountryName)) {
							result2 = true;
						}
					}
					if (result2 == true) {
						System.out.println("수정하실 구직자 수를 입력하세요 : ");
						int num1 = scan.nextInt();
						System.out.println("수정하실 고용 매칭 수를 입력하세요 : ");
						int num2 = scan.nextInt();
						CountryController.CountryUpdate(ItemName, CountryName, num1, num2);
					} else {
						System.out.println("국가 이름이 잘못되었습니다.");
					}

				} else {
					System.out.println("분야 이름이 잘못되었습니다");
				}

			} else if (select == 5) {
				System.out.print("분야 이름을 입력하세요 : < ");
				for(int i = 0 ; i < allCountry.size() ; i ++) {
					System.out.print(allCountry.get(i).getItem()+" ");
				}
				System.out.println(">");
				ItemName = scan.next();
				result = false;
				result2 = false;
				for (int i = 0 ; i < allCountry.size() ; i ++) {
					if (allCountry.get(i).getItem().equals(ItemName))
						result = true;
				}
				if (result = true) {
					System.out.print("국가 이름을 입력하세요 : <한국, 일본, 중국>");
					CountryName = scan.next();
					for (int i = 0 ; i < allCountry.size() ; i ++) {
						if (allCountry.get(i).getKorea().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getJapan().getName().equals(CountryName)) {
							result2 = true;
						}
						if (allCountry.get(i).getChina().getName().equals(CountryName)) {
							result2 = true;
						}
					}
					if (result2 == true) {
						CountryController.CountryMatching(ItemName, CountryName);
					} else {
						System.out.println("국가 이름이 잘못되었습니다.");
					}
				} else {
					System.out.println("분야 이름이 잘못되었습니다");
				}
			}
		}
	}
}
