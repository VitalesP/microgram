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
@Document(collection = "like")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Like {
    @Id
    private String id;

    private int count;

    @DBRef
    private User author;

    private Publication publication;

    private LocalDate localDate;

    public Like(int count, User user, Publication publication, LocalDate localDate) {
    }
}
