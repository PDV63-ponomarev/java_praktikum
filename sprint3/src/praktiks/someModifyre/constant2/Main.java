package praktiks.someModifyre.constant2;

import java.util.Scanner;

public class Main {

    private TransactionValidator transactionValidator;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в рублях.");

        if (scanner.hasNextDouble()) {
            double amount = scanner.nextDouble();
            boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
            if (isValid)
                System.out.println("Спасибо! Ваш перевод на сумму " + amount + " р. успешно выполнен.");
        } else {
            System.out.println("Введено не корректное значение");
        }
    }
}

