package edu.multi.kdigital;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

	@RequestMapping("/helloajax")
	public MemberDTO test() {
		return new MemberDTO("ID", "PASSWORD"); // json 자동 변환
	}
}
