package com.microgram.home51lesson02.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "users")
@Builder
public class User {
    @Id
    private Long id;

    @Indexed
    private String name;

    @Indexed
    private String email;

    private String pass;

    private String countPublic;

    private String countSubscribe;

    private String countSubscriber;

}
