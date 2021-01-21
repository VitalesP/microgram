package com.microgram.home51lesson02.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document(collation = "publication")
@Builder
public class Publication {
    @Id
    private Long id;

    private String images;

    private String description;

    private LocalDate localDate;

    @DBRef
    private List<Comment> comments;

    @DBRef
    private List<Like> likes;


}
