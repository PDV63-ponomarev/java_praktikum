package files3;

/*
Если какойто процесс использует файл, то другой процесс не может изменить
или удалить используемый файл. По этой причине нужно уведомлять систему о
закрытие файла с помощью метода close().

Исключения могут возникнуть до вызова close(), тогда поток не будет закрыт.
Вызов close() в блоке finally малоэффективно, если ошибка возникает при
создании потока.

Существует конструкция try-with-resources, которая позволяет закрывать ресурсы
без использования finally.

Под ресурсом понимается любой класс, наследуемый от интерфейся Closeable
или AutoCloseable. В этих интерфейсах обхявлен метод close(), который
необходимо реализовать.

В блоке try-with-resources можно объявить несколько ресурсов. Тогда их
необходимо раздеть точкой с запятой. При этом ресурсы, определенные первыми,
будут закрыты последними.

Чтобы преобразить стандартный try в try-with-resources, достаточно объявить
необходимые ресурсы в круглых скобках после ключевого слова try.



 */

import java.io.*;

public class tryWithResources3 {

    public static void main(String[] args) throws IOException {
        // метод close() будет вызван автоматически,
        // когда программа вайдет из блока tri-with-resources
        try (Reader fileReader = new FileReader("filewriter.txt")){
            //код работы с потоком
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try (Resoucre1 resoucre1 = new Resoucre1();
        Resoucre2 resoucre2 = new Resoucre2()) {
            System.out.println("внутрянка блока try");
        }

        try(BufferedReader fileReader = new BufferedReader(new FileReader("filewriter.txt"))) {
            fileReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Resoucre1 implements AutoCloseable{
    @Override
    public  void close(){
        System.out.println("метод close() для Resource1");
    }
}

class Resoucre2 implements AutoCloseable{
    @Override
    public  void close(){
        System.out.println("метод close() для Resource2");
    }
}