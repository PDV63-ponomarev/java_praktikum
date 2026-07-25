package ExpensiveAndHash_5;

import java.util.ArrayList;
import java.util.SortedMap;

public class Spr1_5_2 {
    static void main() {
//        добавление в список происходит через add(значение)
//        тип значения указывать не обязательно, упаковка примитива в обертку автоматом

        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(3.2); // добавление дробного числа в список
        System.out.println(expenses);

        // если нужно добавить значение на конкретную позицию, то указывается перед значением
        expenses.add(0, 55.6);
        System.out.println(expenses);

        //индекс не может быть больше длины списка
        // в список можно добавить значение только того типа, указанного при обьявлении

        names();

        // чтобы получить элемент из списка, нужно исп get( int index)

        double myExpenses = expenses.get(0);
        System.out.println("myExpenses: " + myExpenses);
        System.out.println("expenses.get(1): " + expenses.get(1));

        // размер списка узнается через size
        System.out.println("Размер списка: "+expenses.size());
        expenses.add(13.1);
        System.out.println("Размер списка: "+expenses.size());

        // метод size() всегда указывает актуальный размер
        // метод length у массива всегда показывает созданный размер
        double[] expensesArray = new double[10];
        System.out.println("Размер массива: " + expensesArray.length);
        expensesArray[0] = 10;
        expensesArray[2] = 11;
        System.out.println("Размер массива: " + expensesArray.length);

        temeratureMax();

        sumSpeeds();

    }


    static void names(){
        ArrayList<String> femaleNames = new ArrayList<>();
        femaleNames.add("Екатерина");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add("Наталья");
        System.out.println("Сейчас в списках: ");

        // цикл вывода содержимого списка
        for (int i = 0; i < femaleNames.size(); i++){//i строго меньше размера списка
            System.out.println((i + 1) + ")" + femaleNames.get(i));
        }
    }

    static void temeratureMax(){
        double[] temperature = new double[4];
        temperature[0] = 34.3;
        temperature[1] = 43.2;
        temperature[2] = 13.2;
        temperature[3] = 33.2;

        double max = 0;
        for (int i = 0; i < temperature.length; i++){
            if (temperature[i] > max){
                max = temperature[i];
            }
        }
        System.out.println("Максимальная температура = " + max);

        // сокрашенный вариант перебора
        double min = 100;
        for (Double temp: temperature){
            if (temp < min){
                min = temp;
            }
        }
        System.out.println("Минимальная температура = " + min);
    }
    static void sumSpeeds(){
        ArrayList<Integer> speeds = new ArrayList<>();
        speeds.add(120);
        speeds.add(64);
        speeds.add(13);
        speeds.add(100);
        speeds.add(84);

        int sum = 0;
        for (Integer speed: speeds){
            sum += speed;
        }

        int averageSpeed = sum / speeds.size();
        System.out.println("Средняя скорость: " + averageSpeed + "км/ч");

    }
}
