package com;

import com.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}