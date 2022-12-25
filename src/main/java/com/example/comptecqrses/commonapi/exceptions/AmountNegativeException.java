package com.example.comptecqrses.commonapi.exceptions;

public class AmountNegativeException extends RuntimeException {
    public AmountNegativeException(String s) {
        super(s);
    }
}
