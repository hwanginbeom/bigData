package project.controller;

import project.domain.CriminalDTO;
import project.model.CriminalModel;
import project.view.EndView;

public class CriminalController {
	
	public static void getAll() { 
		EndView.printAll(CriminalModel.getAll());
	}
	
	
	
	public static void calArrestRate() {
		EndView.printAll(CriminalModel.calArrestRate());
	}
	
	
	public static void districtRank() {
		EndView.printAll2(CriminalModel.districtRank());
	}
	
	public static void distArrestRate() {
		EndView.printAll(CriminalModel.distArrestRate());
	}
	
	public static void getOne(String district) {
		
		CriminalDTO one = CriminalModel.getOne(district);
		if(one != null) {	//검색은 데이터가 존재할 경우 true
			EndView.printOne(one);
		} else {
			EndView.printMsg();
		}
	}
	
	public static void criminalDelete(String district) {
		boolean result = CriminalModel.CriminalDTOdelete(district);
		if(result) {
			EndView.printMsg(district+"정보를 삭제했습니다.");
		}else {
			EndView.printMsg("해당 자치구가 없습니다.");
		}
	}
}
