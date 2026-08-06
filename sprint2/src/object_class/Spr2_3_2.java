package object_class;

//сравнениею с помощью equals(Object)
//этот метод аналогичен ==, но для обьектов ссылочного типа
//метод == не подходит для обьектов ссылочного типа, даже если данные внутри равны

//Правила:
// рефлектсивность - обьект всегда должен быть равен себе x.equals(x) == true;
// симметричность - x.equals(y) == y.equals(x);
// логическая транзакиця - если два обьекта равны и один равен третьему, то все три равны
// согласованность - если не менять данные то результат сравнения всегда один
// на ноль делить нельзя - ни один из сравниваемых обьектов не может быть равен null



import java.util.Objects;

public class Spr2_3_2 {
    public static void main(String[] args) {
       qualsSimple();
    }


    public static void qualsSimple(){
        int variable1 = 42;
        int variable2 = 42;
        boolean result = variable2 == variable1; //сравнение простых переменных
        System.out.println(result); //true

        String title = "Java";
        String author = "Ivan";
        int pagesNumber = 777;
        Book book1 = new Book(title, author, pagesNumber);
        Book book2 = new Book(title, author, pagesNumber);
        boolean result2 = book1 == book2; //сравнение двух экземпляров класса с одинаковым содержимым
        System.out.println(result2); //false
        //false потому что у каждого экземпляра хранится ссылка.
        // Ссылка уникальная и именно она сравнивается

        boolean result3 = book1.equals(book2);
        System.out.println(result3);//true

    }
}

class Book{
    public String title;
    public String author;
    public int pagesNumber;

    public Book(String title, String author, int pagesNumber){
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    @Override //переопределяем метод
    public boolean equals(Object obj){
        //Проверяем адреса обьектов, если ссылаются на один обьект то true
        if (this == obj) return true;
        // проверка не была ли передана пустая ссылка
        if (obj == null) return false;
        //сравнение к единому ли классу обьекты относятся
        if (this.getClass() != obj.getClass()) return false;
        //Приведение переданного обьекта к классу
        // нужно для получения доступа к полям второго обьекта
        Book otherBook = (Book) obj;
        //сравнение происходит с помощью класса Objects.equals
        return Objects.equals(title, otherBook.title) &&
                Objects.equals(author, otherBook.author) &&
                (pagesNumber == otherBook.pagesNumber); // примитивы сравниваем через ==
    }
}

