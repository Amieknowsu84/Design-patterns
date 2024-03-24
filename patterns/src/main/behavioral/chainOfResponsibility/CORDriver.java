package main.behavioral.chainOfResponsibility;

// Client
public class CORDriver {
    public static void main(String[] args) {
        Handler authenticationHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();

        // Build the chain of responsibility
        authenticationHandler.setNextHandler(authorizationHandler);

        // Send requests to the chain
        Request request1 = new Request(1,true, true); // Authentication and authorization needed
        authenticationHandler.handleRequest(request1);

        Request request2 = new Request(2,false, true); // Only authorization needed
        authenticationHandler.handleRequest(request2);
    }
}

