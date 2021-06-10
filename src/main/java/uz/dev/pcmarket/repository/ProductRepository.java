package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.dev.pcmarket.entity.Product;
import uz.dev.pcmarket.projections.ProductProjection;

import java.util.List;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = ProductProjection.class)
public interface ProductRepository  extends JpaRepository<Product,Integer> {

    @RestResource(path = "price")
    List<Product> findAllByPriceBetween(@Param("price") Double price, Double price2);
}
