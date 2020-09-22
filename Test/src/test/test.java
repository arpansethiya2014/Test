package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {
	public static void main(String args[]){  
		try{  
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@139.59.5.42:1521:orcl","UPDB_UAT","UPDB@UATIN1234");  
		  
		System.out.println("Connection Success");
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
}
