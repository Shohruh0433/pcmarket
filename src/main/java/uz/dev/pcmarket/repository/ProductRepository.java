package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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


    @RestResource(path = "filter")
    @Query(value = "select  *from product p\n" +
            "join category c on c.id = p.category_id\n" +
            "join property pr on pr.product_id = p.id\n" +
            "join measurement m on m.id=pr.measurement_id\n" +
            "join characteristic ch on ch.id = pr.characteristic_id\n" +
            "where c.name=:category_name and  ch.name=:charName and pr.amount=:amount ",nativeQuery = true)
    List<Product> findAllByProduct(@Param("category_name") String  category_name ,@Param("charName")
                                   String charName, @Param("amount")String amount);





}
