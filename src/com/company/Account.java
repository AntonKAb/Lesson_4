package com.company;

public class Account {

    private String fio;
    private String birthday;
    private String email;
    private String password;
    private boolean blocked;

    public Account(String fio, String birthday, String email, String password, boolean blocked){
        this.birthday = birthday;
        this.fio = fio;
        this.email = email;
        this.password = password;
        this.blocked = false;
    }
}
