package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Product;

public interface ProductRepository  extends JpaRepository<Product,Integer> {



}
