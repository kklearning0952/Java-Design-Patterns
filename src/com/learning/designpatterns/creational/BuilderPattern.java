package com.learning.designpatterns.creational;

public class BuilderPattern {

    public static void main(String[] args) {

        User user = new UserBuilder()
                .name("Kiran")
                .email("kiran@gmail.com")
                .age(29)
                .phone("9876543210")
                .city("Pune")
                .build();

        System.out.println(user);

        User user1 = new UserBuilder()
                .name("Sagar")
                .phone("987654321")
                .city("Pune")
                .build();

        System.out.println(user1);
    }
}


// Product class
class User {

    private String name;
    private String email;
    private int age;
    private String phone;
    private String city;

    User(UserBuilder builder) {

        this.name = builder.getName();
        this.email = builder.getEmail();
        this.age = builder.getAge();
        this.phone = builder.getPhone();
        this.city = builder.getCity();
    }

    @Override
    public String toString() {

        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


// Builder class
class UserBuilder {

    private String name;
    private String email;
    private int age;
    private String phone;
    private String city;

    public UserBuilder name(String name) {

        this.name = name;
        return this;
    }

    public UserBuilder email(String email) {

        this.email = email;
        return this;
    }

    public UserBuilder age(int age) {

        this.age = age;
        return this;
    }

    public UserBuilder phone(String phone) {

        this.phone = phone;
        return this;
    }

    public UserBuilder city(String city) {

        this.city = city;
        return this;
    }

    public User build() {

        return new User(this);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }
}