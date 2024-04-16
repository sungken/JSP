package manager;

import java.util.List;

//서비스와 DB의 연결
public class MemberService { 
	
	// 서비스는 DAO를 가지고 있어야 한다.
	private MemberDAO dao;
	
	public MemberService(MemberDAO dao) {
		this.dao = dao;
	}// 
	
	//등록하기
	public boolean regist(MemberVo vo) {
		if(dao.selectMember(vo.getNum()) == null) {
			dao.insertMember(vo);
			return true;
		} 
		return false;
	}
	
	// 조회하기
	public MemberVo read(int num) {
		return dao.selectMember(num);
	} // 개별 조회
	
	public List<MemberVo> listAll() {
		return dao.selectMemberAll();
	} // 전체 조회
	
	//수정
	public void edit(MemberVo vo) {
		MemberVo search = dao.selectMember(vo.getNum());
		
		if(search.getMemberPw().equals(vo.getMemberPw())) {
			dao.updateMember(vo);
		}
	}
	
	//탈퇴
	public void remove(int num) {
		dao.deleteMember(num);
	}

}//MemberService





















