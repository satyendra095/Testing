package com.nareshit.satya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nareshit.satya.entity.Product;
import com.nareshit.satya.repo.ProductRepository;

@Component
public class ProductTestRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	public void run(String... args) throws Exception {
		Product p1 = new Product(10, "PEN", 200.0, "NIT");

		System.out.println("--here---" + repo.save(p1));
		/*
		 * repo.save(new Product(11, "BOOK", 300.0, "NIT")); repo.save(new
		 * Product(12, "BOTTLE", 150.0, "NIT")); repo.save(new Product(12,
		 * "NEW BOTTLE", 155.0,"NIT2"));
		 */

		/*
		 * repo.saveAll(Arrays.asList(new Product(10, "PEN",200.0, "NIT"),new
		 * Product(11,"BOOK", 300.0, "NIT"),new Product(12, "BTL",150.0,
		 * "NIT"))); Iterable<Product> itr = repo.findAll(); //method references
		 * //itr.forEach(System.out::println); //Lambda Expression
		 * itr.forEach(ob->System.out.println(ob));
		 * System.out.println(repo.count());
		 * System.out.println(repo.existsById(11));
		 * System.out.println(repo.existsById(21));
		 */
	}
}