package com.microgram.home51lesson02.DTO;

import com.microgram.home51lesson02.model.Comment;
import com.microgram.home51lesson02.model.Publication;
import com.microgram.home51lesson02.model.User;
import lombok.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class PublicationDto {
    @Builder.Default
    private String id = null;
    private int count;
    private User author;
    private String images;
    private String description;
    private LocalDate localDate;
    private List<Comment> comments;

    public static PublicationDto from(Publication publication) {
        return builder().id(publication.getId())
                .count(publication.getCount())
                .author(publication.getAuthor())
                .images(publication.getImages())
                .description(publication.getDescription())
                .localDate(publication.getLocalDate())
                .comments(publication.getComments())
                .build();
    }


}
