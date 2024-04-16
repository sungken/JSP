package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//table 추가하기

public class Ex04 {

	public static void main(String[] args) {

		Connection conn = null; // Connection == DB연결
		PreparedStatement pstmt = null; // PreparedStatement == 미리 컴파일된 SQL 문을 나타내는 객체
		int result = 0;

		try {

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe"
					, "jspuser"
					, "java1234"); // db에 접속 
									
			System.out.println("접속 성공!");
			
			StringBuffer query = new StringBuffer();
			//query.append("insert into \"Member\" ");
			query.append("insert into Member ");
			query.append("(num, memberid, memberpw, nickname, regdate)");
			query.append(" values (member_seq.nextVal, ?, ?, ?, sysdate)");
			
			System.out.println(query.toString());
			
			pstmt = conn.prepareStatement(query.toString());
			pstmt.setString(1, "hong");
			pstmt.setString(2, "1234");
			pstmt.setString(3, "honghong");
			
			//executeUpdate 는 sql에서 INSERT, UPDATE, DELETE 할떄 사용
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 삽입되었습니다.");
			
			
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}

	}// main

}// Ex02
