package probono.view;

import java.util.ArrayList;

import probono.model.dto.ProbonoProject;

public class RunningEndView {
	
	//특정 프로젝트 출력 
	public static void projectView(ProbonoProject project){
		System.out.println(project);		
	}
	
	//모든 프로젝트 출력
	public static void projectListView(ArrayList<ProbonoProject> allProbonoProject){
		int count = allProbonoProject.size();
		for (int index = 0; index < count; index++) {	
			if(allProbonoProject.get(index) != null){
				System.out.println("[프로젝트 " + (index+1) + "]\n" + allProbonoProject.get(index));
			}
		}
	}
}
