package com.example.rest_api.Response;

public class Response {
    private boolean success;
    private int code;
    private String message;

    public Response(boolean success) {
        super();
        this.success = success;
        this.code = success ? 200 : 400;
        this.message = "";
    }

    public Response( boolean success, String message ) {
        super();
        this.success = success;
        this.code = success ? 200 : 400;
        this.message = message;
    }

    public Response( boolean success, int code, String message ) {
        super();
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
