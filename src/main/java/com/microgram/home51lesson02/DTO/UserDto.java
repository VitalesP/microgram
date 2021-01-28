package com.microgram.home51lesson02.DTO;

import com.microgram.home51lesson02.annotations.PasswordMatches;
import com.microgram.home51lesson02.annotations.ValidEmail;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@PasswordMatches
public class UserDto {
//    private String id;
//    private int count;
//    private String name;
//    private String login;
//    private String email;
////    private String pass;
//    private String countPublic;
//    private String countSubscribe;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;


}
