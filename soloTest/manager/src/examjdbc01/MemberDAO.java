package examjdbc01;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDAO {
	
	//db역할
	Map<Integer, MemberVo> db = new HashMap<>();
	
	//C
	public void insertMember(MemberVo vo) {
		vo.setRegdate(new Date());
		db.put(vo.getNum(), vo);
	}
	
	//R
	public MemberVo selectMember(int num) {
		return db.get(num);
	}// 하나씩 불러오기
	
	public List<MemberVo> selectMemberAll(){
		
		return new ArrayList<MemberVo>(db.values());
	}// 전부 불러오기
	
	//U
	public void updateMember(MemberVo vo) {
		// 해당 키의 연결된 객체 불러오기
		db.put(vo.getNum(), vo);
	}
	
	//D
	public void deleteMember(int num) {
		db.remove(num);
	}// 일부 삭제
	
	public void deleteMemberAll() {
		db.clear();
	}// 전부 삭제

}//MemberDAO














