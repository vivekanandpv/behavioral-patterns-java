package com.vivekanandpv.chainofresponsibility;

public abstract class AbstractMiddleware {
    private AbstractMiddleware nextMiddleware;

    public AbstractMiddleware(AbstractMiddleware nextMiddleware) {
        this.nextMiddleware = nextMiddleware;
    }

    public AbstractMiddleware() {
    }

    public Response handle(Request request) {
        if (nextMiddleware != null) {
            return nextMiddleware.handle(request);
        }

        throw new RuntimeException("No suitable handler found");
    }

    public final AbstractMiddleware add(AbstractMiddleware middleware) {
        AbstractMiddleware current = this;

        while(current.nextMiddleware != null) {
            current = current.nextMiddleware;
        }

        current.nextMiddleware = middleware;

        return this;
    }
}
