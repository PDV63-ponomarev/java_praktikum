package exceptions2;

/*
Исключения создаются так же как любой объект в Java - через классы.
Класс исключения должен быть обязательно наследником Throwable или его потомков.
    public class InputException extends Exception{}

У суперкласса всех исключений Throwable четыре публичных конструктора
Throwable() - без параметнов
Throwable(String message) - с передачей короткого описания ошибки
Throwable(String message, Throwable cause) - с передачей текста об ошибки и информации о ее причине.
Throwable(Throwable cause) - только с информацией о причине.
Для использования нужно переопределить.
 */

//пример переопределния сразу всех четырех конструкторов. Можно исп только нужные
class InputException extends Exception {
    public InputException() {
    }

    public InputException(final String message) {
        super(message);
    }

    public InputException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public InputException(final Throwable cause) {
        super(cause);
    }
}

public class castom_exceptions5 {


}

