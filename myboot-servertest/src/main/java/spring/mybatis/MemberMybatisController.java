package spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberMybatisController {
	
	@Autowired
	@Qualifier("mybatisService")
	MemberService service;
	
	// service selectAllMember �޼ҵ� ��ü ȸ�� ��ȸ ��� ��, mybatis/memberlist.jsp view�� ����
	@RequestMapping("/membermybatislist")
	public ModelAndView memberList() {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberList();
		mv.addObject("memberList", list);
		mv.setViewName("mybatis/memberList");
		return mv;
	}
	
	// ����¡ ó�� ȸ�� ��ȸ
	// @RequestMapping("/membermybatispaginglist")
	public ModelAndView selectPagingMember(int page) {
		int[] limit = new int[2];
		limit[0] = (page - 1) * 5;
		limit[1] = 5;
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.selectPagingMember(limit);
		mv.addObject("memberList", list);
		mv.setViewName("mybatis/memberList");
		return mv;
	}
	
	// ����¡ ó�� ȸ�� ��ȸ
	@RequestMapping("/membermybatispaginglist")
	public ModelAndView memberList(int page) {
		ModelAndView mv = new ModelAndView();
		List<MemberDTO> list = service.memberList(page);
		mv.addObject("memberList", list);
		mv.addObject("name", "����¡ ó�� ����Ʈ");
		mv.setViewName("mybatis/memberList");
		return mv;
	}
	
	// �ּ� ��ȸ
	@RequestMapping("/membermybatissearchlist")
	public ModelAndView memberList(String[] address) {
		ModelAndView mv = new ModelAndView();
		List<String> list = service.memberList(address);
		mv.addObject("memberaddresslist", list);
		mv.addObject("name", "�ּ� �˻� ����Ʈ");
		mv.setViewName("mybatis/memberList");
		return mv;
	}
	
	// ȸ������ �Է� �� ����
	@GetMapping("/membermybatisinsert")
	// @RequestMapping(value="/", method=RequestMethod.GET)
	public String insertForm() {
		return "mybatis/insertForm";
	}
	
	// ȸ������ ������ ���� post
	@PostMapping("/membermybatisinsert")
	public ModelAndView insertResult(MemberDTO dto) {
		int row = service.insertmember(dto); // id, email, phone �ߺ� �Ұ�
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", row); // int type
		mv.setViewName("mybatis/insertResult");
		return mv;
	}
	
	// ���� ���� �Է� �� ����
	@GetMapping("/membermybatisupdate")
	// @RequestMapping(value="/", method=RequestMethod.GET)
	public String updateForm(String id) {
		return "mybatis/updateForm"; // �ּ� �̸� ���� �� ����
	}
	
	// ���� ���� ������ ���� post
	@PostMapping("/membermybatisupdate")
	public ModelAndView updateResult(MemberDTO dto) { // id, name, address
		int row = service.updatemember(dto); // 
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", row); // int type
		mv.setViewName("mybatis/updateResult");
		return mv;
	}
	
	@RequestMapping("/membermybatisdelete")
	public String deleteResult(String id) {
		int result = service.deletemember(id);
		
		if (result == 1) {
			return "redirect:/membermybatislist"; // ��Ʈ�ѷ����� url ���� �޼ҵ� ȣ��(��ü ȸ�� ����Ʈ)
		}
		return "redirect:/membermybatisinsert"; // ��Ʈ�ѷ����� url ���� �޼ҵ� ȣ��(������)
	}
}
