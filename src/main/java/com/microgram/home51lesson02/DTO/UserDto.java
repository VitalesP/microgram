package com.microgram.home51lesson02.DTO;

import com.microgram.home51lesson02.annotations.PasswordMatches;
import com.microgram.home51lesson02.annotations.ValidEmail;
import lombok.*;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder(access = AccessLevel.PRIVATE)
//@AllArgsConstructor(access = AccessLevel.PRIVATE)
//@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor
@NoArgsConstructor
@PasswordMatches
@Getter
@Setter
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

//    @ValidEmail
    @NotNull
    @NotEmpty
    private String email;


    public UserDto formFromParams(String name
            , String password
            , String matchingPassword
            , String email){
        return UserDto.builder()
                .name(name)
                .password(password)
                .matchingPassword(matchingPassword)
                .email(email)
                .build();
    }

}
