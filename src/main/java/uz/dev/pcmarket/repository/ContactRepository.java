package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {


}