package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex02 {

	public static void main(String[] args) {

		Connection conn = null; // Connection == DB연결
		PreparedStatement pstmt = null; // PreparedStatement == 미리 컴파일된 SQL 문을 나타내는 객체
		ResultSet rs = null; // ResultSet == 데이터베이스에서 가져온 결과 집합을 나타내는 객체

		try {

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe"
					, "jspuser"
					, "java1234"); // db에 접속 
									
			System.out.println("접속 성공!");
			
			//member의 모든 정보가 컬럼의 정의된 순서대로 나오게 하기
			// == select * from member; 전체 검색
			//pstmt = conn.prepareStatement("select * from \"MEMBER\""); 
			
			// 조건 검색 1.
			// == select * from member where num = 1; 조건 검색
			//pstmt = conn.prepareStatement("select * from \"MEMBER\" where num = 1");
			
			//조건 검색 2.
			//   ?
			pstmt = conn.prepareStatement("select * from \"MEMBER\" where \"NUM\" = ?");
			pstmt.setInt(1, 2); // 1(parameterIndex) , 2(번 회원) 찾기
			// 첫번째 ? 의 값에는 2가 들어간다.
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MemberVo vo = new MemberVo(
						rs.getInt(1), 							// num
						rs.getString(2), 						// memberid
						rs.getString("MEMBERPW"), 				// memberpw
						rs.getString(4)			 				// nicname
					);
				vo.setRegdate(rs.getDate("REGDATE"));			//regdate
				System.out.println(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}

	}// main

}// Ex02
