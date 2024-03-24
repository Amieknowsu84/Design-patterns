package main.solid.dependencyInversion;

public class Driver {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        NotificationService notificationService1 = new NotificationService(emailService);
        notificationService1.sendNotification("Hello, this is an email notification.");

        MessageService smsService = new SMSService();
        NotificationService notificationService2 = new NotificationService(smsService);
        notificationService2.sendNotification("Hello, this is an SMS notification.");
    }
}


