package spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mybatisService")
// default: @Service("memberServiceImpl")
public class MemberServiceImpl implements MemberService {

	@Autowired
	@Qualifier("mybatisDAO")
	MemberDAO dao;

	@Override
	public int insertmember(MemberDTO dto) {
		return dao.insertmember(dto);
	}

	@Override
	public int updatemember(MemberDTO dto) {
		return dao.updatemember(dto);
	}

	@Override
	public int deletemember(String id) {
		return dao.deletemember(id);
	}

	@Override
	public List<MemberDTO> selectAllMember() {
		return null;
		// return dao.selectAllMember();
	}

	@Override
	public MemberDTO selectMember(String id) {
		return null;
		// return dao.selectMember(id);
	}
	
	@Override
	public MemberDTO member(String id) {
		return dao.member(id);
	}

	@Override
	public List<MemberDTO> selectPagingMember(int[] limit) {
		return null;
		// return dao.selectPagingMember(limit);
	}

	@Override
	public List<String> selectAddress(String[] address) {
		return null;
		// return dao.selectAddress(address);
	}
	
	@Override
	public List<MemberDTO> memberList() {
		return null;
		// return dao.selectAllMember();
	}

	@Override
	public List<MemberDTO> memberList(int page) {
		int limit[] = new int[2];
		limit[0] = (page-1) * 5;
		limit[1] = 5;
		return dao.paginglist(limit);
	}

	@Override
	public List<String> memberList(String[] address) {
		return dao.addresssearch(address);
	}


}
