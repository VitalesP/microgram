package com.microgram.home51lesson02.service;

import com.microgram.home51lesson02.model.Publication;
import com.microgram.home51lesson02.model.SubscriptionToUser;
import com.microgram.home51lesson02.model.User;
import com.microgram.home51lesson02.repository.PublicationRepository;
import com.microgram.home51lesson02.repository.SubscriptionToUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PublicationService {

    private final PublicationRepository publicationRepository;

    private final SubscriptionToUserService subscriptionToUserService;

    public List<Publication> findPublicationFromFollowers(User user) {
        List<Publication> result = new ArrayList<>();
        List<SubscriptionToUser> allByFollowers = subscriptionToUserService.allByFollowers(user);
        allByFollowers.forEach(s -> {
            List<Publication> publicationList = publicationRepository.findByAuthor(s.getFollowing());
            result.addAll(publicationList);
        });
        return result;
    }
}
