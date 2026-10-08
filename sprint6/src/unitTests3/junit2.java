package unitTests3;

/*

Фраемворк - класс библиотек. В нем содержится набор классов и методов, которые можно
использовать в программе. Фреймворк отличается от обычной библиотеки тем, что код библиотеки
запускается из вашего кода, в то время как фреймворк может использовать ваш код в своей работе.

JUnit - один из самых популярных фреймворков для тестирования Java.
Для написания теста с помощью JUnit надо:
    1. ПОдключить к проекту JUnit как библиотеку
    2. Создать метод и пометить его аннотацией @Test. Аннотации - это механизм Java
    представляющий дополнительную информацию о создаваемых классах и методах.

Метод asserEquals()
Принимает 2 или 3 аргумента. Первый - ожидаемый результат, второй - фактический.
Третий аргумент - необезатльная строка, которая выведется если фактическкий результат
не равен ожидаемому.

 */




public class junit2 {
    DiscountCalculator discountCalculator = new DiscountCalculator();

    @Test
    public void shouldGiveNoDiscountForValue999(){
        int buySum = 999;
        int expectedSum = 999;

        //исполнение
        int resultSum = discountCalculator.summAfterDiscount(buySum);

        //проверка
        Assertions.assertEquals(expectedSum, resultSum);
    }
}

class DiscountCalculator{
    public int summAfterDiscount(int sum){
        if (sum < 1000){
            return sum;
        } else {
            return (int) (sum * 0.98);
        }
    }
}