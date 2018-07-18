package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.RestaDAO;
import model.domain.RestaDTO;
import view.EndView;

public class Controller {

	private static Controller instance = new Controller();

	private Controller() {
	}

	public static Controller getInstance() {
		return instance;
	}

	public void getRestaAll() {
		try {
			ArrayList<RestaDTO> datas = RestaDAO.getAll();
			if (datas.size() != 0) {
				EndView.printAll1(datas);
			} else {
				EndView.succMsg("\n입력값에 대한 해당 데이터가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("\n비 정상적인 실행 방법입니다.");
		}
	}

//	public void getAddress(String address) {
//		try {
//			RestaDTO datas = RestaDAO.getAddress(address);
//			if (datas != null) {
//				EndView.printOne1(datas);
//			} else {
//				EndView.succMsg("검색한 데이터가 없습니다.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			EndView.errorMsg("죄송합니다. 잠시후에 재 요청 바랍니다.");
//		}
//	}
//	
//	public void getCategory(String category) {
//		try {
//			RestaDTO datas = RestaDAO.getCategory(category);
//			if (datas != null) {
//				EndView.printOne1(datas);
//			} else {
//				EndView.succMsg("검색한 데이터가 없습니다.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			EndView.errorMsg("죄송합니다. 잠시후에 재 요청 바랍니다.");
//		}
//	}
	
	
	
	public void getAddcat(String address, String category) {
		try {
			RestaDTO datas = RestaDAO.getAddcat(address , category);
			if (datas != null) {
				EndView.printOne1(datas);
			} else {
				EndView.succMsg("\n입력값에 대한 해당 데이터가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("\n비 정상적인 실행 방법입니다.");
		}
	}
	
	public void getCategory(String category) {
		try {
			RestaDTO datas = RestaDAO.getCategory(category);
			if (datas != null) {
				EndView.printOne1(datas);
			} else {
				EndView.succMsg("\n입력값에 대한 해당 데이터가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			EndView.errorMsg("\n비 정상적인 실행 방법입니다.");
		}
	}
	


	// insert
	/*
	 * 발생 가능한 경우의수 1. 정상 실행 1. true - 저장 완료, 저장 성공 2. false - 예외는 아니지만 저장은 못했습니다. 2.
	 * 비정상 실행 -이미 존재하는 deptno값 재저장 시도시 SQLException 발생 -이미 존재하는 메세지....
	 */
	public void insert(RestaDTO newAddress) {
		try {
			if (RestaDAO.insert(newAddress)) {
				EndView.succMsg("\n새로운 주소 정보 저장 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("\n다시 입력해주십시오.");
		}
	}

	public void update(String address, String newCategory) {
		try {
			if (RestaDAO.update(address, newCategory)) {
				EndView.succMsg("\n수정된 주소 정보 저장 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("\n수정 불가능합니다.");
		}
	}

	public void delete(String address) {
		try {
			if (RestaDAO.delete(address)) {
				EndView.succMsg("\n주소 삭제 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("\n주소 삭제 실패");
		}
	}
}
