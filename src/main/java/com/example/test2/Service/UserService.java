package com.example.test2.Service;

import com.example.test2.Repository.UserRepository;
import com.example.test2.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public Mono<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Mono<User> updateUser(User user) {
        return userRepository.save(user);
    }

    public Mono<Void> deleteUser(Long id) {
        return userRepository.deleteById(id);
    }
}
