package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("myProductService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	@Qualifier("productDAO")
	ProductDAO dao;

	@Override
	public List<ProductDTO> productList() {
		return dao.selectAllProduct();
	}

	@Override
	public ProductDTO productDetail(int productcode) {
		return dao.selectProduct(productcode);
	}
	
}
