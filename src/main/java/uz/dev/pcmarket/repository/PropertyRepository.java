package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Property;

@RepositoryRestResource(path = "property",collectionResourceRel = "list")
public interface PropertyRepository extends JpaRepository<Property,Integer> {


}
