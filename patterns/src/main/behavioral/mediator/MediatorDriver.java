package main.behavioral.mediator;

public class MediatorDriver {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "User1");
        User user2 = new ChatUser(chatRoom, "User2");
        User user3 = new ChatUser(chatRoom, "User3");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello, everyone!");
        user2.send("Hi, User1!");
    }
}

