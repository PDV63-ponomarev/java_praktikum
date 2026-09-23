package strings1;

/*
Метод split(String regex) превращает строку в массив строк String[]
Элементы в строке разделяются по разеделителю regex

regex - аргумент не просто символа, а регулярного выражения. Это особые строки из специальных символов,
которые используются для поиска.  Некоторые символы нельзя использовать напрямую как разделители,
например ., ?, (, ), [, ], *, +, |, \, ^
Если элементы в строке разделены одним из таких символов, то при передаче в метод
необходимо добавить два обратных слеша \\

При необходимости провести обратную операцию - join(String delimeter, String ... strs) - сборка строки.
Упаковка массива в строку.
Аргумент String ... strs означает, что может принять неограниченное кол-во аргументов.
Создавать массив не обезательно, можно просто передать нужное кол-во аргументов.

 */

public class separateString6 {

    public static void main(String[] args) {

        String excellent2 = "Примечание 1.1*примечание 1.2*Применичение 1.3";
        String[] split2 = excellent2.split("\\*");
        for (String student : split2){
            System.out.println(student);
        }

        String excellent = "Марина,Сергей,Петр,Вадя";
        String[] splitStudents = excellent.split(",");
        for (String student : splitStudents){
            System.out.println(student + " - отлично");
        }

        String students = String.join(", ", splitStudents);
        System.out.println(students);

        String pet1 = "Cat";
        String pet2 = "Dog";
        String pet3 = "Turtle";
        String allPets = String.join(", ", pet1, pet2, pet3);
        System.out.println(allPets);
    }




}
