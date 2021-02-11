package com.microgram.home51lesson02.controller;

import com.microgram.home51lesson02.DTO.UserDto;
import com.microgram.home51lesson02.exception.UserAlreadyExistException;
import com.microgram.home51lesson02.model.User;
import com.microgram.home51lesson02.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;



@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String showRegistrationForm(WebRequest request, Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);
        return "registration";
    }

//    @PostMapping("/registration")
//    public ResponseEntity<String> registerUserAccount(
//            @RequestParam("name") String name
//            ,@RequestParam("password") String password
//            ,@RequestParam("matchingPassword") String matchingPassword
//            ,@RequestParam("email") String email
//            ) throws UserAlreadyExistException {
//
//            UserDto userDto = new UserDto().formFromParams(name, password, matchingPassword, email);
//        try {
//            User registered = userService.registerNewUserAccount
//                    (userDto);
//        } catch (UserAlreadyExistException uaeEx) {
//            ModelAndView mav = null;
//            assert false;
//            mav.addObject("message", "An account for that username/email already exists.");
//            return mav;
//        }
//        return ResponseEntity.status(401).body("success");
//    }
}
