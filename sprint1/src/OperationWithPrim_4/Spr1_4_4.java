package OperationWithPrim_4;

public class Spr1_4_4 {
//    Логические выражения
//    Boolena

    static void main() {
        String weather = "Дождь";
        if (weather.equals("Дождь")){
            System.out.println("Идет дождь");
        } else {
            System.out.println("Нет дождя");
        }

        boolean isPositive = 1 > 0; //true
        boolean isNegative = !(isPositive); // false

        if (!weather.equals("Солнце")){
            System.out.println("Нет солнца");
        }

//        равноценны
//        temperatura <= 10;
//        !(temperatura > 10);
//
//        равноценны
//        !(code == 999);
//        code != 999;
    }
}
