package com.tracknix;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", consumes = "application/json", produces = "application/json")
public class ApiController {

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public User sayHello(@RequestBody User user) {
        return user;
    }

}