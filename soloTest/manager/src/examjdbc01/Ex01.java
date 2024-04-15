package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {

	public static void main(String[] args) {
		
		Connection conn = null; //DB연결
		try {
			
			Class.forName("oracle.jdbc.OracleDriver"); //사용할 드라이버 파일이 있는지 확인
			System.out.println("클래스 로딩!");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe"
					, "jspuser"
					, "java1234"); // db에 접속 - conn으로 관리(변수지정)
			
			System.out.println("접속 성공!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Ex01.main");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}//main

}//Ex01
