package project02.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import project02.controller.ProjectController;
import project02.domain.ContractDTO;

public class RunningStartView {

	public static void main(String[] args) {
		ProjectController controller = ProjectController.getInstance();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String data = null;
		
		System.out.println("지하철 상가 계약 프로그램");
		try {
			data = in.readLine();
			while (data !=null) {
				Thread.sleep(1000);
				PrintSentence.printMain();
				try {
					data = in.readLine();
					if(Integer.parseInt(data) == 1) {			// 전체 지하철 상가 정보 검색
						controller.getAll();
					}
					else if(Integer.parseInt(data) ==2) {		// 해당 호선 상가 정보 검색
						System.out.println("검색하실 호선을 입력하세요.");
						System.out.println("Ex) 1호선 => 1호선, 9호선 => 9호선");
						data = in.readLine();
						controller.getLineInfo(data);
					}
					else if(Integer.parseInt(data) ==3) {		// 해당 역 상가 정보 검색
						System.out.println("검색하실 역명을 입력하세요.");
						System.out.println("Ex) 역삼=> 역삼역, 삼성=> 삼성역");
						data = in.readLine();
						controller.getStationInfo(data);
					}
					else if(Integer.parseInt(data) ==4) {		// 전역 공실 상가 검색
						System.out.println("-------------------- 전역의 공실인 상가 정보입니다. --------------------");
						controller.getEmptySpace();
					}
					else if(Integer.parseInt(data) ==5) {		// 새로운 상가 계약서 작성
						controller.insert(PrintSentence.printInsert(data, in));	// 너무 길어서 printsetence로 뺐습니다
					}
					
					else if(Integer.parseInt(data) ==6) {		// 해당 상가 계약정보 수정
						ContractDTO con = PrintSentence.printUpdate(data,in); 
						controller.update(con.getArcadeID(), con);
					}
					else if(Integer.parseInt(data) ==7) {		// 해당 상가 정보 삭제 
						System.out.println("정보를 삭제하실 상가번호를 입력해주세요.");
						data = in.readLine();
						controller.delete(data);
					}
					
					else if(Integer.parseInt(data) ==8) {		//종료
						System.out.println("프로그램을 종료합니다.");
						break;
					}
				}catch(Exception e) {
					System.out.println("입력값이 바르지 않습니다");
				}
			}
		}catch (Exception e) {
			System.out.println("입력값이 바르지 않습니다");
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println("입력값이 바르지 않습니다");
			}
		}
	}		
}
