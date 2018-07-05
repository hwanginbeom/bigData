/* 학습내용
 * 1. 주요 API
 * 		1. java.util 
 * 		2. ArrayList - 동적 배열과 흡사
 * 			- 첫 생성시 10개의 메모리 생성
 * 			- 11번째 데이터 넣으면 10개가 추가 생성
 * 		3. 메소드
 * 			1. 데이터 저장 : add(Object o)
 * 			2. 데이터 삭제 : remove(int index)
 * 			3. 데이터 반환 : Object get(int index)
 * 			4. 데이터 개수 : size()
 */

package step01.util;

import java.util.ArrayList;

import model.domain.PeopleDTO;

public class Step01ListTest {

	public static void main(String[] args) {
		System.out.println("--- 제네릭 미 반영 ---");
		ArrayList a = new ArrayList();
		a.add(3);//new Integer(3)
		a.add("ans");
		//? index 1번째의 문자열 객체만이 보유한 charAt(1)
		String v = (String)a.get(1);
		System.out.println(v.charAt(1));
		
		System.out.println(((String)a.get(1)).charAt(1));
		
		
		System.out.println("--- 제네릭 적용한 list : jdk1.5부터 제시 ---");
		//String들만 저장 가능함 동적 메모리의 배열 형태 객체 생성
		//타입 제약 - 제네릭
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(list.size());//0
		//데이터 저장
		list.add("이경준");//0번째 자동 저장
		
		//제네릭 구조는 형변환 없이 index 값으로 
		//실제 생성된 타입의 객체로 반환
		System.out.println(list.get(0).charAt(2));
		
		list.add("서아영");//1번째 자동 저장
		list.add("김혜경");
		list.add("김혜경");
		//list.add(new Integer(3)); 문법 오류 왜? String 저장 가능
		System.out.println(list.size());//
		
		//index로 1에 저장된 데이터 반환 및 출력
		System.out.println(list.get(1));//서아영
		
		//데이터 삭제
		list.remove(1);
		System.out.println(list.size());//
		System.out.println(list.get(1));//
		
		System.out.println(list);
		
		
		
		System.out.println("--- DTO 객체 활용해 보기 ---");
		ArrayList<PeopleDTO> list2 = new ArrayList<PeopleDTO>();	
		list2.add(new PeopleDTO("우현", 20));
		list2.add(new PeopleDTO("현주", 10));
		
		PeopleDTO one = list2.get(0);
		String name = one.getName();
		System.out.println(name);
		
		System.out.println(list2.get(0).getName());
		System.out.println(list2.get(1).getAge());
	}
}






