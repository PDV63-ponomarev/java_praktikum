package OperationWithPrim_4;

public class Spr1_4_1 {
    static void main() {
        int a = 37;
        int b = 9;

        a = a + b;
        // можно исп сокращения для перезаписи
        a += b;
        a -= b; // a = a - b;
        a *= b; // a = a * b;
        a /= b; // a = a / b;

//        prakt();

        // a = a + 1;
        a++; // Сначала покажет а, затем увеличит на еденицу
        ++a; // Сначала увеличит на еденицу, затем покажет результет

        // a = a - 1;
        a--; // сначала покажет а, затем уменьшет на еденицу
        --a; // Сначала уменьшит на еденицу, затем покажет результет

//        hiusten();

//        ostatokOtDelenia();

        int numberToCheck = 11;
        isEven(numberToCheck);


    }

    private static void prakt(){
        int b = 9;
        int a = 11;
        a += 1;
        a *= 5;
        b /= 3;

        int result = a - b;
        System.out.println(result);
    }

    private static void hiusten(){
        int countDown = 8;
        for (int i = 0; i < 7; i++){
            System.out.println(countDown - (i + 1));
        }
        System.out.println("Поехали!");
    }

    public static void ostatokOtDelenia(){
        int a;
        int b = 120;
        int c = 50;
        a = b % c; // остаток от деления.
        System.out.println(a); // 20
        int d = 3;
        a %= d; // сокрашенная запись a = a % d;
        System.out.println(a); // 2

        // остаток от деления может быть равен 0
        a = 100;
        a %= 10;
        System.out.println(a);

        // если первое число меньше второго, то остаток от деления будет первым
        a = 10;
        b = 15;
        a %= b; // 10
        System.out.println(a);


    }

    public static void isEven(int number){
        if ((number % 2) == 0){
            System.out.println(number + " чётное");
        } else {
            System.out.println(number + " нечётное");
        }
    }
}
