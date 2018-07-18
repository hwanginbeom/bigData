package view;

import java.util.Scanner;

import controller.Controller;
import model.domain.ApartDTO;

public class StartView {

	public static void main(String[] args) {
		Controller controller = Controller.getInstance();

		// area_name으로 area_size, year, month, price 검색
		Scanner scan = new Scanner(System.in);
		int result = 0;
		String result2 = null;
		int int_result1 = 0;
		int int_result2 = 0;
		int int_result3 = 0;
		String str_result1 = null;
		String str_result2 = null;
		
		while( result != 7) {
		System.out.println("***********메뉴***********");
		System.out.println("  1 - 모든 데이터 보기");
		System.out.println("  2 - 해당 지역 부동산 검색하기 ");
		System.out.println("  3 - 새로운 데이터 추가하기");
		System.out.println("  4 - 해당 지역 최신 데이터 수정하기");
		System.out.println("  5 - 해당 지역 최신 데이터 삭제하기");
		System.out.println("  6 - 내 집 마련하기");
		System.out.println("  7 - 프로그램을 종료 하기");
		System.out.print(" 메뉴를 선택하세요 :  ");
		
		result = scan.nextInt();
		switch (result) {
		case 1: 
			
		System.out.println("*** 모든 데이터 출력 ***");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		controller.getAll();

		break;

		case 2:
		while(result!=0) {
			System.out.println("*** 지역을 검색 하시겠습니까? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.println("***  지역을 선택해주세요 ***");
		result2 = scan.next();
		controller.getApt(result2);
		}

		break;

		case 3:

		// 가입
		// 새로운 부서 정보 저장 
		// insert into apart values(?,?,?,?,?) 
		// insert into apart values(지역,크기,년도,월,가격)
		while(result!=0) {
			System.out.println("*** 데이터를 추가 하시겠습니까? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.println("*** 지역 이름은?");
		str_result1 = scan.next(); 
		System.out.println("*** 면적 종류은?");
		str_result2 = scan.next();
		System.out.println("*** 연도는?");
		int_result1 = Integer.parseInt(scan.next());
		System.out.println("*** 월은? ");
		int_result2 = Integer.parseInt(scan.next());
		System.out.println("*** 가격은? ");
		int_result3 = Integer.parseInt(scan.next());
		controller.insert(new ApartDTO(str_result1, str_result2, int_result1, int_result2, int_result3));
		}

		break;
		
		// price 수정
		case 4:
			
		while(result!=0) {
			System.out.println("*** 데이터를 수정 하시겠습니까? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.println("*** 지역 이름은?");
		str_result1 = scan.next();
		System.out.println("*** 가격은?");
		int_result1 = scan.nextInt();
		controller.update(int_result1, str_result1);
		}

		break;

		// area_name으로 데이터 삭제
		case 5:
		while(result!=0) {
			System.out.println("*** 데이터를 삭제 하시겠습니까? 1 (Yes) / 0 (No) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("***  삭제 할 지역을 입력하세요 : ");
		result2 = scan.next();
		controller.delete(result2);
		}
		break;

		case 6:
			while(result!=0) {
				System.out.println("*** 내 집 마련하고 싶으십니까? 1 (Yes) / 0 (No) ");
				result = scan.nextInt();
				if(result ==0) {
					break;
				}
		System.out.println("어디 지역에 살고 싶으십니까?");
		str_result1 = scan.next();
		System.out.println("몇 평에 살고 싶으십니까?");
		int_result1 = Integer.parseInt(scan.next());
		System.out.println("얼마나 버십니까? (월급을 입력하시오: 천원 단위)");
		int_result2 = Integer.parseInt(scan.next());
		System.out.println("월급의 몇 퍼센트 저축하세요?");
		int_result3 = Integer.parseInt(scan.next());
		System.out.println("은행 어디 사용하십니까?");
		str_result2 = scan.next();
		controller.getMyHome(str_result1, int_result1, int_result2, int_result3, str_result2);
		}		
		break;
		case 7:
			System.out.println("*** 프로그램이 종료 되었습니다. ***");
			break;
		}
		
	}
	}

}
