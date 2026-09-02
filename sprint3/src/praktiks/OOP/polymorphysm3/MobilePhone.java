package praktiks.OOP.polymorphysm3;

public class MobilePhone {
     ...

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}
