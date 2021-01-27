package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.Like;
import com.microgram.home51lesson02.model.Publication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends MongoRepository<Like, String> {
    //искать лайк по ID публикации
    //искать лайк по ID пользователя
    boolean existsByPublication(Publication publication);
}
