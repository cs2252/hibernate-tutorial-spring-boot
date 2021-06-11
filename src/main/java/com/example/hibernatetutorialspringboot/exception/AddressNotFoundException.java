package com.example.hibernatetutorialspringboot.exception;

public class AddressNotFoundException extends RuntimeException {
    public AddressNotFoundException(String s) {
        super(s);
    }
}
