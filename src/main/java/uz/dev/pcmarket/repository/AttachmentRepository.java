package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.Attachment;


@RepositoryRestResource(path = "attachment")
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {


}
