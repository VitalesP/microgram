package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
//User по ID;
    //проверить существование пользователя по email

    User findByName(String name);
    User findByLogin(String login);
    User findByEmail(String email);
    boolean existsByEmail(String email);



}
