package com.example.baterina_firebase_crud;

public class Person {

    private String name;
    private String address;
    private String age;
    private String gender;

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public Person(String name, String address, String age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
}
