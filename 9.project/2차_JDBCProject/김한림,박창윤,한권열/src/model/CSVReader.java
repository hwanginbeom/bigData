package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBUtil;

public class CSVReader {
	
	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
	String sql = " INSERT INTO Apart (area_name,area_size,year,month,price_per_m_2) VALUES(?,?,?,?,?) ";
	Connection con = null;
	PreparedStatement pstmt = null;
	try { 
	        BufferedReader bReader = new BufferedReader(new FileReader("전국_평균_분양가격_2018.5월_.csv"));
	        String line = ""; 
	        while ((line = bReader.readLine()) != null) {
	            try {
	
	                if (line != null) 
	                {
	                    String[] array = line.split(",+");
	                    for(String result:array)
	                    {
	                    	 con =DBUtil.getConnection();
			                 pstmt = con.prepareStatement(sql);               
			                 pstmt.setString(1, array[0]);
			                 pstmt.setString(2, array[1]);
			                 pstmt.setInt(3, Integer.parseInt(array[2]));
			                 pstmt.setInt(4, Integer.parseInt(array[3]));
			                 pstmt.setInt(5, Integer.parseInt(array[4]));
			                 pstmt.executeUpdate();
			                 pstmt.close();
	                    }
		                 
	                } 
	            }
	            finally
	            {
	               if (bReader == null) 
	                {
	                    bReader.close();
	                }
	            }
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
    }
}
}