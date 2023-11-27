package com.learn.springstarterlearn.services;

import com.learn.springstarterlearn.database.repository.UserRepository;
import com.learn.springstarterlearn.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
}
