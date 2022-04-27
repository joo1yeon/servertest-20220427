package spring.mybatis;

import java.util.List;

public interface MemberService {
	public int insertmember(MemberDTO dto);
	public int updatemember(MemberDTO dto);
	public int deletemember(String id);
	public List<MemberDTO> memberList();
	public List<MemberDTO> memberList(int page);
	public List<String> memberList(String[] address);
	public List<MemberDTO> selectAllMember();
	public MemberDTO selectMember(String id);
	public MemberDTO member(String id);
	public List<MemberDTO> selectPagingMember(int[] limit);
	public List<String> selectAddress(String[] address);
}
