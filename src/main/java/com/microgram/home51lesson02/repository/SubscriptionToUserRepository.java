package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.SubscriptionToUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionToUserRepository extends MongoRepository<SubscriptionToUser, String> {
    //искать подписки по ID пользователя

}
