package com.test.toy.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.test.util.DBUtil;

public class Dummy {
	
	public static void main(String[] args) throws SQLException {
						
//		Connection conn = null;
//		PreparedStatement pstat = null;
//		
//		conn = DBUtil.open("localhost", "toy", "java1234");
//		
//		String sql = "insert into tblBoard values (seqBoard.nextVal, ?, '내용', 'hong', default, default)";
//		
//		pstat = conn.prepareStatement(sql);
//		
//		for (int i=0; i<250; i++) {
//			pstat.setString(1, "게시판 페이징 처리.." + i);
//			pstat.executeUpdate();
//			System.out.println(i);
//		}
//		
//		pstat.close();
//		conn.close();
		
		
		Connection conn = null;
		PreparedStatement pstat = null;
		
		conn = DBUtil.open("localhost", "toy", "java1234");
		
		String sql = "insert into tblComment (seq, content, id, regdate, bseq) values (seqComment.nextVal, ?, 'hong', sysdate - ?, 281)";
		
		pstat = conn.prepareStatement(sql);
		
		for (int i=0; i<45; i++) {
			pstat.setString(1, "댓글 페이징 처리.." + i);
			pstat.setInt(2, 45 - i);
			pstat.executeUpdate();
			System.out.println(i);
		}
		
		pstat.close();
		conn.close();
		
	}

}









