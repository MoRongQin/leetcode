package com.pattern;

import com.pojo.User;

public class UserUtil {
    private static User user;

    private UserUtil(){

    }

    public static User instance(){
        if(user == null){
            synchronized(UserUtil.class){
                if(user == null){
                    user =  new User();
                }
            }
        }
        return user;
    }

}
