package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.SubscriptionToUser;
import com.microgram.home51lesson02.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubscriptionToUserRepository extends MongoRepository<SubscriptionToUser, String> {
    //искать подписки по ID пользователя

    List<SubscriptionToUser> findAllByFollowers(User followers);


}
