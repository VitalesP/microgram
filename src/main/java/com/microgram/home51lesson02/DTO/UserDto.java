package com.microgram.home51lesson02.DTO;

import lombok.*;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class UserDto {
    private String id;
    private int count;
    private String firstName;
    private String lastName;
    private String login;
    private String email;
//    private String pass;
    private String countPublic;
    private String countSubscribe;


}
