package com.microgram.home51lesson02.service;

import com.microgram.home51lesson02.model.SubscriptionToUser;
import com.microgram.home51lesson02.model.User;
import com.microgram.home51lesson02.repository.SubscriptionToUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubscriptionToUserService {

    private final SubscriptionToUserRepository subscriptionToUserRepository;

    public List<SubscriptionToUser> allByFollowers(User user) {
        return subscriptionToUserRepository.findAllByFollowers(user);
    }
}
