package manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAO();
		
		// C(insert) -> 해쉬맵에 정보 등록
		MemberVo vo1 = new MemberVo(1, "test1", "1234", "nick1"); 
		vo1.setRegdate(new Date());
		MemberVo vo2 = new MemberVo(2, "test2", "1234", "nick2");
		vo2.setRegdate(new Date());
		MemberVo vo3 = new MemberVo(3, "test3", "1234", "nick3");
		vo3.setRegdate(new Date());
		
		dao.insertMember(vo1);
		dao.insertMember(vo2);
		dao.insertMember(vo3);
		
		System.out.println("저장 완료");
		System.out.println();
		
		// R(select)
		List<MemberVo> ls = dao.selectMemberAll();
		for (MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체조회 완료");
		System.out.println();
		
		//하나의 데이터만 조회
		MemberVo vo = null;
		vo = dao.selectMember(1);
		System.out.println(vo);
		
		// 없는데이터 조회
		vo = dao.selectMember(4);
		System.out.println(vo);
		System.out.println("조회 완료");
		System.out.println();
		
		// U(update)
		vo = dao.selectMember(1);
		System.out.println(vo);
		
		if(vo != null) {
			vo.setMemberPw("1111");
			vo.setNickName("sk");
			dao.deleteMember(2);
		}
		
		System.out.println(vo);
		System.out.println();
		
		// D(delete)
		dao.deleteMember(2); // 일부 삭제
		ls = dao.selectMemberAll();
		for (MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체 조회 완료");
		
		System.out.println();
		dao.deleteMemberAll();// 전부 삭제
		
		ls = dao.selectMemberAll();
		for (MemberVo tmp : ls) {
			System.out.println(tmp);
		}
		System.out.println("전체 조회 완료");
		
		
	}//main

}//Main
