//method overiding - notification
import java.util.Scanner;

class Notification {
    protected String recipient;

    Notification(String recipient) { this.recipient = recipient; }

    void send() { System.out.println("Notification sent to " + recipient); }
}

class EmailNotification extends Notification {
    EmailNotification(String recipient) { super(recipient); }
    @Override
    void send() { System.out.println("Email sent to " + recipient); }
}

class SMSNotification extends Notification {
    SMSNotification(String recipient) { super(recipient); }
    @Override
    void send() { System.out.println("SMS sent to " + recipient); }
}

public class meth_overide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        String recipient = sc.next();

        Notification n = type.equalsIgnoreCase("E")
                ? new EmailNotification(recipient)
                : new SMSNotification(recipient);
        n.send();
    }
}