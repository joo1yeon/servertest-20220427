package edu.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloBootController {
	
	@RequestMapping("/helloboot")
	public ModelAndView helloBoot() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "이것이 바로 스프링 부트");
		mv.setViewName("helloBoot");
		return mv;
	}
}
