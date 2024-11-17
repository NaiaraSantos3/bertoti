package Observer.entity;

public class Contact implements Observer {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    @Override
    public void update(String sender, String message) {
        System.out.println("Notificação para " + name + ": Nova mensagem de " + sender + " -> " + message);
    }
}
