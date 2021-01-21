package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//User по ID;
    //проверить существование пользователя по email


}
