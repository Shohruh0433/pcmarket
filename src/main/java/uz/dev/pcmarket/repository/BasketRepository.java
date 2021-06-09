package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Basket;

public interface BasketRepository extends JpaRepository<Basket,Integer> {


}
