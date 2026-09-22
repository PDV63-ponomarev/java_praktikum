package strings1;

/*
При необходимости найти и изменить слова в строках, к примеру для исправления ошибок в текстовом редакторе
или найти информацию в браузере, используются подстроки (substring)

Подстрока - это непрерывнй набор символов внутри строки.
"обед" - подстрока для "победа". "упала на землю" подстрока для "листва упала на землю осенью".
Строка всегда будет подстрокой для самого себя.
Подстроки чувствительны к регистру.


Нумерация символов внутри строки
Нумерация внутри строк не отличается от нумерации в массиве. Свой номер есть у каждого "символа".

indexOf(String str, int fromIndex) - ишет подстроку в строке.
Можно указать с какого индекса fromIndex начать поиск (не обезательно)
Если не находит, возвращает -1

lastInsexOf(String str, int fromIndex) - ищет подстроку справа-налево
Можно указать с какого индекса fromIndex начать поиск (не обезательно)
Если не находит, возвращает -1

Получение символа по индексу.
charAt(int index). Удобно использовать в циклах для прохода по всем элементам строки.
Если такого индекса не находит, выбросит исключение "StringIndexOutOfBoundsException@

 */

public class substring2 {

    public static void main(String[] args) {
        String findStr = "Hello world!";
        System.out.println(findStr.indexOf("world")); // 6
        System.out.println(findStr.lastIndexOf("world")); // 6

        System.out.println(findStr.charAt(6)); // w


        //посчитать сколько раз l встречается в тексте "Hello world!"

        int quantity = 0;
        for (int i = 0; i < findStr.length(); i++){
            if (findStr.indexOf("l", i) != -1){
                i = findStr.indexOf("l", i);
                quantity++;
            } else {
                break;
            }
        }
        System.out.println("Символ найден " + quantity + " раз");
    }
}
