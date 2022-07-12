package com.nareshit.satya.repo;
import org.springframework.data.repository.CrudRepository;
import com.nareshit.satya.entity.Product;
public interface ProductRepository extends CrudRepository<Product,Integer> {
}