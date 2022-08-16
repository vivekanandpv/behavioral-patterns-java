package com.vivekanandpv.chainofresponsibility;

public class RequestImplementation implements Request {
    private final String message;

    public RequestImplementation(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "RequestImplementation{" +
                "message='" + message + '\'' +
                '}';
    }
}
