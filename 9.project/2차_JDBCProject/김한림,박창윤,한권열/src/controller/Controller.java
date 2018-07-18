package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ApartDAO;
import model.ApartDAO;
import model.domain.ApartDTO;
import model.domain.ApartDTO;
import view.EndView;

public class Controller {
	// 모든 검색
		/*
		 * 발생 가능한 경우의 수 1. 정상 실행 -데이터가 있다 = EndView에게 ArrayList 객체 전송 -데이터가 없다 =
		 * EndView에서 검색한 데이터 없다..메세지 2. 비정상 실행 -예외 발생 : 죄송합니다. 잠시후에 재 요청 바랍니다. 메세지
		 */
		private static Controller instance = new Controller();

		private Controller() {}

		public static Controller getInstance() {
			return instance;
		}

		public void getAll() {
			try {
				ArrayList<ApartDTO> datas = ApartDAO.getAll();
				if(datas.size()!=0) {
					EndView.printAll(datas);
				}else {
					EndView.succMsg("검색한 데이터 없습니다.");
				}
			} catch (Exception e) {
				e.printStackTrace();
				EndView.errorMsg("죄송합니다. 잠시후에 재요청 바랍니다.");
				}
		}
		
		//검색
		public void getApt(String area_name) {
			try {
				ArrayList <ApartDTO> datas = ApartDAO.getApt(area_name);
				if(datas.size() != 0) {
					EndView.printAll(datas);
				} else {
					EndView.succMsg("검색한 부동산 데이터 없습니다");
				}
			} catch (Exception e) {
				e.printStackTrace();
				EndView.errorMsg("죄송합니다. 잠시 후에 재요청 바랍니다");
			}
		}

		// 새로운 정보 저장
		public void insert(ApartDTO newApt) {
			try {
				if (ApartDAO.insert(newApt)) {
					EndView.succMsg("새로운 부동산 정보 저장 성공");
				};
			} catch (SQLException e) {
				e.printStackTrace();
				EndView.errorMsg("이미 존재하는 부동산 정보입니다");
			}
		}
		
		// 수정
		public void update(int price, String area_name) {
			try {
				if (ApartDAO.update(price, area_name)) {
					EndView.succMsg(area_name + "가격 수정 성공");
				};
			} catch (SQLException e) {
				e.printStackTrace();
				EndView.errorMsg("가격 수정 실패하였습니다");
			}
		}	
		
		//삭제
		public void delete(String area_name) {
			try {
				if (ApartDAO.delete(area_name)) {
					EndView.succMsg(area_name +" 지역 데이터 삭제 성공");
				};
			} catch (SQLException e) {
				e.printStackTrace();
				EndView.errorMsg("데이터 삭제 실패했습니다");
			}
		}
		//삭제
		public void getMyHome(String area, int area_size, int pay, int savings, String bank) {
				try {
					EndView.succMsg("내 집 마련하기까지 "+ ApartDAO.getMyHome(area, area_size, pay, savings, ApartDAO.getMyInterest(bank)) + "개월 남았습니다" + 
												"\n 은행 대출 이자율은 " +  bank + " 기준으로 "+ ApartDAO.getMyInterest(bank) +" 프로입니다");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	}

