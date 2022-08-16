package com.vivekanandpv.chainofresponsibility;

public class ResponseProcessor extends AbstractMiddleware {
    public ResponseProcessor(AbstractMiddleware nextMiddleware) {
        super(nextMiddleware);
    }

    public ResponseProcessor() {
    }

    @Override
    public Response handle(Request request) {
        return new ResponseImplementation("Response from ResponseProcessor");
    }
}
