package main.behavioral.chainOfResponsibility;

// Request class
record Request(int id,boolean authenticationNeeded, boolean authorizationNeeded) {
}
