package praktiks.OOP.polymorphysm3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Вас приветствует виртуальная АТС!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш номер телефона:");
        String number = scanner.next();
        System.out.println("Введите номер пользователя, которому хотите позвонить:");
        String friendNumber = scanner.next();
        System.out.println("Выберите вашу модель телефона, 1 - стационарный телефон, 2 - мобильный телефон, 3 - смартфон:");
        int type = scanner.nextInt();

        if (type < 1 || type > 3) {
            System.out.println("Введена неверная модель телефона");
            return;
        }

        getPhone(type, number, friendNumber);
    }

    public static void getPhone(int type, String number, String friendNumber) {

        if (type == 1) {
            System.out.println("У вас стационарный телефон.");
            new CellularPhone(number).makeCall(friendNumber);
        } else if (type == 2) {
            System.out.println("У вас мобильный телефон.");
            new MobilePhone(number).methodOfCommunication(friendNumber);
        } else {
            System.out.println("У вас смартфон.");
            new Smartphone(number).methodOfCommunication(friendNumber);
        }
    }
}
