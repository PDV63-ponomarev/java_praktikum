package praktiks.OOP.jeneric5;

// Дополните объявление класса Contact
public abstract class Contact {
    String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
    public abstract void sendMessage();

    public abstract void print();
}