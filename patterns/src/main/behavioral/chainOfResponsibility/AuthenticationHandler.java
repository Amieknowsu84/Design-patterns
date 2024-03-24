package main.behavioral.chainOfResponsibility;

// Concrete Handler
class AuthenticationHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.authenticationNeeded()) {
            System.out.println("Performing authentication check for request id - "+request.id());
            // Authentication logic here
        }
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
