package common;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JdbcUtil {

	private static JdbcUtil instance = new JdbcUtil();

	private static DataSource ds;

	static {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 성공!");
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:conp/env/jdbc/myOracle");
			System.out.println("Connection Pool 생성!");
			
		} catch (ClassNotFoundException e) {
			System.out.println("JdbcUtil.enclosing_method");
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	private JdbcUtil() { }
	
	public JdbcUtil getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		return ds.getConnection();
	}

}
// JdbcUtil
