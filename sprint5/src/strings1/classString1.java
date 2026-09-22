package strings1;

public class classString1 {

    public static void main(String[] args) {

        //Строковый литерал
        // Поскольку строки являются объектами, их можно создавать через new
        String myString = new String("Hello");
        // но проще создавать через
        String myString2 = "Hello";
        /*
        При такой записи объект-строка создается через строковый литерал.
        Литералы - это заранее определённые константные значения в программе. Они всегда обозначают одно и тоже.
        Символ 1 - это всегда еденица, а запись "Кот" - всегда слово.
         */

        int age = 23; // 23 - числовой литерал
        String name = "Byte"; // Byte - строковый литерал
        boolean isJava = true; //true - булевый литерал

        /*
        Строки - неизменяемы объект. После инициализации нельзя отредактировать значение.
        По этому для экономии места в ОП, строки с одинаковыми значениями могут ссылаться на один
        и тот же обхект. При создании строк с помозью литерала они попадают в пул строк.
        Если строка находится в пуле и при попытке создать строку с таким же значением, то она не будет
        создаваться второй раз. Вместо этого вернется сылка на уже существующий.

        Строки созданные через new не попадают в пул. Это следует учитывать при сравнении строк.
        Место оператора == нужно всегда использовать equals(). Этот метод вместе с toString() и
        hashCode() уже корректно переопределны для String.
         */

        String one = "Hi";
        String two = "Hi";
        String three = new String("Hi");

        System.out.println(one == two); // true
        System.out.println(one == three); // false
        System.out.println(one.equals(three)); //true

        // метод toString() создает строковое представление объекта.
        // При вызове для строк просто возвращает их самих.

        /*
        Метод length() возвращает длину строки.
        Метод isEmpty() возвращает пустой или нет объект.
         */
        String password = "123456789";
        if (password.isEmpty()){
            System.out.println("Пароль пустой");
        } else if (password.length() < 8) {
            System.out.println("Пароль короткий");
        } else {
            System.out.println("Подойдет");
        }

        /*
        Метод isBlank() проверяет, что строка пустая "" или содержит только пробелы "   "
        Метод trim() возвращает строку из которой удалены пробелы в начале и конце.
         */
        String text = "  Text  ";
        System.out.println(text);
        System.out.println(text.length());
        text = text.trim();
        System.out.println(text);
        System.out.println(text.length());

        /*
        toUpperCase() - переводит текст в верхний регистр
        toLowerCase() - переводит текст в нижний регистр
         */

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());



    }
}
