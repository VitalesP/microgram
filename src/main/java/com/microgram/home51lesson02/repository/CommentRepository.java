package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    //искать коментарии(лист) по ID публикации
    //искать комент по ID
    //

}
