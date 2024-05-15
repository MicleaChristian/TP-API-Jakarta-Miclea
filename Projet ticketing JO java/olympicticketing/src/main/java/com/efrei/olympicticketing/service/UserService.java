package com.efrei.olympicticketing.service;

import org.springframework.stereotype.Service;
import com.efrei.olympicticketing.repository.UserRepository;
import jakarta.transaction.Transactional;
import com.efrei.olympicticketing.model.User;

@Service
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    @Transactional(rollbackOn = FunctionalException.class)
    public User addUsers (UserDto user) {
        userRepository.addUsers(user) ;
        User newUser = userRepository.findUserName(user.name);
        return newUser;
    }
}