package com.demo.domain;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @Description
 * @Date: 2022/9/4 16:22
 */
@Component("userId")
public class User {
    private String userName;
    private String telNumber;
    private List<String> list;

    private Map<String, String> map;

    public User() {

    }
    public User(String userName, String telNumber, List list) {
        this.list=list;
        this.userName=userName;
        this.telNumber=telNumber;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

}


