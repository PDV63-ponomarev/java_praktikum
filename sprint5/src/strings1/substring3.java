package strings1;

/*
в String есть три метода поиска подстроки:
- boolean contains(String other) возвращает true если подстрока
будет обнаружена в любом месте строки, иначе false
- boolean startWith(String other) вернет true, если подстрока находится
в начале строки, иначе false
- boolean endWith(String other) вернет true, если подстрока в конце строки, иначе false

Получение подстрок
методы String substring(int beginIndex, int endInex) и String substring(int beginIndex)
Принимают индексы и возвращает искомую подстроку или символ.

    String substring(int beginIndex)
Если передать 1 индекс, то он вернет все символы, начиная от этого индекса и до конца строки

    String substring(int beginIndex, int endInex)
Выведет всю подстроку начинающуюся с beginIndex и заканчиваюшуюся endInex - 1.
Подстроку с индексом endInex метод не выводит.

 */

public class substring3 {

    public static String maskCardNumber(String cardNumber){
        if (cardNumber.length() == 16){
            return cardNumber.substring(0,4)
                    + "********"
                    + cardNumber.substring(cardNumber.length() - 4);
        }else {
          return "Ошибка длины";
        }
    }

    public static void main(String[] args){
        System.out.println(maskCardNumber("1111222233334444"));
    }
}
