package OOP2;

//Ключевое слово - super
//super - с его помощью вызов метода и конструктора суперкласса
// для доступа ко всем параметрам исп super();
// чтобы снова не инциализировать параметр, можно исп super(name);
public class Spr2_2_8 {
    public static void main(String[] args) {
        GymTeacher teacher = new GymTeacher();
        System.out.println("Учитель физкультуры говорит:");
        teacher.startLesson();

        teacher.printSchedule();
    }
}

class Teacher2{
    int numberOfLesson = 24;

    public void startLesson(){
        System.out.println("Для кого звонок");
    }
}

class GymTeacher extends Teacher2{
    int numberOfLesson = 3;
    public void printSchedule(){
        System.out.println("Число уроков в неделю - " + super.numberOfLesson);
        System.out.println("Число уроков физкультуры - " + numberOfLesson);
    }

    @Override
    public void startLesson(){
        super.startLesson(); //вызов метода класса-родителя
        System.out.println("Строится по росту");
    }

}