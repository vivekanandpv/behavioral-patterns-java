package com.vivekanandpv.chainofresponsibility;

public class Program {
    public static void main(String[] args) {
        AbstractMiddleware pipeline = new LoggingMiddleware();

        pipeline
                .add(new HealthCheckMiddleware())
                .add(new ResponseProcessor());

        Response response = pipeline
                .handle(new RequestImplementation("Greetings of the day!"));

        System.out.println(response);
    }
}
