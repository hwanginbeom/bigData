package country.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import country.domain.China;
import country.domain.CountryDTO;
import country.domain.Japan;
import country.domain.Korea;

public class CsvInput {
		static ArrayList<CountryDTO> countryList = new ArrayList<CountryDTO>();

	   static {
	      BufferedReader readFile = null;
	      try {
	    	  readFile = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\ITStudy\\1.java\\data.csv"), "euc-kr"));
	         String data = readFile.readLine();
	         String[] temp_1 = null;
	         String[] temp_2 = null;
	         String[] temp_3 = null;
	         
	         while (data != null) {
	        	 data = readFile.readLine();
	        	 if(data == null) {
	        		 break;
	        	 } // csv 파일의 총 갯수가 3의 배수로 끝나기 때문에 해당 readLine() 에서 null이 입력된다면 데이터 호출을 종료한다.
	        	 temp_1 = data.split(",");
	        	 data = readFile.readLine();
	        	 temp_2 = data.split(",");
	        	 data = readFile.readLine();
	        	 temp_3 = data.split(",");
	        	 countryList.add(new CountryDTO((temp_1[0]), 
	        			 new Korea(temp_1[1],Integer.parseInt(temp_1[2]),Integer.parseInt(temp_1[3]),Integer.parseInt(temp_1[4]),Integer.parseInt(temp_1[5]),
	        					 Integer.parseInt(temp_1[6]),Integer.parseInt(temp_1[7]),Integer.parseInt(temp_1[8])),
	        			 new Japan(temp_2[1],Integer.parseInt(temp_2[2]),Integer.parseInt(temp_2[3]),Integer.parseInt(temp_2[4]),Integer.parseInt(temp_2[5]),
	        					 Integer.parseInt(temp_2[6]),Integer.parseInt(temp_2[7]),Integer.parseInt(temp_2[8])),
	        			 new China(temp_3[1],Integer.parseInt(temp_3[2]),Integer.parseInt(temp_3[3]),Integer.parseInt(temp_3[4]),Integer.parseInt(temp_3[5]),
	        					 Integer.parseInt(temp_3[6]),Integer.parseInt(temp_3[7]),Integer.parseInt(temp_3[8]))));

	        	 } // 각 생성자안의 parameter 에 생성자를 삽입한다. 
	     
	      } catch (Exception e) {
	         e.printStackTrace();
	      }  finally {
	         try {
	        	 readFile.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }
}
