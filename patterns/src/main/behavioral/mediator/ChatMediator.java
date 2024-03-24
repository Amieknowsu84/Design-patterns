package main.behavioral.mediator;

// Mediator interface
interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}