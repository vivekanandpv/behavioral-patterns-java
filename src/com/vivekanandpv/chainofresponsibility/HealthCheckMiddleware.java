package com.vivekanandpv.chainofresponsibility;

public class HealthCheckMiddleware extends AbstractMiddleware {
    public HealthCheckMiddleware(AbstractMiddleware nextMiddleware) {
        super(nextMiddleware);
    }

    public HealthCheckMiddleware() {
    }

    @Override
    public Response handle(Request request) {
        System.out.println("Health Check: " + request);
        return super.handle(request);
    }
}
