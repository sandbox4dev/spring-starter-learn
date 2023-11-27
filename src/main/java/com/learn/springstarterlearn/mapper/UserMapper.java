package com.learn.springstarterlearn.mapper;

import com.learn.springstarterlearn.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class UserMapper {
    private final UserDTO userDTO;
}
