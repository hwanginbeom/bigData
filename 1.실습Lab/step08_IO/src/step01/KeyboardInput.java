/* 학습 내용
 * 1. 실시간 키보드로 입력한 데이터를 실시간 콘솔창에 출력
 * 2. 구현 방법
 * 		키보드 입력(System.in) -> 엔터 -> 콘솔에 출력(System.out)
 * 		1. 실시간 : 반복문
 * 		2. read/write 메소드
 * 		3. 데이터 존재 여부 검증
 * 			- String 데이터 존재 여부 검증
 * 			- 비교 값은 null
 * 			- readLine() : Line 단위로 read
 * 	 3. IO의 실행 performance를 고려한 필터 API들 존재
 * 		1. 속도를 향상
 * 			- BufferedReader/BufferedWriter
 * 			- 시스템 실제 하드웨어 장비 버퍼 메모리 사용
 * 			- 사용 후에 코드로 자원 반환 필수
 * 		2. 옵션
 * 4. 절대적인 주의 사항
 * 		- 출력 API는 반드시 자원 반환전에 데이터를 메모리가 보유한 상태로
 * 		 목적지에 출력을 안 할 수도 있음
 * 		 왜? 버퍼 메모리 크기만큼 데이터가 쓰여있지 않으면 버퍼 메모리에 
 * 			데이터를 보유하고 있는 상황
 * 			단 버퍼 사이즈 만큼 데이터가 쓰여져 있다면 자동 출력(autoflush),
 * 			따라서 데이터 손실 방지를 위한 auto flush 기능의 메소드 코딩
 */
package step01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
	//step02 : 키보드 -> data.txt 파일로 출력
	public static void main(String[] args) {
		//read 객체
		BufferedReader in 
		= new BufferedReader(new InputStreamReader(System.in));
		
		//data.txt 파일에 2byte로 출력
		BufferedWriter out = null; 

		try {
			out = new BufferedWriter(new FileWriter("data.txt"));
			String data = in.readLine();
			while( data != null ) {
				out.write(data);
				out.newLine();
				data = in.readLine();
				out.flush();//데이터 손실을 위해서 목적지에 데이터 출력 보장
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();//사용했던 시스템 자원을 반환하기
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//step01 : 키보드 -> 콘솔창에 출력
	/*public static void main(String[] args) {
		BufferedReader in 
		= new BufferedReader(new InputStreamReader(System.in));
		try {
			String data = in.readLine();
			while( data != null ) {
				System.out.println(data);
				data = in.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();//사용했던 시스템 자원을 반환하기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/
}





