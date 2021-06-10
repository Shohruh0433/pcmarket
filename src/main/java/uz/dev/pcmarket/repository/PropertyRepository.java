package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Property;

public interface PropertyRepository extends JpaRepository<Property,Integer> {


}
