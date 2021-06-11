package com.example.hibernatetutorialspringboot.one_one_uni;

import javax.persistence.*;

@Entity(name = "addressOneToOneUni")
@Table(name="address_one_to_one_uni")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long addressId;

    private String street;

    private String city;
    private String pinCode;

    public Address() {
    }

    public Address(long addressId, String street, String city, String pinCode) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.pinCode = pinCode;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
