package com.karthik.service;

import org.springframework.data.domain.Page;

import com.karthik.model.User;

public interface UserService {

    User create(User user);

    User get(Long id);

    User getById(Long id);

    Page<User> search(String name, Long id, Integer page, Integer size);
}
