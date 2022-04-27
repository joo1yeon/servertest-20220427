package other;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OtherController {
	@RequestMapping("/other")
	public ModelAndView other() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("other", "이것은 다른 패키지이다.");
		mv.setViewName("helloBoot");
		return mv;
	}
}
