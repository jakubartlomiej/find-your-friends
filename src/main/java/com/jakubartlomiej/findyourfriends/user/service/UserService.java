package com.jakubartlomiej.findyourfriends.user.service;

import com.jakubartlomiej.findyourfriends.user.domain.User;
import com.jakubartlomiej.findyourfriends.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void disabledAccount(User user) {
        User currentUser = userRepository.findByUsername(user.getUsername());
        currentUser.setEnabled(false);
        save(user);
    }
}
