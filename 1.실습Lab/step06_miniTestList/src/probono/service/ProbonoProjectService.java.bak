/* 1. 서버 내부에 이 객체 수를 하나만 절대적으로 보장하는 구조
 * 2. Singleton Design Pattern
 * 		1. 객체 수는 무조건 하나
 * 		2. 개발 구조
 * 			1. 생성자는 외부 클래스에게 은닉
 * 				- private 생성자([..]){[..]}
 * 			2. 동일한 클래스 내에서 생성자 호출
 * 				- 객체 생성
 * 			3. 생성된 객체를 외부 클래스에서 사용하게 하려면?
 * 				- 생성된 객체의 주소값 반환
 * 				-  이 기능의 메소드는 public
 * 				- 이 메소드 호출 시점은 외부 클래스에서 
 * 				  객체 생성없이 호출 따라서 메소드 static
 */
package probono.service;

import java.util.ArrayList;

import probono.model.dto.Activist;
import probono.model.dto.People;
import probono.model.dto.ProbonoProject;
import probono.model.dto.Recipient;

public class ProbonoProjectService {
	
	private static ProbonoProjectService instance = new ProbonoProjectService();
	
	private ArrayList<ProbonoProject> projectList = new ArrayList<ProbonoProject>();

	private ProbonoProjectService(){}
	
	public static ProbonoProjectService getInstance(){
		return instance;
	}
	
	//모든 Project 반환
	public ArrayList<ProbonoProject> getAllProjects() {
		return projectList;
	}

	//Project 검색
	/* 해당 프로젝트가 없는 경우 잘못된 데이터 요청입니다 등의 예외 발생?
	 * projectList[i] 배열에 데이터가 있다는 가정하에 메소드 호출
	 * 이 경우 배열에 null이 있다면  */
	public ProbonoProject getProbonoProject(String projectName) {
		ProbonoProject project = null;
		int count = projectList.size();
		for (int i = 0; i < count; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
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
	
	
	public void projectUpdate(String projectName, People people){
		
		ProbonoProject project = null;		
		
		int count = projectList.size();
		for (int i = 0; i < count; i++) {	
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				project = projectList.get(i);
				
				if(people instanceof Activist){		//기부자
					project.setActivist( (Activist)people );//기부자 정보 수정 메소드
				}else if(people instanceof Recipient){
					project.setReceive( (Recipient)people);//수혜자 정보 수정 메소드 
				}
				
				break;
			}
		}
	}
	
	 //Project 삭제 - 프로젝트명으로 해당 프로젝트 삭제
	public void projectDelete(String projectName) {
		int count = projectList.size();
		for (int i = 0; i < count; i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}
/*	ArrayList의 데이터 개수를 반환해주는 size() 호출 시
 * 데이터 수가 많을 경우 가급적 변수에 대입후에 변수 사용 권장
 * 메소드 호출시 기능만 보면 안되고 실행 performance도 고려
 * public void projectDelete2(String projectName) {
		for (int i = 0; i < projectList.size(); i++) {
			if (projectList.get(i).getProbonoProjectName().equals(projectName)) {
				projectList.remove(i);
				break;
			}
		}
	}*/
}







