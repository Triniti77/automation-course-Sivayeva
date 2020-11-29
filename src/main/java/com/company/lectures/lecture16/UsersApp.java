package com.company.lectures.lecture16;

import com.company.infrastructure.data.DbUserDataMapper;
import com.company.infrastructure.data.User;
import com.company.infrastructure.data.UserDataMapper;
import com.company.infrastructure.data.FileUserDataMapper;

import java.util.Arrays;

public class UsersApp {

//    public static void main(String[] args) {
//
//        UserDataMapper usersMapper = new FileUserDataMapper("users.txt");
//
//        System.out.println(Arrays.toString(usersMapper.getAll()));
//        User user = usersMapper.findUserByEmail("user6@test.com");
//
//        System.out.println(user);
//
//    }

    public static void main(String[] args) {

//        UserDataMapper usersMapper = new FileUserDataMapper("users.txt");
        UserDataMapper usersMapper = new DbUserDataMapper("/Users/sky/Documents/users.db");

        System.out.println(Arrays.toString(usersMapper.getAll()));
        User user = usersMapper.findUserByUsername("user8");

        System.out.println(user);

    }

}
