package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {


}
