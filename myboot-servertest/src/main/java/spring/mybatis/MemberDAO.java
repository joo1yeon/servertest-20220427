package spring.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper // 마이바티스 sql(id, resultType, parameterType)
@Repository("mybatisDAO")
public interface MemberDAO {
	// ����
	public int insertmember(MemberDTO dto);
	// ����
	public int updatemember(MemberDTO dto);
	// ����
	public int deletemember(String id);
	// ��ü member ��ȸ
	// public List<MemberDTO> selectAllMember();	
	// �� ����� ��ȸ
	// public MemberDTO selectmember(String id);	
	// �� ����� ��ȸ2
	public MemberDTO member(String id);	
	// ����¡ ��ȸ
	//public List<MemberDTO> selectPagingMember(int[] limit);	
	// �ּ� ��ȸ
	//public List<String> selectAddress(String[] address);
	
	public List<MemberDTO> memberlist();
	
	public List<MemberDTO> paginglist(int[] limit);
	
	public List<String> addresssearch(String[] address);
}
