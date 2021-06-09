package uz.dev.pcmarket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Characteristic;

import java.util.List;

public interface CharacteristicRepository extends JpaRepository<Characteristic,Integer> {

    List<Characteristic> findAllById(Iterable<Integer> iterable);
}
