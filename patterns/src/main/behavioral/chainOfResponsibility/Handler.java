package main.behavioral.chainOfResponsibility;

// Handler interface
interface Handler {
    void setNextHandler(Handler nextHandler);

    void handleRequest(Request request);
}
