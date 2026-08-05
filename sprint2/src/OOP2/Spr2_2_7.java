package OOP2;

// Переопределяемые методы
//чтобы изменить поведение метода суперкласса (родительского),
//его можно переопределить внутри подкласса
//переопределение мтода помечается в коде с помощью аннотации @Override
//отсуствие аннотации @Override не ошибка, однако ее принято использовать

//Наследование связывает классы, если понадобиться добавить в метод суперкласса новый параметр,
//то надо будет внести правки и во все классы

public class Spr2_2_7 {

    public static void main(String[] args) {
        //создается обьект подкласса
        GeographyTeacther teacther = new GeographyTeacther();
        //вызываем метод подкласса
        System.out.println(teacther.startLesson()); //Достаем глобусы

        Teacher teacther2 = new Teacher();
        System.out.println(teacther2.startLesson()); // Достаем учебники
    }
}

class Teacher {
    protected String startLesson(){ //доступ ограничен классами-наследниками
        return "Достаем учебники";
    }
}

class GeographyTeacther extends Teacher {
    @Override // аннотация
    public String startLesson(){ // доступ стал публичным
        return "Достаем глобусы"; // изменилось содержание
    }
}