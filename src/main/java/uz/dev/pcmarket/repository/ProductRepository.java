package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Product;

@RepositoryRestResource(path = "product",collectionResourceRel = "list")
public interface ProductRepository  extends JpaRepository<Product,Integer> {



}
