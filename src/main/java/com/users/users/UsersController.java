package com.users.users;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsersController {

    @GetMapping("/users")
    public  String getusers()
    {
        return "working";
    }
}
