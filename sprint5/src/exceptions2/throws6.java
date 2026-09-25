package exceptions2;

/*
Ключевое слово throws используется для сообщения компилятору, что метод может
сгенерировать исключение.

throw дает команду сгенерировать исключение, thworS обозначает, что метод генерирует исключение -
тоесть внутри него можно использовать throw.

throws используется после круглых скобок метода.

    public void methodWithException() throws FirstException {
        // какой-то код
        if (какое-то условие) {
            throw new FirstException(); // сгенерировать исключение
        }
        // какой-то код
    }
Означает, что метод methodWithException может сгенерировать исключение FirstException

Конструктор класса тоже может сгенерировать исключение. Поэтому throws может использоваться
и в конструкторах.

******
throws используется для указания проверяемых исключений, так как их обработка обязательна
и является частью логики приложения. Когда вызывается метод, в котором указана проверка исключения
с помощью throws, то есть два варианта действий:
1) Обернуть этот метод в try-catch и добавить логику по обработке или выводу информации об ошибке
2) Переадресовать обработку исключения вызывающему методу или JVM. Для этого нужно добавить
throws с указанием исключения, которое может произойти, в тот метод, что вызывает метод с throws.
В этом случае обработку исключения возьмет на себя вызывающий метод или JVM, если это точка запуска прогр.




 */



public class throws6 {
    // сообщаем JVM, что метод main вызывает метод, который может выбросить исключение
    public static void main(String[] args) throws NumberShouldBePositiveException {
        System.out.println(getPositiveInteger("10"));
        System.out.println(getPositiveInteger("-10"));
    }

    public static int getPositiveInteger(final String input)
            throws NumberShouldBePositiveException { // метод выбрасывает исключение
        int value = Integer.parseInt(input);
        if (value < 0) {
            throw new NumberShouldBePositiveException();
        }
        return value;
    }
}

class NumberShouldBePositiveException extends Exception {
}
