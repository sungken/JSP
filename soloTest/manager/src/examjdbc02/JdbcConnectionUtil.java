package examjdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 싱글톤 적용(Singleton) 적용
// 싱글톤이란 메모리 상에서 객체가 하나만 만들어지게 하는 패턴을 말한다.
public class JdbcConnectionUtil {
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "jspuser";
	private String password = "java1234";
	
	private static JdbcConnectionUtil instance;
	
	private JdbcConnectionUtil() {
		
	}
	
	public static JdbcConnectionUtil getInstance() {
		synchronized (JdbcConnectionUtil.class) {
			if(instance == null) {
				instance = new JdbcConnectionUtil();
			}
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, password);
	}
	
	public void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
				
			} catch (SQLException e) {
				System.out.println("JdbcConnectionUtil.close");
				e.printStackTrace();
			}
		}
	}
	
	public void close(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
				
			} catch (SQLException e) {
				System.out.println("JdbcConnectionUtil.close");
				e.printStackTrace();
			}
		}
	}
	
	public void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
				
			} catch (SQLException e) {
				System.out.println("JdbcConnectionUtil.close");
				e.printStackTrace();
			}
		}
	}
	
	

}//jdbcConnectionUtil
















