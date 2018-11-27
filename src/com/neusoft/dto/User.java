package com.neusoft.dto;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Administrator on 2018/11/26.
 */
public class User {
    public static void main(String[] args) {

//        Set<String> set = new HashSet<>();
//        for(int j = 0; j < 10; j++)
//        {
//            for(int i = 0; i < 100000000; i++)
//            {
//                UUID uuid = UUID.randomUUID();
//                set.add(uuid.toString());
//            }
//        }

//        System.out.println(set.size());
    }
    private String user_name;
    private String user_city;
    private Integer user_age;
    private String user_yy;
    private Integer user_xx;

    public String getUser_yy() {
        return user_yy;
    }

    public void setUser_yy(String user_yy) {
        this.user_yy = user_yy;
    }

    public Integer getUser_xx() {
        return user_xx;
    }

    public void setUser_xx(Integer user_xx) {
        this.user_xx = user_xx;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }
}
