package com.jwt.springSecurity.services;

import com.jwt.springSecurity.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private List<User> store=new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"vishal","vishal@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"vinay","vinay@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"ram","ram@gmail.com"));
    }

    public List<User> getUsers(){
        return store;
    }

}
