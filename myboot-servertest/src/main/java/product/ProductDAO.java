package product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("productDAO") // dao 클래스 n개 있을 때 구분하기 위해
public interface ProductDAO {
	public List<ProductDTO> selectAllProduct();
	public ProductDTO selectProduct(int productcode);
}
