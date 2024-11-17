package Observer.entity;
import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<Observer> contacts = new ArrayList<>();

    public void addContact(Observer contact) {
        contacts.add(contact);
    }

    public void removeContact(Observer contact) {
        contacts.remove(contact);
    }

    public void notifyContacts(String sender, String message) {
        for (Observer contact : contacts) {
            contact.update(sender, message);
        }
    }

    public void sendMessage(String sender, String message) {
        System.out.println(sender + " enviou: " + message);
        notifyContacts(sender, message);
    }
}
