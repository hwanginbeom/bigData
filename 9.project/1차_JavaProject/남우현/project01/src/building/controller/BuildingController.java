package building.controller;

import java.util.ArrayList;

import building.domain.Building_DTO;
import building.model.BuildingModel;
import building.view.EndView;


public class BuildingController {
	static ArrayList<Building_DTO> aListdata = new ArrayList<>();
	
	
	//모두 반환
	public static void all() {
		EndView.printAll(BuildingModel.getAll());
	}
	
	
	//add new building
	public static void addOne(Building_DTO newDTO) {
		boolean result = BuildingModel.addOne(newDTO);
		if(result) {
			EndView.printMsg(newDTO.getName() + "추가 완료");
		}else {
			EndView.printMsg("죄송합니다, 추가할 수 없습니다.");
		}
	}
	
	
	//삭제 - name를 기준으로 고객 삭제(해당 DTO에 null 대입)
		public static void deleteOne(String name) {
			boolean result= BuildingModel.deleteOne(name);
			if (result) {   
				EndView.printMsg(name+"의 정보 삭제가 완료되었습니다.");
			} else {
				EndView.printMsg("삭제 실패");
			}
		}
		
		
	//수정 - id를 기준으로 등급 수정
		public static void editOne(String name, int price) {
			boolean result= BuildingModel.editOne(name, price);
			if (result) {
				EndView.printMsg(name + "의 가격이 " + price +" 천만원으로 수정 완료되었습니다.");
			} else {
				EndView.printMsg("수정 실패");
			}
		}
	

}
