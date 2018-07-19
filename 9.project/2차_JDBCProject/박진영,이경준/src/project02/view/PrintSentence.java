package project02.view;

import java.io.BufferedReader;
import java.io.IOException;

import project02.domain.ArcadeInfoDTO;
import project02.domain.ContractDTO;

public class PrintSentence {
	public static void printMain() {
		System.out.println("1. 모든 지하철 상가 검색");
		System.out.println("2. 해당 호선 상가 검색");
		System.out.println("3. 해당 역 상가 검색");
		System.out.println("4. 전역 공실 상가 검색");
		System.out.println("5. 새로운 상가 계약 작성");
		System.out.println("6. 해당 상가 계약 수정");
		System.out.println("7. 상가 정보 삭제");
		System.out.println("8. 종료");
	}
	
	public static ArcadeInfoDTO printInsert(String data, BufferedReader in) throws IOException {
		ArcadeInfoDTO arcadeInfo = new ArcadeInfoDTO();
		ContractDTO contract = new ContractDTO();
		System.out.println("새로 작성하실 상가의 용도를 입력해주세요 : ");
		System.out.println("Ex) 공실, 복합 등");
		data = in.readLine();
		contract.setArcadeType(data);
		
		System.out.println("해당 상가의 호선을 입력해주세요.");
		System.out.println("Ex) 9호선 => 9호선, 2호선 => 2호선");
		data = in.readLine();
		arcadeInfo.setLine(data);
		
		System.out.println("해당 역 명을 입력해주세요.");
		System.out.println("Ex) 노량진 => 노량진역, 광화문 => 광화문역");
		data = in.readLine();
		arcadeInfo.setStation(data);
		
		System.out.println("상가번호를 입력해주세요.");
		System.out.println("Ex) 1호선 => 100-001 ~ 199-999, 2호선 => 200-001 ~ 299-999, ... ");
		data = in.readLine();
		contract.setArcadeID(data);
		
		System.out.println("상가 면적을 입력해주세요.");
		System.out.println("Ex) 151.23, 27.32 ");
		data = in.readLine();
		arcadeInfo.setArea((Double.valueOf(data)));
		
		System.out.println("업종을 입력해주세요.");
		System.out.println("Ex) 편의점, 의류 ");
		data = in.readLine();
		contract.setBusinessType(data);
		
		System.out.println("계약 시작일을 입력해주세요.");
		System.out.println("Ex) 2018-07-16 ");
		data = in.readLine();
		contract.setContractStartDate(data);
		
		System.out.println("계약 종료일을 입력해주세요.");
		System.out.println("Ex) 2020-07-16 ");
		data = in.readLine();
		contract.setContractEndDate(data);
		
		System.out.println("임대료/임차료를 입력해 주세요..");
		System.out.println("Ex) 3000000, 500000");
		data = in.readLine();
		contract.setRental(Integer.parseInt(data));
		
		System.out.println("비고를 입력해 주세요.");
		System.out.println("Ex) 공실, 명도거부, 입찰공고중 ");
		data = in.readLine();
		contract.setNote(data);
		
		arcadeInfo.setContractInfo(contract);
		
		return arcadeInfo;
	}

	public static ContractDTO printUpdate(String data, BufferedReader in) throws IOException {
		ContractDTO contract= new ContractDTO();
		System.out.println("해당 상가의 번호를 입력해 주세요.");
		System.out.println("Ex) 153-111, 231-235");
		data = in.readLine();
		contract.setArcadeID(data);
		
		System.out.println("상가의 용도를 입력해주세요 : ");
		System.out.println("Ex) 공실, 복합 등");
		data = in.readLine();
		contract.setArcadeType(data);
		
		System.out.println("업종을 입력해주세요.");
		System.out.println("Ex) 편의점, 의류 ");
		data = in.readLine();
		contract.setBusinessType(data);
		
		System.out.println("계약 시작일을 입력해주세요.");
		System.out.println("Ex) 2018-07-16 ");
		data = in.readLine();
		contract.setContractStartDate(data);
		
		System.out.println("계약 종료일을 입력해주세요.");
		System.out.println("Ex) 2020-07-16 ");
		data = in.readLine();
		contract.setContractEndDate(data);
		
		System.out.println("임대료/임차료를 입력해 주세요..");
		System.out.println("Ex) 3000000, 500000");
		data = in.readLine();
		contract.setRental(Integer.parseInt(data));
		
		System.out.println("비고를 입력해 주세요.");
		System.out.println("Ex) 공실, 명도거부, 입찰공고중 ");
		data = in.readLine();
		contract.setNote(data);
		
		return contract;
	}
}
