/*1.  서버 내부에 이 객체 수를 하나만 절대적으로 보장하는 구조 
 * 2. singleton design pattern 
 * 		1. 객체 수는 무조건 하나 
 * 		2. 개발 구조 
 * 			1. 생성자는 외부 클래스에게 은닉
 * 				private 생성자([...]){[...]}
 * 			2. 동일한 클래스 내에서 생성자 호출
 * 				- 객체 생성 
 * 			3. 생성된 객체를 외부 클래스에서 사용하게 하려면?
 * 				- 생성된 객체의 주소값 반환
 * 				- 이 기능의 메소드는 public
 * 				- 이 메소드 호출 시점은 외부 클래스에서 
 * 					객체 생성 없이 호출 따라서 메소드 static 
 * 
 * 
 */




package probono.service;

import probono.model.dto.Activist;

import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;


public class ProbonoProjectServiceArray {
	
	private static ProbonoProjectServiceArray instance = new ProbonoProjectServiceArray();
	
	private ProbonoProject[] projectList = new ProbonoProject[10];
	private int index;

	private ProbonoProjectServiceArray(){}
	
	public static ProbonoProjectServiceArray getInstance(){//if조건 안씀 - performance가 좋지 않음. 느려짐 
		return instance;
	}
	
	//모든 Project 반환
	public ProbonoProject[] getAllProjects() {//메소드를 쓰면 projectList라는 값을 반환한다 
		return projectList;
	}

	//Project 검색
	public ProbonoProject getProbonoProject(String projectName) { //return값은 ProbonoProject이다 
		ProbonoProject project = null;
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				project = projectList[i];
				break;
			}
		}
		return project;
	}

	//Project 추가
	public void projectInsert(ProbonoProject project) {
		projectList[index++] = project;
	}
	
	
	//??? 다형성 적용 메소드로 확장하기
	//instanceof - 객체 타입 비교 연산자 활용
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정 
	public void projectUpdate(String projectName, People people){//people 부모고, recipient와 activist는 자식이라서..... 
	/*	for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
			if (people instanceof Activist ) {
					Activist p = (Activist) people;
					projectList[i].setActivist(p);
					}else if (people instanceof Recipient){
					Recipient p2 = (Recipient) people;
					projectList[i].setReceive(p2);
				}
				
			}
			*/
			
		ProbonoProject a =	getProbonoProject(projectName) ;
				if (people instanceof Activist ) {
					Activist p = (Activist) people;
					a.setActivist(p);
					}else if (people instanceof Recipient){
					Recipient p2 = (Recipient) people;
					a.setReceive(p2);
				}
				
			}
		
		
		/*참고
		public boolean equals(Object o) {
			if(o instanceof PeopleDTO) {//객체 타입 비교 형변환이 되는지 보기 위해 
				PeopleDTO p = (PeopleDTO) o;
				// data멤버 변수 비교를 위한 형변환 
			
				//이 메소드를 보유한 객체의 data 변수와
				//parameter로 유입된 객체의 data 변수의 비교
				
				if(name.equals(p.getName()) && age == p.age);
					return true; 
				}
			
			return false;
		}*/
		
		
	

	
	
	 //Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList[i].getProbonoProjectName().equals(projectName)) {
				projectList[i] = null;
				break;
			}
		}
	}
	

	
	
	//Project 개수
	public int projectListSize(){
		return index;
	}
}
