//package com.microgram.home51lesson02.configuration;
//
//import com.microgram.home51lesson02.repository.*;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//
//import java.util.stream.Stream;
//
////@RequiredArgsConstructor
//@org.springframework.context.annotation.Configuration
//public class Configuration {
//
//    private final UserRepository userRepository;
//    private final PublicationRepository publicationRepository;
//    private final CommentRepository commentRepository;
//    private final LikeRepository likeRepository;
//    private final SubscriptionToUserRepository subscriptionToUserRepository;
//
//    public Configuration(UserRepository userRepository, PublicationRepository publicationRepository,
//                         CommentRepository commentRepository, LikeRepository likeRepository,
//                         SubscriptionToUserRepository subscriptionToUserRepository) {
//        this.userRepository = userRepository;
//        this.publicationRepository = publicationRepository;
//        this.commentRepository = commentRepository;
//        this.likeRepository = likeRepository;
//        this.subscriptionToUserRepository = subscriptionToUserRepository;
//    }
//
//
//    @Bean
//    CommandLineRunner initDatabase(UserRepository userRepository) {
//
//        userRepository.deleteAll();
//
//        return (args) -> Stream.of(fillDatabase())
//                .forEach(userRepository::save);
//    }
//}
