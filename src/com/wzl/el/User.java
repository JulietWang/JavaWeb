package com.wzl.el;

public class User {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String[] likes;

    public void setLikes(String[] likes) {
        this.likes = likes;
    }

    public String[] getLikes() {
        return likes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
