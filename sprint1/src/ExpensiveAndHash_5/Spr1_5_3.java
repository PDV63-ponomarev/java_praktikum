package ExpensiveAndHash_5;

import java.util.ArrayList;

public class Spr1_5_3 {
    static void main() {
        //удаление данных
        deleteElement();

        // проверка пустой ли список
        checkIsEmptyArray();

        // проверка содержимого списка
        checkIsContainsArray();
    }

    static void deleteElement(){
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(233.4);
        expenses.add(23.4);
        expenses.add(443.04);
        System.out.println(expenses);
        expenses.remove(1); // удалить элемент под индексом 1
        System.out.println(expenses);
        expenses.remove(233.4); // удалить элемент по значению
        System.out.println(expenses);
        expenses.clear(); // полностью очишает список
        System.out.println(expenses);
    }
    static void checkIsEmptyArray(){
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(233.4);
        expenses.add(23.4);
        if (expenses.isEmpty()){ // проверяет если ли элементы в списке
            System.out.println("Нет сохраненных значений");
        } else {
            System.out.println("Размер списка = " + expenses.size());
        }

        expenses.clear();
        if (expenses.isEmpty()){ // проверяет если ли элементы в списке
            System.out.println("Нет сохраненных значений");
        } else {
            System.out.println("Размер списка = " + expenses.size());
        }
    }

    static void checkIsContainsArray() {
        ArrayList<Double> expenses = new ArrayList<>();
        expenses.add(233.4);
        expenses.add(23.4);
        expenses.add(10.0);
        boolean isExp = expenses.contains(10.0); //проверяет наличие в списке элемента
        if (!isExp){
            expenses.add(1, 666.13); //если элемент нет, заменяет значение
            System.out.println("Добавлено плохое число");
        } else {
            System.out.println("Элемнет на месте");
        }

    }
}
