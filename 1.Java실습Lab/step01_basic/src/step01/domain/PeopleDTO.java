/* Data Trasfer Object = Value Object = Java Bean
 * 1. 명명규칙
 * 		- 도메인DTO.java/도메인VO.java/도메인Bean.java/도메인.java
 * 2. 구조
 * 		- 멤버 변수 : private
 * 		- 멤버 메소드 : 변수 즉 데이터값 반환, 데이터값 수정 로직으로만 구성
 * 							 데이터 수정 메소드에는 값의 유효성 검증 구현
 * 		- 생성자 : 기본생성자, 멤버 변수들 초기화 생성자

 * 		- toString() : 멤버 변수들값 결합해서 반환하는 메소드 
 */
package step01.domain;

public class PeopleDTO {
	private String name;
	private int age;
	
	public PeopleDTO() {}
	public PeopleDTO(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PeopleDTO [name=" + name + ", age=" + age + "]";
	}
	
}






