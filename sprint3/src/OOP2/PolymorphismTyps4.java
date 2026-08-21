package OOP2;

/*

Виды полиморфизма:
- классический
- ad-hoc: динамический и статический
- параметрический

Классический:
Если разные классы имплементируют одинаковый интерфейс или наследуется от одного класса
их объекты будут вести себя одинаково.

Ad-hoc полиморфизм - специальные полиморзмы:

Динамический -  связан с наследованием и заключением в переопределение методов.
Позволяет демонстрировать различное поведение при вызове разных типов.
Если в программе есть переменная с типом родителя и в нем хранится объект класса-наследник,
то при вызове метода определенного в обоих классах, будет вызван метод класса-наследника
(Actor и Hamlet)


Статический - это перегрузка метода. В классе может быть несколько методов с одинаковым названием,
но с разными типами параметров. В этом случае компилятор сам выберет нужную реализациют,
в зависимости от типа переданного аргумента
(Printer)


 */

public class PolymorphismTyps4 {
    public static void main(String[] args) {
        //динамический
        Actor actor = new Hamlet();
        actor.play();

        //статичный
        Printer printer = new Printer();
        printer.print(10);
        printer.print("Текст");
        printer.print(printer);
    }



}

class Printer{
    public void print(int i){
        System.out.println(i + " - число");
    }

    public void print(String s){
        System.out.println(s + " - строка");
    }

    public void print(Object o){
        System.out.println(o + " - объект");
    }

    @Override
    public String toString(){
        return "Объект принтера.";
    }
}


class Actor{
    public void play(){
        //вызов переменной зависит от созданного класса, а не от ключевого слова
        System.out.println("Актер говорит: " + this.sayLine());
    }

    public String sayLine(){
        return "Быть или не быть";
    }
}

class Hamlet extends Actor{
    @Override
    public String sayLine(){
        return "В чем твой вопрос";
    }
}