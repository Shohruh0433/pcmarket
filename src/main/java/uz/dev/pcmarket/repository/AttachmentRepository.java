package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {


}
