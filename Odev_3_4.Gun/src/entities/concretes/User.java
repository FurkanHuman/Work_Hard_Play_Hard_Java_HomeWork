package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {

    private int id;
    private String nId;
    private String name;
    private String surName;
    private String email;
    private String password;
    private int birthOfYear;
    private boolean real = false;

    public User() {
    }

    public User(int id, String nId, String name, String surName, String email, String password, int birthOfYear,
            boolean real) {
        this.id = id;
        this.nId = nId;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.birthOfYear = birthOfYear;
        this.real = real;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }

    public boolean isReal() {
        return real;
    }

    public void setReal(boolean real) {
        this.real = real;
    }

}
