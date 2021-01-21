package com.microgram.home51lesson02.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "comment")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    private String id;

    private int count;

    private String textForComment;

    private LocalDate localDate;

    @DBRef
    private User user;

    public Comment(int count, Publication publication, String makeDescription, LocalDate now, User user) {
    }
}
