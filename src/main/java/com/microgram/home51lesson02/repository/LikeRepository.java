package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {
    //искать лайк по ID публикации
    //искать лайк по ID пользователя
    //
}
