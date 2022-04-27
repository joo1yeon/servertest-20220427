package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	@Qualifier("myProductService")
	ProductService service;
	
	// 전체 리스트
	@RequestMapping("/productlist")
	public ModelAndView productList() {
		ModelAndView mv = new ModelAndView();
		List<ProductDTO> list = service.productList();
		mv.addObject("productList", list);
		mv.setViewName("mybatis/productList");
		return mv;
	}
	
	@RequestMapping("/product")
	public ModelAndView productDetail(int productcode) {
		ModelAndView mv = new ModelAndView();
		ProductDTO dto = service.productDetail(productcode);
		mv.addObject("product", dto);
		mv.setViewName("mybatis/detailProduct");
		return mv;
	}
}
