package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.dev.pcmarket.entity.AttachmentContent;

@RepositoryRestResource(path = "attachmentContent")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {


}
