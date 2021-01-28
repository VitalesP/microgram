package com.microgram.home51lesson02.util;

import com.microgram.home51lesson02.model.Comment;
import com.microgram.home51lesson02.model.Like;
import com.microgram.home51lesson02.model.Publication;
import com.microgram.home51lesson02.model.User;
import com.microgram.home51lesson02.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class FillDB {
    private Random rnd = new Random();

    @Bean
    CommandLineRunner initDatabase(CommentRepository commentRepositories,
                                   LikeRepository likeRepositories,
                                   PublicationRepository postRepositories,
                                   SubscriptionToUserRepository subscriptionRepositories,
                                   UserRepository userRepositories) {
        return (args) -> {
            likeRepositories.deleteAll();
            commentRepositories.deleteAll();
            subscriptionRepositories.deleteAll();
            postRepositories.deleteAll();
            userRepositories.deleteAll();

            List<User> users = getUsers(userRepositories);

            userRepositories.saveAll(users);

            List<Publication> publications = getPosts(users);

            postRepositories.saveAll(publications);

            List<Comment> comments = getComments(publications, users);
            commentRepositories.saveAll(comments);

            List<Like> likes = getLikes(users, publications);
            likeRepositories.saveAll(likes);
        };
    }

    private List<Like> getLikes(List<User> users, List<Publication> posts) {
        List<Like> likes = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < posts.size(); i++) {
            for (int j = 0; j < users.size(); j++) {
                count++;
                likes.add(new Like(count, users.get(j), posts.get(i), LocalDate.now()));
            }
        }
        return likes;
    }

    private List<Comment> getComments(List<Publication> posts, List<User> users) {
        List<Comment> comments = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < posts.size(); i++) {
            for (int j = 0; j < users.size(); j++) {
                count++;
                comments.add(new Comment(count, posts.get(i),
                        Generator.makeDescription(), LocalDate.now(), users.get(j)));
            }
        }
        return comments;
    }

    private List<Publication> getPosts(List<User> users) {
        List<Publication> posts = new ArrayList<>();
        Random rnd = new Random();
        int coutn = 1;
        for (int i = 1; i <= users.size(); i++) {
            for (int j = 0; j < rnd.nextInt(5) + 1; j++) {
                posts.add(new Publication(coutn, "pic.jpg", Generator.makeDescription()
                        , LocalDate.now(), users.get(i - 1)));
                coutn++;
            }
        }
        return posts;
    }

    private List<User> getUsers(UserRepository repository) {
        List<User> databaseList = repository.findAll();
        List<User> users = new ArrayList<>();

        int count = rnd.nextInt(10) + 1;
        int size = databaseList.size();

        for (int i = size; i < size + count; i++) {
            String firstName = Generator.makeName();
            String lastName = Generator.makeName();

            users.add(new User(i + 1,
                    firstName,
                    lastName,
                    firstName + " ! " + lastName + "@gmail.com",
                    Generator.makePassword(),
                    0,
                    0,
                    0));
        }
        return users;
    }
}
