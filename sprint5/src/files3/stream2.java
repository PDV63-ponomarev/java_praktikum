package files3;

/*
Отравка и получения данных - называется вводом-выводом.

Поток - бесконечная последовательно данных.
Поток подключен к источнику (source) или получателю данных (destination).

По направлению потоки делятся на:
- потоки ввода, из которого считываются данные
- потоки вывода, в которые записываются данные.

По типу пеедаваемых данных:
- символьные потоки, содержащие символы
- байтовые потоки, содержат информацию в виде последовательности байтов

 ****
 Классы для работы с потоками.
 Для каждого из типов потоков есть отдельный базовый абстрактный класс:
    - InputStream представляет поток вводя для чтения байтов
    - OutputStream представляет поток выводя для записи байтов
    - Reader представляет поток ввода для чтения символов
    - Writer представляет поток вывода для записи символов

****
Потоки и файлы
Для работы с файлами у каждого из четырех абстр классов потоков есть реализация:
FileInputStream, FileOutputStream, FileReader, FileWriter.

Выбор между байтовыми и символьнами потоками зависит от типов файлов.
Для бинарных файлов, по типу картинок, видео, pdf, нужен байтовый поток.
FileInputStream для чтения, FileOutputSteream для записи.
Для текстовых файлов лучше использовать символьный поток, но можно и байтовый.
FileReader для чтения, FileWriter за записи.


Общая схема:
1. Создание потокового объекта и ассоциируется с файлом на диске
2. Чтение данных из потока или запись в поток.
3. Закрытие потока.


Запись
Для записи в файл сначала создается обхект FileWriter.
С помощью метода write() добавляется строки в новый файл.
В конце закрывается поток методом close()

Конструктор FileWriter(String string) содержимое файла будет создаваться заного
каждый раз. Для добавления записи к уже существующему файлу, нужно воспользоваться
FileWriter(String string, boolean append) и передать значение true для флага append.
Этот признак, что данные будут записаны в конец файла.


Чтение
Чтобы прочитать файл сначала создается объек FileReader,  подключемый к файлы.
FileReader считывает данные по одному символу за раз, пока не дочитает до конца.
Метод read() возвращает значение int. int содержит значение char прочитанного символа.
Если метод read() возвращает -1, значит в FileReader больше нет дланных для чтения
и можно закрыть с помощью close().


Буферизация
Можно ускорить считывание файла с помощью буферизации.
Это способ ввода-вывода данных, при котором для их хранения используется
область памяти - буфер.

Буфером может быть обычный массив.Данные передаются в нгео, накапливаются и
обрабатываются вместе. Будет производиться обращение к буферу, а не файлу,
что увеличит производительность.

Буферизация может использоваться и для записи. Данные сначала сохраняются в буфер,
затем при наполнение одной порцией записываются в файл.

BufferedReader - подкласс Reader, может использвать теже методы для чтения из потока.
Есть собственный метод readLine(), позволяющий считывать данные из поток построчно.

Имеет следующие конструторкы:
BufferedReader(Reader in)
BudderedReader(Reader in, int sz)
Если не передать размер буфера в конструкто явно, программа использует
значение по умолчанию - 8192 символа.
 */


import java.io.*;

public class stream2 {
    public static void main(String[] args) throws IOException {
        writeNewFile();
        writeGetText();

        System.out.println("Чтение через reader:");
        readText();

        System.out.println("\nЧтение через буфер:");
        readBuffer();

    }

    public static void writeNewFile() throws IOException {
        Writer fileWriter = new FileWriter("filewriter.txt");

        fileWriter.write("new record in new file\n");
        fileWriter.write("get text");

        fileWriter.close();
    }

    public static void writeGetText() throws IOException {
        Writer fileWriter = new FileWriter("filewriter.txt", true);

        fileWriter.write("\nget new text");

        fileWriter.close();
    }

    public static void readText() throws IOException{
        Reader fileReader = new FileReader("filewriter.txt");

        int data = fileReader.read();
        while (data != -1){
            System.out.print((char) data);
            data = fileReader.read();
        }

        fileReader.close();
    }

    public static void readBuffer() throws IOException{
        Reader fileReader = new FileReader("filewriter.txt");
        BufferedReader br = new BufferedReader(fileReader);

        while (br.ready()){
            String line = br.readLine();
            System.out.println(line);
        }

        br.close();
    }
}
