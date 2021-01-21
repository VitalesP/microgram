package com.microgram.home51lesson02.util;

import com.microgram.home51lesson02.model.User;
import com.microgram.home51lesson02.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.stream.Stream;

@Getter
@Setter
@Configuration
public class FillDatabase {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository) {

        userRepository.deleteAll();

        return (args) -> Stream.of(fillDatabase())
//                .peek(System.out::println)
                .forEach(userRepository::save);
    }


    public User fillDatabase(){

            return null;
    }

}

