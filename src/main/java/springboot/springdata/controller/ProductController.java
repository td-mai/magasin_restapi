package springboot.springdata.controller;

import org.springframework.web.bind.annotation.RestController;

import springboot.springdata.model.Product;
import springboot.springdata.repository.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
    
	@GetMapping("/")
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    
	@GetMapping("/{code}")
	public Product findById(@PathVariable(value = "code") String code) {
		return productRepository.getOne(code);
	}
    
}
