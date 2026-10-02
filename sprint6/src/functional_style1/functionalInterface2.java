package functional_style1;

/*

Декомпозиция - разложение сложных систем, на несколько более простых.

Интерфейс StringSaverConfig можно разбиить на два разных: StringSaverTransformer и
StringSaverOnSaveListener. В каждоб будет по одному методу

Код хранилища теперь будет принимать два интерфейса вместо одного.
Можно добавить еще один интерфейс StringSaverOnRemoveListener

Интерфейсы, которые получились после декомпозиции называются функциональными.
В обычном интерфейсе можно хранить целый набор разных методов. Функционый интерфейс
содержит в себе ровно один абстрактный метод, поэтому его объект отвечает только
за одно действие.

Чтобы компилятор понимал, что интерфейс функциональный, перед его объявлением
ставится аннотация @FunctionalInterface

Стандартизация
Если у нескольких интерфейсов различается только название, а техническая часть совпадает
Их можно объекдинить в один интерфейс StringsConsumer, описывающий потребителей значения типа String
Методы хранилища будут принимать потребителей для допольнительного действия при сохранении
строк и потребителя для доп действия при удалении

Создавать вручную функциональный интерфейс для каждого потребляемого типа слишком долго.
Используется шаблонизация через дженерики. В стандартной библиотеце Java есть функциональный
интерфейс потребителя значений Consumer, обобщенный по типа параметра <T>

Итого, сначала декомпозировали интрфейс на функциональные интерфейсы. Затем стадартизировали их,
заменив готовыми вариантами из библиотек. Таким образом сократился объекм разработки.

********
Функциональные интерфейсы в библиотеке Java
Все готовые функциональные интерфейсы лежат в пакете java.util.function.

Supplier<T>
Содержит метод get(), который ничего не принимает, но возвращает значение типа Т.
Такой интерфейс может использоваться в конструкторе без параметров. Так в качестве
поставщика значения типа double может служить метод получения случайных дробных числе Math.random)

Predicate<T>
интерфейс проверяет, удовлетворяет ли объект какому-то предикату или свойству,
которое у объекта либо есть, либо нет.  Внутри интерфейса мето test(), принимающий
значение типа T и возвращает true или false. В пример можно проверить строку на непустоту.

Function<T,R>
Интерфейс сожержит метод apply(), который принимает объект типа T и возвращает объект типа R
Пригодится для парсинга числа из строки


 */

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface StringSaverTransformer {
    // как нужно преобразовать сохраняему строку?
    String transform(String line);
}

@FunctionalInterface
interface StringSaverOnSaveListener{
    // дополнительное действие при сохранении
    void onSave(String line);
}

@FunctionalInterface
interface StringSaverOnRemoveListener{
    // дополнительное действие при удалении
    void onRemove(String line);
}

@FunctionalInterface
interface StringConsumer{
    void accept(String value);
}

@FunctionalInterface
interface Consumer<T>{
    void accept(T value);
}

public class functionalInterface2 {
    public  static final int MAX_SIZE = 10_000;

    private List<String> saved = new LinkedList<>();
    private  StringSaverTransformer transformer;
    private  StringSaverOnSaveListener onSaveListener;
    private StringSaverOnRemoveListener onRemoveListener;

    public static void main(String[] args) {
        suplier();
        predicate();
        function();
    }

    static void suplier(){
        Supplier<Double> randomDublerSupplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random(); //случайное число от 0 до 1
            }
        };

        Double supplier = randomDublerSupplier.get();
        System.out.println(supplier);
    }

     static void predicate(){
         Predicate<String> tooLongPredicate = new Predicate<String>() {
             @Override
             public boolean test(String string) {
                 return string.length() > 100;
             }
         };

         String name = "Агафья";

         System.out.println("Имя слишком длинное: " + name + "?");
         System.out.println("Ответ: " + tooLongPredicate.test(name));
    }

    static void function(){
        Function<String, Integer> nameToLengthFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };

        String name = "Марк";
        System.out.println("Сколько букв в имени: " + name + "?");
        System.out.println("Ответ: " + nameToLengthFunction.apply(name));
    }

}
