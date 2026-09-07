package practic.algorithms.binary;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        System.out.println("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        while (userGuess != target){
            System.out.println("Введите число: ");
            userGuess = s.nextInt();
            if (userGuess < target){
                System.out.println("Число меньше загаданного");
            } else if (userGuess > target){
                System.out.println("Число больше загаданного");
            } else {
                System.out.println("Верно");
                s.close();
            }
        }
    }
}
