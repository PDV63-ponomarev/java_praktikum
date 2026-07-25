package ExpensiveAndHash_5;

import java.util.ArrayList;

public class Spr1_5_1 {
    static void main() {
        // массив может хранить информацию не больше заданной
        double[] expenses = new double[7]; // в этом массиве может быть не больше 7 элементов
        double[] expenses2 = new double[1000]; // не больше тысячи

        // если заданного значения не хватает, толь искользуется список (list)
        // список автоматически увеличивается
        // При объявлении списка нужно указать класс, объекты которого будет содержать
        // список работает только со ссылочными типами, примитивы нужно заменить на обертку (double - Double)

        // создание списка с дробными числами
        ArrayList<Double> expensesArray = new ArrayList<>();

        // класс ArrayList назыв обобщением или дженериком (generics)
        // он умеет работать с объектами разных типов
        ArrayList<String> names = new ArrayList<>(); //список имен
        ArrayList<Integer> count = new ArrayList<>(); // список целых чисел
//        ArrayList<Hamste> hamstes = new ArrayList<>(); // список хомяков
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>(); // список списков





    }
}
