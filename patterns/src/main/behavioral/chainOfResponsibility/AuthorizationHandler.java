package main.behavioral.chainOfResponsibility;

// Another Concrete Handler
class AuthorizationHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.authorizationNeeded()) {
            System.out.println("Performing authorization check for request id - "+request.id());
            // Authorization logic here
        }
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
