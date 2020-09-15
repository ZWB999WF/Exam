package exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class Getconnection {
	  public  Connection conn;
	  ResultSet rs;
      public static void main(String[] args) {
    	  Getconnection conn=new Getconnection();
    	  conn.getconn();
      }
      
      public  Connection  getconn(){
              try{Class.forName("com.mysql.jdbc.Driver");
      //System.out.println("数据库加载成功");
      String url="jdbc:mysql://localhost:3306/titlesea";
      String user="root";
      String password="admin";
      conn=DriverManager.getConnection(url, user, password);
     // System.out.println("已经成功连接到数据库");
    	  } catch(Exception e){
    		  e.printStackTrace();
    	  } 
              return conn;
      }
       public ResultSet getRs(String sql){
    	  try {
			Statement stmt= conn.createStatement();
			rs=stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  return  rs;
       }
       public void  Exeupdate(Connection conn,String sql){
     	  try {
     		
 			Statement stmt= conn.createStatement();
 			stmt.execute(sql);
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
        }
       public void close(){
    	   try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
}