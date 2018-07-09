package project.view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import project.controller.CriminalController;

public class StartView {
	static void printMenu() {
		System.out.println("==========================MENU==========================");
		System.out.println("\t1. 2016년 서울시 자치구별 5대 범죄 발생 및 검거 현황");
		System.out.println("\t2. 자치구 데이터 검색");
		System.out.println("\t3. 자치구 데이터 삭제");
		System.out.println("\t4. 구 별 범죄 순위");
		System.out.println("\t5. 범죄 별 검거율");
		System.out.println("\t6. 각 구 별 검거율"); 
		System.out.println("\t7. 종료");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.print("메뉴를 선택하세요: ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menuNum =0; 
		while(true) {
			
			printMenu();
			menuNum = sc.nextInt();
			switch(menuNum) {
				case 1:	//데이터 모두 출력
					
					CriminalController.getAll();
					break;
					
				case 2:		//자치구 데이터 검색
					Scanner scanner = new Scanner(System.in);
					System.out.print("구 이름을 입력하세요: ");
					String district = scanner.nextLine();
					CriminalController.getOne(district);
					
					break;
					
				case 3:		//자치구 데이터 삭제
					
					Scanner scanner2 = new Scanner(System.in);
					System.out.print("구 이름을 입력하세요: ");
					String district2 = scanner2.nextLine();
					CriminalController.criminalDelete(district2);
					
					
					
					break;
				
					
				case 4:		//구별 범죄순위
					CriminalController.districtRank();
					break;
					
				case 5:	//범죄별 검거율
					CriminalController.calArrestRate();
					break;
					
				case 6:		//구별 검거율
					CriminalController.distArrestRate();
					
					break;
				case 7:	//종료
					System.out.println("프로그램을 종료합니다.");
					break;
					
				default:
					System.out.println("1부터 7사이의 숫자만 입력하세요.");
					break;
			}	//switch
			if(menuNum == 7) {
				sc.close();
				break;
			}		
		}	//while
	}
}

