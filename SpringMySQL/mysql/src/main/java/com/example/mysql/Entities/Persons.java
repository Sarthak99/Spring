package com.example.mysql.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Persons")
public class Persons {

    @Id
    @Column(name="PersonID")
    private Integer personId;
    @Column(name="LastName")
    private String lastName;
    @Column(name="FirstName")
    private String firstName;
    @Column(name="Address")
    private String address;
    @Column(name="City")
    private String city;

    public Persons() {
    }

    public Integer getPersonID() {
        return personId;
    }

    public void setPersonID(Integer personID) {
        this.personId = personID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personID=" + personId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
