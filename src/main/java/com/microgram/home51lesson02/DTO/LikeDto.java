package com.microgram.home51lesson02.DTO;

import com.microgram.home51lesson02.model.Like;
import com.microgram.home51lesson02.model.Publication;
import com.microgram.home51lesson02.model.User;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class LikeDto {
    @Builder.Default
    private String id = null;
    private int count;
    private User author;
    private Publication publication;
    private LocalDate localDate;

    public static LikeDto from(Like like) {
        return builder().id(like.getId())
                .count(like.getCount())
                .author(like.getAuthor())
                .publication(like.getPublication())
                .localDate(like.getLocalDate())
                .build();
    }

}
