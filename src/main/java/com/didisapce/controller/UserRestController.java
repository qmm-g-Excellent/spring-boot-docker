package com.didisapce.controller;

import com.didisapce.domain.User;
import com.didisapce.domain.UserRepository;
import com.didisapce.dto.userDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/api/{name}")
    public List<User> findOneCity(@PathVariable("name") String name) {
        return userRepository.findByName(name);
    }

    @PostMapping(path = "/api")
    public User postOneCity(@RequestBody userDTO user) {

        User person = new User();
        person.setAge(user.getAge());
        person.setName(user.getName());
        User result = userRepository.save(person);
        return result;
    }
}
