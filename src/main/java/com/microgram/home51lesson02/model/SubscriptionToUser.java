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
@Document(collection = "subscription_to_user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubscriptionToUser {
    @Id
    private String id;

    @DBRef
    private User following;//подписки

    @DBRef
    private User followers;//подписчики

    private LocalDate localDate;

    private String name = "Vanda";

}
