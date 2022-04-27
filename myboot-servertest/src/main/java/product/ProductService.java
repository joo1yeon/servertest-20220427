package product;

import java.util.List;

public interface ProductService {
	public List<ProductDTO> productList(); // 매핑 sql id와 상관 없음
	public ProductDTO productDetail(int productcode);
}
