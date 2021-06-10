package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Contact;


@RepositoryRestResource(path = "contact",collectionResourceRel = "list")
public interface ContactRepository extends JpaRepository<Contact,Integer> {



}
