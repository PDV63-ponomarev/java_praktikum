package ExpensiveAndHash_5;

import java.util.ArrayList;
import java.util.HashMap;

public class Spr1_5_5_6_7 {
    static void main() {
        // хеш-таблица
        // Хеш-таблица, она же словарь. Вместо инексов исп уникальный ключ
        // ключ обязателен при создании. значение может быть любого типа

        // создание новой хен-таблицы. Ключ и значения должны быть классом (оберткой)
        HashMap<String, String> officeTool = new HashMap<>();
        HashMap<String, Double> officeTool2 = new HashMap<>();

        //добавление элемента и перезапись
        getHashMap();

        getCountry();

        price();

        //поиск по хещ-таблице
        findValue();

        // суммирование значений
        sumOrders();

        // вывод ключей
        getKeys();

        //удаление по ключу и очистка таблицы
        dellTable();

        // проверка наличия в таблице ключа или значения
        check();
    }

    static void getHashMap(){

        // добавление значения происходит через pul(key, value)
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("P123", "Степлер");
        officeTool.put("OK-59-P", "Монитор");
        officeTool.put("Н-10", "Ножницы");
        System.out.println(officeTool);
        // перезапись по ключу
        officeTool.put("P123", "Стол");
        System.out.println(officeTool);
    }

    static void getCountry(){
        HashMap<String,String> county = new HashMap<>();
        county.put("Канада", "Торонто");
        county.put("Ирак", "Багдад");
        county.put("Австрия", "Вена");
        System.out.println(county);
        county.put("Канада", "Оттава");
        System.out.println(county);


    }

    static void price(){
        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> mohitoPrice = new ArrayList<>();
        mohitoPrice.add(360.00);
        mohitoPrice.add(350.00);
        mohitoPrice.add(154.99);
        menu.put("Коктель Mohito", mohitoPrice);

        ArrayList<Double> tiramisuPrice = new ArrayList<>();
        tiramisuPrice.add(120.0);
        tiramisuPrice.add(115.90);
        tiramisuPrice.add(119.90);
        menu.put("Тирамису", tiramisuPrice);

        ArrayList<Double> ramenPrice = new ArrayList<>();
        ramenPrice.add(99.90);
        ramenPrice.add(119.90);
        ramenPrice.add(110.00);
        menu.put("Рамен", ramenPrice);

        System.out.println(menu);

    }

    static void findValue(){
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("P123", "Степлер");
        officeTool.put("OK-59-P", "Монитор");
        officeTool.put("Н-10", "Острые Ножницы");

        System.out.println(officeTool.get("Н-10") + " найдены по ключу");

        for (String tool: officeTool.values()){
            if (tool.equals("Степлер")){
                System.out.println(tool + " найдены"); //нашли элемент по значению
            }

            System.out.println(tool); //пишет все значения
        }
    }

    static void sumOrders(){
        HashMap<String, Double> orders = new HashMap<>();
        orders.put("Иван", 124.22);
        orders.put("Степан", 22.42);
        orders.put("Григорий", 1225.22);
        orders.put("Дмитрий", 4124.52);
        orders.put("Василий", 1234.22);

        double sum = 0;
        for (Double ord: orders.values()){
            sum += ord;
        }
        System.out.println("Всего было заказов на: " + sum);

    }

    static void getKeys(){
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("P123", "Степлер");
        officeTool.put("OK-59-P", "Монитор");
        officeTool.put("Н-10", "Острые Ножницы");

        for (String inventory: officeTool.keySet()){
            System.out.println(inventory);
        }
    }

    static void dellTable(){
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("P123", "Степлер");
        officeTool.put("OK-59-P", "Монитор");
        officeTool.put("Н-10", "Острые Ножницы");

        System.out.println(officeTool);
        officeTool.remove("Н-10");
        System.out.println(officeTool);
        officeTool.clear();
        System.out.println(officeTool);
    }

    static void check() {
        HashMap<String, String> officeTool = new HashMap<>();
        officeTool.put("P123", "Степлер");

        // проверка содержания ключа
        System.out.println(officeTool.containsKey("P123")); //true
        System.out.println(officeTool.containsKey("123")); // false

        //проверка содержания значения
        System.out.println(officeTool.containsValue("Степлер"));//true
        System.out.println(officeTool.containsValue("Степл"));// false
    }
}
