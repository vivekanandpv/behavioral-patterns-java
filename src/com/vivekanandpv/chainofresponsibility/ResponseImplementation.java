package com.vivekanandpv.chainofresponsibility;

public class ResponseImplementation implements Response {
    private final String message;

    public ResponseImplementation(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseImplementation{" +
                "message='" + message + '\'' +
                '}';
    }
}
