package com.microgram.home51lesson02.service;

import com.microgram.home51lesson02.DTO.UserDto;
import com.microgram.home51lesson02.exception.UserAlreadyExistException;
import com.microgram.home51lesson02.model.User;
import com.microgram.home51lesson02.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
//    @Autowired
    private UserRepository repository;
    private UserRepository userRepository;

    @Transactional
    @Override
    public User registerNewUserAccount(UserDto userDto)
            throws UserAlreadyExistException {

        if (emailExist(userDto.getEmail())) {
            throw new UserAlreadyExistException(
                    "There is an account with that email address: "
                            +  userDto.getEmail());
        }
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
//        user.setRoles(Arrays.asList("ROLE_USER"));
        return repository.save(user);
    }
    private boolean emailExist(String email) {
        return userRepository.findByEmail(email) != null;
    }
}
