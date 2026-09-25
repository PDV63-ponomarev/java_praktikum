package exceptions2;

/*

Стек-трейс появляется, если в коде не настроена обработка исключений. Если же ошибка
обработана с помощью блока try-catch, то выполнится код блока catch и информации об
ошибке в терминале не будет.
Для самостоятельного получения информации об исключении используются методы
классов Throwable и StackTraceElement

printStackTrace()
на экран выводиться информация об обработанной ошибке.

    catch(ArithmeticException){
        exception.printStackTrace();
    }

getMessage()
Короткое сообщение с описанием ошибки, но без причины и местоположения.
Использовать можно только если при генерации исключений, были использованы
конструкторы Throwable с параметром String message. То есть в исключение была
передана короткая информация message. Если такого нет - вызов впернет null.

***************
getStackTrace() и методы StackTraceElement
Достцп к информации, которую выводит на экран printStackTrace(), предоставляет
метод класса Throwable -  getStackTrace(). Возвращает массив элементов, представленных
классом StackTraceElement. С помощью сочетания getStackTrace() и методов класса StackTraceElement
можно упрость поиск исключений и получить определенную информацию.

getClassName() - возвращает название класса, где произошла ошибка
getMethodName() - позволяет получить имя вызванного при этом метода
getFileName() - показывает имя файла
getLineNumber() - отобразит номер линии в файле.

Связка getStackTrace() и методов StackTraceElement работает так. После того как метод
getStackTrace() возвращает массив данных об исключении, можно пройтись по нему целиком,
чтобы отобразить нужную информацию методов StackTraceElement

 */



public class catch4 {

    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException exception) {
//            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }


        try {
            calculate1();
        } catch (ArithmeticException exception) {
            for (StackTraceElement stack : exception.getStackTrace()) {
                System.out.println(String.format("Класс: " + stack.getClassName() + ", " +
                        "метод: " + stack.getMethodName() + ", " +
                        "имя файла: " + stack.getFileName() + ", " +
                        "строка кода: " + stack.getLineNumber()));
            }
        }
    }

        public static void calculate1() {
            calculate2();
        }

        public static void calculate2() {
            System.out.println(10 / 0);
        }

}
