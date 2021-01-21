package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    //искать коментарии(лист) по ID публикации
    //искать комент по ID
    //

}
