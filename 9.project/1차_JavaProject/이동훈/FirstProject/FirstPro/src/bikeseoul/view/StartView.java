package bikeseoul.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

import bikeseoul.controller.BikeController;
import bikeseoul.domain.BikeSeoulDTO;
import bikeseoul.domain.Location;
import bikeseoul.domain.Rent;
import bikeseoul.domain.Station;
import bikeseoul.model.BikeInput;

public class StartView {
	public static void main(String[] args) {
	BikeInput.ReadCSV();
	 int userChoice;
     MenuView View = new MenuView();
     Scanner input2 = new Scanner(System.in);
     String in;
     Double newlat;
     Double newlng;
     String newid;
     String newname;
     String newdistrict;
     String newaddress;
     String newholder;
		while (true) {
			userChoice = View.menu();
			switch (userChoice) {
			case 0: 
				System.out.println("입력오류입니다. 다시 입력하세요");
				break;
			case 1:
				BikeController.all(); //전체 검색
				break;
			case 2:
				System.out.println("검색하려는 정류소 이름을 입력하세요");
				in = input2.nextLine();
				BikeController.getName(in); //이름으로 검색
				System.out.println("-------------------------------");
				System.out.println("검색하신 정류소 1km 근처에 있는 따릉이 정류소 정보입니다");
				System.out.println("-------------------------------");
				BikeController.getNear2(in);
				
				break;
			case 3:
				System.out.println("검색하려는 정류소 번호를 입력하세요");
				in= input2.nextLine();
				BikeController.getId(in); //번호로 검색
				System.out.println("-------------------------------");
				System.out.println("검색하신 정류소 1km 근처에 있는 따릉이 정류소 정보입니다");
				System.out.println("-------------------------------");
				BikeController.getNear(in);
				break;
			case 4:
				System.out.println("검색하려는 정류소 거치대 수를 입력하세요");
				in = input2.nextLine();
				BikeController.getHolder(in); //거치대 수로 검색
				break;
			case 5:
				System.out.println("좌표를 알고 싶은 정류소 번호를 입력하세요");
				in = input2.nextLine();
				BikeController.getLocation(in); //위치 좌표 검색
				System.out.println("-------------------------------");
				System.out.println("검색하신 정류소 1km 근처에 있는 따릉이 정류소 정보입니다");
				System.out.println("-------------------------------");
				BikeController.getNear(in);

				break;
			case 6:
				System.out.println("대여횟수와 반납 횟수를 알고 싶은 정류소 번호를 입력하세요");
				in = input2.nextLine();
				BikeController.getRental(in); //대여횟수와 반납횟수 검색
				break;
			case 7:
				System.out.println("삭제하려는 정류소 번호를 입력하세요");
				in = input2.nextLine();
				BikeController.DeleteOne(in); //삭제하기
				break;
			case 8:
				System.out.println("삭제하려는 정류소 이름을 입력하세요");
				in = input2.nextLine();
				double inDouble;
				BikeController.DeleteOne2(in); //삭제하기
				break;
			case 9:
				try {
				System.out.println("수정하고 싶은 정류소 번호를 입력하세요.");
				in = input2.nextLine();
				String setid =in;
				newid = in;
				System.out.println("수정할 지역구(ex.서대문구)를 입력하세요.");
				in = input2.nextLine();
				newdistrict = in;
				System.out.println("수정할 정류소 이름(ex.멀티캠퍼스 앞)를 입력하세요.");
				in = input2.nextLine();
				newname = in;
				System.out.println("수정할 정류소 주소(ex.서울시 강남구 강남대로 2)를 입력하세요.");
				in = input2.nextLine();
				newaddress = in;
				System.out.println("수정할 정류소 거치대 수(ex.10)를 입력하세요.");
				in = input2.nextLine();
				newholder = in;
				
					System.out.println("수정할 정류소 위도(ex.36.01010)를 입력하세요.");
					inDouble = input2.nextDouble();
					newlat = inDouble;
					System.out.println("수정할 정류소 경도(ex.128.5123)를 입력하세요.");
					inDouble = input2.nextDouble();
					newlng = inDouble;

					BikeController.UpdateOne(setid,
							new BikeSeoulDTO(newid, new Station(newdistrict, newname, newaddress, newholder),
									new Location(newlat, newlng), new Rent(0, 0))); // 수정하기
				} catch (InputMismatchException e) {
					System.out.println(e + "의 오류입니다\n 초기화면으로 돌아갑니다.");

				}
				break;
			case 10:
				
				try {
				System.out.println("입력할 정류소 번호(ex.1500)를 입력하세요.");
				in = input2.nextLine();
				newid = in;
				System.out.println("입력할 지역구(ex.서대문구)를 입력하세요.");
				in = input2.nextLine();
				newdistrict = in;
				System.out.println("입력할 정류소 이름(ex.멀티캠퍼스 앞)를 입력하세요.");
				in = input2.nextLine();
				newname = in;
				System.out.println("입력할 정류소 주소(ex.서울시 강남구 강남대로 2)를 입력하세요.");
				in = input2.nextLine();
				newaddress = in;
				System.out.println("입력할 정류소 거치대 수(ex.10)를 입력하세요.");
				in = input2.nextLine();
				newholder = in;
				
					System.out.println("입력할 정류소 위도(ex.36.01010)를 입력하세요.");

					inDouble = input2.nextDouble();
					newlat = inDouble;

					System.out.println("입력할 정류소 경도(ex.128.5123)를 입력하세요.");

					inDouble = input2.nextDouble();
					newlng = inDouble;

					BikeController
							.InsertOne(new BikeSeoulDTO(newid, new Station(newdistrict, newname, newaddress, newholder),
									new Location(newlat, newlng), new Rent(0, 0))); // 추가하기
				} catch (InputMismatchException e) {
					System.out.println(e+"의 오류입니다\n 초기화면으로 돌아갑니다.");
					
				}
				break;
			case 11:
				System.out.println("대여횟수+반납횟수 누적 TOP3  정류소 정보");
				BikeController.descending();
				break;
			case 12:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;

			}
     /*
	System.out.println("******모두 검색******");
	//BikeController.all();
	//검색
	System.out.println("******정류소 이름으로 검색******");
	//BikeController.getName("학동역");
	System.out.println("******정류소 번호로 검색******");
	//BikeController.getId("101");
	System.out.println("******거치대 개수로 검색******");
	//BikeController.getHolder("10");
	System.out.println("******정류소 번호로 정류소 좌표(위도,경도)검색******");
	//BikeController.getLocation("10");
	System.out.println("******정류소 번호로 정류소 좌표(위도,경도)검색******");
	//BikeController.getRental("101");
	
	//삽입
	System.out.println("******정류소 번호로 해당 DTO 삽입******");
	//BikeController.InsertOne(new BikeSeoulDTO("1",new Station("서대문구","추가한데이터","서울시서대문구","10"),new Location(30.0,30.0),new Rent(1000,1000)));
	
	//수정
	System.out.println("*******정류소 번호로 해당 DTO 수정*******");
	//BikeController.UpdateOne("2",new BikeSeoulDTO("1",new Station("서대문구","추가한데이터","서울시서대문구","10"),new Location(30.0,30.0),new Rent(1000,1000)));
	
	//삭제
	System.out.println("********정류소 번호로 해당 정류소 정보 삭제********");
	//BikeController.DeleteOne("111");
	System.out.println("********정류소 번호로 해당 정류소 정보 삭제********");
	*/
	
	
	
	}
	}
}

