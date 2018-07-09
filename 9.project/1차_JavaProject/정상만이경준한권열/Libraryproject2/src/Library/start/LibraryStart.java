package Library.start;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import Library.domain.LibraryDTO;

public class LibraryStart {

	public static void main(String[] args) {
		BufferedReader br = null;
		ArrayList<LibraryDTO> datas = null;

		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream("D:\\ITStudy\\libraryData.csv"), "euc-kr"));
			String line = null;
			String[] temp = null;

			datas = new ArrayList<LibraryDTO>();

			while ((line = br.readLine()) != null) {
				temp = line.split(",");
				datas.add(new LibraryDTO(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7],
						temp[8], temp[9], temp[10]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				br = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		Scanner scan = new Scanner(System.in);

		System.out.print("찾으시는 도서관의 순번을 입력하세요 : ");
		int number = scan.nextInt();
		
		if (number < datas.size() && number > 0) {
			System.out.println(datas.get(number));

		} else {
			System.out.println("자료를 찾을 수 없습니다.");

		}

	}

	// ArrayList에 저장된 DTO들을 하나씩 반환해서 출력하기
	// int count = datas.size();
	// for (int i = 0; i < count; i++) {
	// System.out.println(datas.get(i));
}
