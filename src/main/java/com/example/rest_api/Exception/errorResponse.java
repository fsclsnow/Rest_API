package com.example.rest_api.Exception;

public class errorResponse extends Exception{

    public errorResponse(Exception e) {
        System.out.println("Bad Request.");
    }
}
