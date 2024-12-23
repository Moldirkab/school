package com.people;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;



    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return "Hi, I am " + name+" "+surname + " a " + age +"-year-old" + " "+gender+". ";
    }
}
