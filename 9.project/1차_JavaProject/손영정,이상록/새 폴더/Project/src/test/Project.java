package test;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
public class Project {

	   static ArrayList<DataDTO> datas2016 = new ArrayList<DataDTO>();
	   static ArrayList<DataDTO> datas2015 = new ArrayList<DataDTO>();
	   static ArrayList<DataDTO> datas2014 = new ArrayList<DataDTO>();
	   static ArrayList<DataDTO> datas2013 = new ArrayList<DataDTO>();
	   
	   public static int sub(int a,int b) {
	      return b-a;
	   }
	   
	   
	   public static int sum(int a,int b) {
	      return a+b;
	   }
	   
	   public static float ratio(float a,float b) {
		   return (float)b/(float)(a+b);
	   }
	   
	   public static void a(int a)
	   {Dimension dim = new Dimension(1000, 300);
	   JFrame frame = new JFrame("비정상 비율");
	   frame.setLocation(200, 400);
	   frame.setPreferredSize(dim);
	   DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();   
	   celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
	      String header[] = {"연도","2013","2014","2015","2016"};
	      String contents[][] ={
	    		  {"범죄명수",Integer.toString(datas2013.get(a).getTotal()),Integer.toString(datas2014.get(a).getTotal()),Integer.toString(datas2015.get(a).getTotal()),Integer.toString(datas2016.get(a).getTotal())},
	    		  {"연도별증감","",Integer.toString(sub(datas2013.get(a).getTotal(),datas2014.get(a).getTotal())),Integer.toString(sub(datas2014.get(a).getTotal(),datas2015.get(a).getTotal())),Integer.toString(sub(datas2015.get(a).getTotal(),datas2016.get(a).getTotal()))},
	    		  {"정상",Integer.toString(sum(datas2013.get(a).getNormalMen(),datas2013.get(a).getNormalWomen())),Integer.toString(sum(datas2014.get(a).getNormalMen(),datas2014.get(a).getNormalWomen())),Integer.toString(sum(datas2015.get(a).getNormalMen(),datas2015.get(a).getNormalWomen())),Integer.toString(sum(datas2016.get(a).getNormalMen(),datas2016.get(a).getNormalWomen()))},
	    		  {"비정상",Integer.toString(sum(datas2013.get(a).getAbnormalMen(),datas2013.get(a).getAbnormalWomen())),Integer.toString(sum(datas2014.get(a).getAbnormalMen(),datas2014.get(a).getAbnormalWomen())),Integer.toString(sum(datas2015.get(a).getAbnormalMen(),datas2015.get(a).getAbnormalWomen())),Integer.toString(sum(datas2016.get(a).getAbnormalMen(),datas2016.get(a).getAbnormalWomen()))},
	    		  {"비정상의 비율",Float.toString(ratio(sum(datas2013.get(a).getNormalMen(),datas2013.get(a).getNormalWomen()),sum(datas2013.get(a).getAbnormalMen(),datas2013.get(a).getAbnormalWomen()))),Float.toString(ratio(sum(datas2014.get(a).getNormalMen(),datas2014.get(a).getNormalWomen()),sum(datas2014.get(a).getAbnormalMen(),datas2014.get(a).getAbnormalWomen()))),Float.toString(ratio(sum(datas2015.get(a).getNormalMen(),datas2015.get(a).getNormalMen()),sum(datas2015.get(a).getAbnormalMen(),datas2015.get(a).getAbnormalWomen()))),Float.toString(ratio(sum(datas2016.get(a).getNormalMen(),datas2016.get(a).getNormalWomen()),sum(datas2016.get(a).getAbnormalMen(),datas2016.get(a).getAbnormalWomen())))} 		 
	      };
	      JTable table =new JTable(contents, header);
	      JScrollPane scrollpane = new JScrollPane(table);
	      TableColumnModel tcm = table.getColumnModel();
	      for(int i=0; i <tcm.getColumnCount();i++){
	    	  tcm.getColumn(i).setCellRenderer(celAlignCenter);
	      }
	      frame.add(scrollpane);
	      frame.pack();
	      frame.setVisible(true);
	      
		System.out.println("연도   \t\t\t2013\t\t\t2014\t\t\t2015\t\t\t2016");
		System.out.println("범죄 명수\t\t\t" + datas2013.get(a).getTotal() + "\t\t" + datas2014.get(a).getTotal() + "\t\t"
				+ datas2015.get(a).getTotal() + "\t\t" + datas2016.get(a).getTotal());
		System.out.println("연도별증감\t\t\t" + sub(datas2013.get(a).getTotal(), datas2014.get(a).getTotal()) + "\t\t"
				+ sub(datas2014.get(a).getTotal(), datas2015.get(a).getTotal()) + "\t\t"
				+ sub(datas2015.get(a).getTotal(), datas2016.get(a).getTotal()));
		System.out.println("\n연도   \t\t\t2013\t\t\t2014\t\t\t2015\t\t\t2016");
		System.out.println("정상\t\t\t" + sum(datas2013.get(a).getNormalMen(), datas2013.get(a).getNormalWomen())
				+ "\t\t\t" + sum(datas2014.get(a).getNormalMen(), datas2014.get(a).getNormalWomen()) + "\t\t\t"
				+ sum(datas2015.get(a).getNormalMen(), datas2015.get(a).getNormalWomen()) + "\t\t\t"
				+ sum(datas2016.get(a).getNormalMen(), datas2016.get(a).getNormalWomen()));
		System.out.println("비정상\t\t\t" + sum(datas2013.get(a).getAbnormalMen(), datas2013.get(a).getAbnormalWomen())
				+ "\t\t\t" + sum(datas2014.get(a).getAbnormalMen(), datas2014.get(a).getAbnormalWomen()) + "\t\t\t"
				+ sum(datas2015.get(a).getAbnormalMen(), datas2015.get(a).getAbnormalWomen()) + "\t\t\t"
				+ sum(datas2016.get(a).getAbnormalMen(), datas2016.get(a).getAbnormalWomen()));
		System.out
				.println(
						"비정상의 비율\t\t"
								+ ratio(sum(datas2013.get(a).getNormalMen(), datas2013.get(a).getNormalWomen()),
										sum(datas2013.get(a).getAbnormalMen(), datas2013.get(a).getAbnormalWomen()))
								+ "\t\t\t"
								+ ratio(sum(datas2014.get(a).getNormalMen(), datas2014.get(a).getNormalWomen()),
										sum(datas2014.get(a).getAbnormalMen(), datas2014.get(a).getAbnormalWomen()))
								+ "\t\t\t"
								+ ratio(sum(datas2015.get(a).getNormalMen(), datas2015.get(a).getNormalMen()),
										sum(datas2015.get(a).getAbnormalMen(), datas2015.get(a).getAbnormalWomen()))
								+ "\t\t\t"
								+ ratio(sum(datas2016.get(a).getNormalMen(), datas2016.get(a).getNormalWomen()),
										sum(datas2016.get(a).getAbnormalMen(), datas2016.get(a).getAbnormalWomen()))
								+ "\n");

	   }
	   

	

	public static void main(String[] args) throws IOException {
	      BufferedReader br1 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2016범죄 정신.csv"));
	      BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
	      
	   
	   
	   String[] dataOne = null;
	   String line = null;
	   while (true) {
	      line = br1.readLine();
	      if (line == null) {
	         break;
	      }
	      dataOne = line.split(",");
	      datas2016.add(new DataDTO(dataOne[0], dataOne[1], Integer.parseInt(dataOne[2]), 
	                                 Integer.parseInt(dataOne[3]), Integer.parseInt(dataOne[4]), 
	                                 Integer.parseInt(dataOne[5]), Integer.parseInt(dataOne[6]), 
	                                 Integer.parseInt(dataOne[7]), Integer.parseInt(dataOne[8])));
	   }
	  
	   BufferedReader br3 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2015범죄 정신.csv"));
	      
	   
	   
	    String[] dataTwo = null;
	    String linetwo = null;
	   while (true) {
	      linetwo= br3.readLine();
	      if (linetwo == null) {
	         break;
	      }
	      dataTwo = linetwo.split(",");
	      datas2015.add(new DataDTO(dataTwo[0], dataTwo[1], Integer.parseInt(dataTwo[2]), 
	                                 Integer.parseInt(dataTwo[3]), Integer.parseInt(dataTwo[4]), 
	                                 Integer.parseInt(dataTwo[5]), Integer.parseInt(dataTwo[6]), 
	                                 Integer.parseInt(dataTwo[7]), Integer.parseInt(dataTwo[8])));
	   }

	   BufferedReader br4 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2014범죄 정신.csv"));
	      
	   
	   String[] dataOne2 = null;
	   String line2 = null;
	   while (true) {
	      line2 = br4.readLine();
	      if (line2 == null) {
	         break;
	      }
	      dataOne2 = line2.split(",");
	      datas2014.add(new DataDTO(dataOne2[0], dataOne2[1], Integer.parseInt(dataOne2[2]), 
	                                 Integer.parseInt(dataOne2[3]), Integer.parseInt(dataOne2[4]), 
	                                 Integer.parseInt(dataOne2[5]), Integer.parseInt(dataOne2[6]), 
	                                 Integer.parseInt(dataOne2[7]), Integer.parseInt(dataOne2[8])));
	   }
	   
	   BufferedReader br5 =new BufferedReader(new FileReader("D:/ITstudy/javaproject/2013범죄 정신.csv"));
	      
	   
	   String[] dataOne3 = null;
	   String line3 = null;
	   while (true) {
	      line3 = br5.readLine();
	      if (line3 == null) {
	         break;
	      }
	      dataOne3 = line3.split(",");
	      datas2013.add(new DataDTO(dataOne3[0], dataOne3[1], Integer.parseInt(dataOne3[2]), 
	                                 Integer.parseInt(dataOne3[3]), Integer.parseInt(dataOne3[4]), 
	                                 Integer.parseInt(dataOne3[5]), Integer.parseInt(dataOne3[6]), 
	                                 Integer.parseInt(dataOne3[7]), Integer.parseInt(dataOne3[8])));
	   }
	   
	   

		char a='\u0000';
		do {
		System.out.println("다음중 찾고자 하는 범죄의 대분류를 고르시오");
		System.out.println("강력범죄, 절도범죄, 폭력범죄, 지능범죄, 풍속범죄, 특별경제범죄, 마약범죄, 보건범죄, 환경범죄, 교통범죄,\n 노동범죄, 안보범죄, 선거범죄, 병역범죄, 기타범죄 ");
		String maincategory =br2.readLine();
		
		switch(maincategory) {
			case "강력범죄" : System.out.println("다음중 찾고자 하는 범죄의 중분류를 고르시오");
								   {	
									   for(int i = 0; i<=7; i++){
										System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
										}
									   System.out.println();
									   
								   String divisioncategory1 =br2.readLine();
								  
								   switch(divisioncategory1) {
								   case "살인기수" : 
			                           a(0);
			                           break;
			                        case "살인미수" :
			                           a(1);
			                        break;
			                        case "강도" :
			                           a(2);
			                           break;
			                        case "강간" : 
			                           a(3);
			                           break;
			                        case "유사강간" :
			                           a(4);
			                           break;
			                        case "강제추행" :
			                           a(5);
			                           break;
			                        case "기타강간" : 
			                           a(6);
			                           break;
			                        case "방화" :
			                           a(7);
			                           break;

								   default :	 System.out.println("철자가 틀렸습니다.");
								   	}
								   break;
										}
								   
								   
			case "절도범죄" :	a(8);
									break;
			case "폭력범죄" :   System.out.println("다음중 찾고자 하는 범죄의 중분류를 고르시오");
									   {	
										   for(int i = 9; i<=16; i++){
											System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
											}
										   
									   String divisioncategory3 =br2.readLine();
									  
									   switch(divisioncategory3) {
									   case "상해" :
				                           a(9);
				                           break;
				                        case "폭행" :
				                           a(10);
				                           break;
				                        case "체포 감금" :
				                           a(11);
				                           break;
				                        case "협박" :
				                           a(12);
				                                 break;
				                        case "약취 유인" :
				                           a(13);
				                           break;
				                        case "폭력행위" :
				                           a(14);
				                           break;
				                        case "공갈" :
				                           a(15);
				                           break;
				                        case "손괴" :
				                           a(16);
				                           break;

									   default :	 System.out.println("철자가 틀렸습니다.");
									   	}
									   break;
											}
			case "지능범죄" :   System.out.println("다음중 찾고자 하는 범죄의 중분류를 고르시오");
									   {	
										   for(int i = 17; i<=25; i++){
											System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
											}
										   
									   String divisioncategory4 =br2.readLine();
									  
									   switch(divisioncategory4) {
									   case "직무유기" :
				                           a(17);
				                           break;
				                        case "직권남용" :
				                           a(18);
				                           break;
				                        case "증수뢰" :
				                           a(19);
				                           break;
				                        case "통화" :
				                           a(20);
				                           break;
				                        case "문서 인장" :
				                           a(21);
				                           break;
				                        case "유가증권인지" :
				                        	a(22);
				                        case "사기" :
				                           a(23);
				                           break;
				                        case "횡령" :
				                           a(24);
				                           break;
				                        case "배임" :
				                           a(25);
				                           break;
				                        default : System.out.println("철자가 틀렸습니다.");
				                        }
				                        break;
											}
			case "풍속범죄" :   System.out.println("다음중 찾고자 하는 범죄의 중분류를 고르시오");
									   {	
										   for(int i = 26; i<=27; i++){
											System.out.print(datas2016.get(i).getDivisionCategory()+"  ");
											}
										   
									   String divisioncategory5 =br2.readLine();
									  
									   switch(divisioncategory5) {
									   case "성풍속범죄" :
				                           a(26);
				                           break;
				                        case "도박범죄" :
				                           a(27);
				                           break;

									   default :	 System.out.println("철자가 틀렸습니다.");
									   	}
									   break;
											}
			case "특별경제범죄" :a(28);
									break;
			case "마약범죄" :a(29);
									break;
			case "보건범죄" :a(30);
									break;
			case "환경범죄" :a(31);
									break;
			case "교통범죄" :a(32);
									break;
			case "노동범죄" :a(33);
									break;
			case "안보범죄" :a(34);
									break;
			case "선거범죄" :a(35);
									break;
			case "병역범죄" :a(36);
									break;
			case "기타범죄" :a(37);
									break;
			default : 	System.out.println("철자가 틀리셨습니다.");
			}
		System.out.println("다시 하시겠습니까? (Y,y / y 이외)");
		a=br2.readLine().charAt(0);
		
		}while(a=='Y'||a=='y');
		System.out.println("프로그램이 종료되었습니다. 고생하셨습니다.");
		
		br1.close();
		br2.close();
		br3.close();
		br4.close();
		br5.close();
		}
}



