package praktiks.OOP.polymorphysm3;

import java.util.Scanner;

public class MobilePhone extends Phone {

    public MobilePhone(String number) {
        super(number);
    }

    public void methodOfCommunication(String targetNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - позвонить, 2 - написать смс");
        int i = scanner.nextInt();
        if (i == 1){
             makeCall(targetNumber);
         } else if (i == 2) {
            System.out.println("Введите сообщение:");
            String messageText = scanner.next();
            sendSms(targetNumber, messageText);
        } else {
            System.out.println("Введите 1 или 2");
        }

    }

    public final void sendSms(String targetNumber, String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

    @Override
    public void makeCall(String targetNumber) {
        super.makeCall(targetNumber);
    }
}
