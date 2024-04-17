package examjdbc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//JdbcConnectionUtil class 사용해서
//table 확인하기

public class Ex03 {

	public static void main(String[] args) {

		Connection conn = null; // Connection == DB연결
		PreparedStatement pstmt = null; // PreparedStatement == 미리 컴파일된 SQL 문을 나타내는 객체
		ResultSet rs = null; // ResultSet == 데이터베이스에서 가져온 결과 집합을 나타내는 객체

		JdbcConnectionUtil util = JdbcConnectionUtil.getInstance();
		
		try {

			conn = util.getConnection(); // db에 접속 
									
			System.out.println("접속 성공!");
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
			util.close(rs);
			util.close(pstmt);
			util.close(conn);
		}

	}// main

}// Ex02
