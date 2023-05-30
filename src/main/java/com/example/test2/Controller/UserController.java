package com.example.test2.Controller;

import com.example.test2.Repository.UserRepository;
import com.example.test2.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController // --> indique que la classe est un RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/{id}")
    public Mono<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteUser(@PathVariable Long id) {
        return userRepository.deleteById(id);
    }

}
