package building.view;

import building.controller.BuildingController;
import building.domain.Building_DTO;


public class StartView {

	public static void main(String[] args) {
		//모두 출력
		System.out.println("***모두 검색***");
		BuildingController.all();

		//새로운 빌딩 추가
		System.out.println("***빌딩명 추가***");
		Building_DTO newOne = new Building_DTO("우현빌딩", 9, 126, 345 );
		BuildingController.addOne(newOne);

		//수정
		System.out.println("***가격 수정***");
		BuildingController.editOne("우현빌딩", 100000);


		//삭제	-	존재하는 데이터 삭제
		System.out.println("***삭제***");
		BuildingController.deleteOne("일훈빌딩");

/////


	}

}
