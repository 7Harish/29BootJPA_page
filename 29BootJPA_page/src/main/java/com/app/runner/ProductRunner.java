package com.app.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import com.app.model.Product;
import com.app.repo.ProductRepo;
@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		//Page<Product> page=repo.findByProdCost(1.1, PageRequest.of(2, 3));
		/*Page<Product> page=repo.findByProdCode("aa", PageRequest.of(1, 2));
		System.out.println(page.isEmpty());
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.getNumber());
		System.out.println(page.getSize());
		System.out.println(page.getTotalPages());
		System.out.println(page.getNumberOfElements());
		System.out.println(page.getTotalElements());
		System.out.println(page.getNumberOfElements());*/

		Page<Product> page=repo.findByProdCost(4.4, PageRequest.of(2, 3));
		page.stream().filter(p->p.getProdCost()!=null).sorted((p1,p2)->p2.getProdId()-p2.getProdId())
		.map(p->p.getProdId()+"  "+p.getProdCode()).forEach(System.out::println);
	}
}
