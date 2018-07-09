/*
 * 1. 서버 내부에 이 객체 수를 하나만 절대적으로 보장하는 구조
 * 2. singleton design pattern
 * 		1. 객체 수는 무조건 하나
 * 		2. 개발 구조
 * 			1. 생성자는 외부 클래스에게 은닉
 * 				private 생성자 ( [...] ) { [...] }
 * 			2. 동일한 클래스 내에서 생성자 호출
 * 				- 객체 생성
 * 			3. 생성된 객체를 외부 클래스에서 사용하게 하려면?
 * 				- 생성된 객체의 주소값 반환
 * 				- 이 기능의 메소드는 public
 * 				- 이 메소드 호출 시점은 외부 클래스에서 객체 생성없이 호출 따라서 메소드는 static 이여야 함 
 */
package probono.service;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
//	private static ProbonoProjectService instance = null
//	private ProbonoProject[] projectList = new ProbonoProject[10]; 
	ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();
	private int index;

	private ProbonoProjectService(){} 
	
	public static ProbonoProjectService getInstance(){
//		if(instance == null)
//			instance = new ProbonoProjectService(); 와 같이 하면 보안적으로 강화 하는 것이고 if 를 안쓰고 위와 같이 쓰면 속도적 측면에서 우위를 점한다.
		return instance;
	}
	
	//모든 Project 반환
//	public ProbonoProject[] getAllProjects() {
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	//Project 검색
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
//		System.out.println(projectList.get(0));
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
//				System.out.println(projectList.get(0));

				project = projectList.get(i);
				break;
			}
		}
		return project;
	}

	//Project 추가
	public void projectInsert(ProbonoProject project) {
		projectList.add(project);
	}
	
	
	//??? 다형성 적용 메소드로 확장하기
	//instanceof - 객체 타입 비교 연산자 활용
	//Project 수정 - 프로젝트 명으로 재능 기부자 수정 
	public void projectUpdate(String projectName, People people){
		for(int i = 0 ; i < projectList.size() ; i ++) {
			if(projectList.get(i) != null && projectList.get(i).getProbonoProjectName().equals(projectName))
				if(people instanceof Activist) {
					projectList.get(i).setActivist((Activist)people);
				} else if(people instanceof Recipient) {
					projectList.get(i).setReceive((Recipient)people);
				}
		}	
	}

	 //Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		for (int i = 0; i < index; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}
	
	//Project 개수
	public int projectListSize(){
		return index;
	}
}
