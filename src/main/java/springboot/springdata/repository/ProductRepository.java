package springboot.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.springdata.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{
	
	public Product findByName(String name);
	
}
