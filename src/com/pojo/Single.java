package com.pojo;

public enum Single {

    INSTANCE;

    private User user;

    Single() {
        user = new User();
    }

    public User getInstance() {
        return user;
    }

}
