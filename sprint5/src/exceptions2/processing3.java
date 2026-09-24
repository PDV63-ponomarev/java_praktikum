package exceptions2;

/*
Обработка исключений
Для обработки исключений существует конструкция из try (пытаться) и catch(ловить)
В try передается код, из-за которого может произойти исключение.
В catch в качестве аргумента - типа ошибки, а в тело - код, который выполняется если
произойдет исключение указанное в try.

Обработка исключений настраивается исходя из логики программы. К примеру ее можно добавить
в тело метода. В случае ошибки при этом можно настроить возврат какого-то значения по умолчанию.
Плюс такого подхода - в любом случае вернется значение с которым можно работать.
Минус - не получится определить где значение возникло в результате исключения, а где было
передано в метод.

Другой вариант - добавить обработку исключения в тот метод, который вызывает код, где оно может произойти.
К примеру в main

Логика обработки исключения через блок try-catch остается на выбор разработчика.
Код внутри блока catch - решает сам разработчик.

*****
Множественный catch
При общей обработки с типом Throwable не получится узнать, что конкретно сломалось.
Чтобы обрабатывать разные типы исключний, нужно добавить несколько блоков cathc.
Каждый из них будет отвечать за конкретное исключение и выдавать соответствующий ответ




 */


import java.net.URI;
import java.net.URISyntaxException;

public class processing3 {

    public static void main(String[] args) {
        System.out.println(convert("10"));
        System.out.println(convert("abc10"));


        try {
            System.out.println(convert2("10"));
        } catch (Throwable exception) {
            System.out.println("Строка для преобразования не является числом");
        }
        try {
            System.out.println(convert2("abc10"));
        } catch (Throwable exception) {
            System.out.println("Строка для преобразования не является числом");
        }


        System.out.println(parseStringTouri("https://ya.ru"));
        System.out.println(parseStringTouri(null));
        System.out.println(parseStringTouri(":/"));

    }

    public static int convert(final String input) {
        try {
            return Integer.parseInt(input, 10); //если исключения нет, вернет число
        } catch (Throwable exception) {
            return 0; //если исключение - вернет 0
        }
    }

    public static int convert2(final String input) {
        return Integer.parseInt(input, 10);
    }

    public static URI parseStringTouri(final String input) {
        try {
            return new URI(input);
        } catch (URISyntaxException exp) {
            System.out.println("Неверный синтаксис URI");
        } catch (NullPointerException exp) {
            System.out.println("Передан неинцилизированный объект.");
        }
        return null;
    }

}
