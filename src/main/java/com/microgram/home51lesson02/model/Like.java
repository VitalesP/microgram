package com.microgram.home51lesson02.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collation = "like")
@Builder
public class Like {
    @Id
    private Long id;

    @DBRef
    private User user;

    private LocalDate localDate;

}
