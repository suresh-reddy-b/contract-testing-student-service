package com.testannotation.studentservice.model;

public class Student {
    private String ID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String registrationDate;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public Student(){

    }

    public Student(String firstName, String lastName, String dateOfBirth, String registrationDate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
        this.address = address;
    }

    public Student(String firstName, String lastName, String ID, String dateOfBirth, String registrationDate, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
        this.registrationDate = registrationDate;
        this.address = address;
    }

}
