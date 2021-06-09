package uz.dev.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.dev.pcmarket.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment,Integer> {


}
