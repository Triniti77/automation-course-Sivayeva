package com.company.infrastructure.data;

public class AbstractUserDataMapper implements UserDataMapper{
    protected User[] users = new User[8];

    @Override
    public User[] getAll() {
        return users;
    }
}
