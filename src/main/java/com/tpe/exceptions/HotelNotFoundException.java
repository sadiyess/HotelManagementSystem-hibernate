package com.tpe.exceptions;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(String message) {

        super(message); //parentın const. cagırarak kullan ve set et

    }
}
