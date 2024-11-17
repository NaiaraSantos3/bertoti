package Observer;

import Observer.entity.Observer;
import Observer.entity.Whatsapp;

import Observer.entity.Contact;

public class Teste {
    public static void main(String[] args) {
        Whatsapp app = new Whatsapp();

        Observer contact1 = new Contact ("Beatriz");
        Observer contact2 = new Contact ("Ana");

        app.addContact(contact1);
        app.addContact(contact2);

        System.out.println("Simulando envio de mensagem...");
        app.sendMessage("Carlos", "Olá, pessoal!");

        System.out.println("\nRemovendo Bob dos contatos...");
        app.removeContact(contact2);

        System.out.println("Simulando envio de outra mensagem...");
        app.sendMessage("Carlos", "Como estão?");
    }
}

    