package com.microgram.home51lesson02.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collation = "comment")
@Builder
public class Comment {
    @Id
    private Long id;

    private String textForComment;

    private LocalDate localDate;

    @DBRef
    private User user;

}
