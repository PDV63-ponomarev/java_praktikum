package TipsOfJava_3;

public class Spr1_3_7 {
    public static void main(String[] args) {
// передача в метод по ссылке и значению
        int number = 10;
        changeVariable(number); //внутри метода число изменится, но ничего не вернет
         System.out.println(number); //10

        number = changeVariable2(number); //внутри метода число изменится и результат передастся сюда
        System.out.println(number); //30


        Cat pixel = new Cat("Red"); // создается рыжий кот
        changeColor(pixel); //передается обьект в метод
        System.out.println(pixel.color); // кот черный


        Integer number2 = 10;
        changeVariable3(number2);
        System.out.println(number2);


    }
    private static void changeVariable(int variable){
        variable = variable * 3; //значение variable стало 30, но мы ничего не возврашаем
    }

    private static int changeVariable2(int variable){
        return variable = variable * 3; //значение variable стало 30, но мы ничего не возврашаем
    }

    private static void changeVariable3(Integer variable){
         variable = variable * 3;
         //значение variable стало 30, но при умножение создалось int число
        // при сохранение числа в переменную Integer создается новый обьект.
        // в переменную variable сохранена ссылка на новое значение,
        // а переменная number остается ссылка на старое
    }

    private static void changeColor(Cat someCat){ //метод принимает обьект класса
        someCat.color = "Black"; //и меняет ему цвет
    }
}

class Cat{
    String color;
    public Cat(String catColor){
        color = catColor;
    }
}