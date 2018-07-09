package bikeseoul.view;

import java.util.ArrayList;
import java.util.List;

import bikeseoul.domain.BikeSeoulDTO;
import bikeseoul.domain.Station;

public class EndView {

	public static void printAll(List<BikeSeoulDTO> list) {
		System.out.println("--------------------------결과출력----------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getStation());
		}
	}
	public static void printAll2(List<BikeSeoulDTO> list) {
		System.out.println("--------------------------결과출력----------------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getStation()+", "+list.get(i).getRent());
		}
	}
	public static void printOne(BikeSeoulDTO One,int instance) {
		System.out.println("--------------------------결과출력----------------------------------");
		
		if (instance == 1) {
			System.out.println("ID = " + One.getId() + "  " + One.getStation());
		}
		else if(instance ==2) {
			System.out.println("ID = " + One.getId() + "  " +One.getStation().getName()+"  " + One.getLocation());
		}
		else if(instance ==3) {
			System.out.println("ID = " + One.getId() + "  " +One.getStation().getName()+"  " + One.getRent());
		}
	}
	

	
}
