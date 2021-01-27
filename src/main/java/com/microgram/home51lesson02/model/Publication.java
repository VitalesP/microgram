package com.microgram.home51lesson02.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collection = "publication")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Publication {
    @Id
    private String id;

    private int count;

    @Indexed
    private User author;

    private String images;

    private String description;

    private LocalDate localDate;

    @DBRef
    private List<Comment> comments;


    public Publication(int count, String s, String makeDescription, LocalDate now, User user) {
    }
}
