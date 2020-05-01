package diksha.cg.gla.spring.service;

import java.util.List;

import diksha.cg.gla.spring.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}
