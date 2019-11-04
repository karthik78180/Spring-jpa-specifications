package com.karthik.controller;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.model.User;
import com.karthik.service.UserService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
	super();
	this.userService = userService;
    }

    @PostMapping
    public User create(@RequestBody User user) {
	return userService.create(user);

    }

    @GetMapping(path = "/{id}")
    public User get(@PathVariable(name = "id") Long id) {
	return userService.get(id);
    }

    @GetMapping(path = "/getById/{id}")
    public User getById(@PathVariable(name = "id") Long id) {
	return userService.getById(id);
    }

    @GetMapping(path = "/search")
    public Page<User> search(@RequestParam(name = "name", required = false) String name,
                             @RequestParam(name = "id", required = false) Long id,
	    @RequestParam(name = "page", required = false, defaultValue = "0") Integer page,
	    @RequestParam(name = "size", required = false, defaultValue = "10") Integer size) {
	return userService.search(name, id, page, size);
    }
}
