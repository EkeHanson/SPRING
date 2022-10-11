package com.springboot.springbootserious;

public class Student {

    private String lastName;
    private String firstName;


    public Student() {
    }

    public Student(String firstName , String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() { return lastName;}
}
