package praktiks.OOP.polymorphysm3;

import java.util.Scanner;

// Допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{

    public Smartphone(String number) {
        super(number);
    }

    public void methodOfCommunication(String targetNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - позвонить; 2 - написать смс; 3 - написать email");
        int i = scanner.nextInt();
        if (i == 1){
            System.out.println("Выберите приложение для звонка");
            String appName = scanner.next();
            makeCall(targetNumber,appName);
        } else if (i == 2) {
            System.out.println("Введите сообщение:");
            String messageText = scanner.next();
            sendSms(targetNumber, messageText);
        } else if (i == 3){
            System.out.println("Введите сообщение:");
            String messageText = scanner.next();
            System.out.println("Введите email");
            String email = scanner.next();
            sendEmail(email, messageText);
        } else {
            System.out.println("Ошибка ввода");
        }
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Набираем номер " + targetNumber + " и звоним через " + appName);
        System.out.println("Привет!");
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}