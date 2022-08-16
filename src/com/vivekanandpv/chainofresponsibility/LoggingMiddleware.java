package com.vivekanandpv.chainofresponsibility;

public class LoggingMiddleware extends AbstractMiddleware {
    public LoggingMiddleware(AbstractMiddleware nextMiddleware) {
        super(nextMiddleware);
    }

    public LoggingMiddleware() {
    }

    @Override
    public Response handle(Request request) {
        System.out.println("Logging: " + request);
        return super.handle(request);
    }
}
