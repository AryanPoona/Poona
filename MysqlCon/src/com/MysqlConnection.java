package com;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

//This class is using to connect with Mysql server 
class MysqlConnection{  
public static void main(String args[]){  
	Connection conn= null;
	
try{  
	conn=(Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aryan","root","root");  
	  
	if(conn!=null) {
		  System.out.println("Connection Successfully connected to Database");
	  }
 
}
catch(Exception e){ 
	System.out.println("Not connected to Database");
	}  
}  
}