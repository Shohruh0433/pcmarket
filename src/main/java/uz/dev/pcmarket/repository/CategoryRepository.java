package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Category;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category,Integer> {


}
