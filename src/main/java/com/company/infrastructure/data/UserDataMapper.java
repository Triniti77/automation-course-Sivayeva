package com.company.infrastructure.data;

import java.util.Arrays;

public interface UserDataMapper {

    default User findUserByEmail(String email){

//        Arrays.stream(getAll())
//                .filter(u -> u.getEmail().equals(email))
//                .findFirst().orElseThrow()

        for (int i = 0; i < getAll().length; i++) {
            if(getAll()[i].getEmail().equals(email))
                return getAll()[i];
        }

        throw new UserNotFoundException("User with email [" + email + "] was not found");
    }

    User[] getAll();

    default User findUserByUsername(String username){
        for (int i = 0; i < getAll().length; i++) {
            if(getAll()[i].getUsername().equals(username))
                return getAll()[i];
        }

        throw new UserNotFoundException("User with username [" + username + "] was not found");
    }



    // findUserByUsername(String username)
}
