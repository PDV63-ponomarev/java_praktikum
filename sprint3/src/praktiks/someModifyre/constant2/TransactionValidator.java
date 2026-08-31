package praktiks.someModifyre.constant2;

public class TransactionValidator {

    static final int MIN_AMOUNT = 1;
    static final int MAX_AMOUNT = 5000;

    public static boolean isValidAmount(double amount){

        if (amount <= MIN_AMOUNT){
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount >= MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else {
            return true;
        }

    }

}