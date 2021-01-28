package com.microgram.home51lesson02.model;

import com.microgram.home51lesson02.util.Generator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;

    private int count;

    @Indexed
    private String name;

    @Indexed
    private String login;

    @Indexed
    private String email;

    private String password;

    private String countPublic;

    private String countSubscribe;

    private String countSubscriber;

    public static User random() {
        return builder()
                .email(Generator.makeEmail())
                .name(Generator.makeName())
                .build();
    }


    public User(int count, String name, String email, String pass, int i1, int i2, int i3) {
    }
}
