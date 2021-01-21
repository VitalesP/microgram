package com.microgram.home51lesson02.repository;

import com.microgram.home51lesson02.model.SubscriptionToUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionToUserRepository extends JpaRepository<SubscriptionToUser, Long> {
    //искать подписки по ID пользователя

}
