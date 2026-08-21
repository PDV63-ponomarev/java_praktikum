package OOP2;

import java.util.ArrayList;
import java.util.List;

/*
для определения типа объекта используется оператор instanceof (экземпляр объекта)
Проверяет создал ли объект на основе нужного нам класса или интерфейса.
Сначала указывается переменная, чей тип мы хотим проверить, затем оператор instanceof и тип на который проверяем
Получаем boolean


*/
public class ReferenceType6 {
    public static void main(String[] args) {
        Document passport = new RussianPassport("1111", "45674");
        Document snils = new Snils("73427843");

        List<Document> documents = new ArrayList<>();
        documents.add(passport);
        documents.add(snils);
        for (Document document : documents){
            //Результат оператора instnceof можно записать как boolean
            boolean isPassport = document instanceof RussianPassport;
            if (isPassport){
                RussianPassport passportDocument = (RussianPassport) document;
                System.out.println("Серия паспорта: " + passportDocument.getSeries());
                System.out.println("Номер паспорта: " + passportDocument.getNumber());
            } else if (document instanceof Snils) {
                Snils snilsDocument = (Snils)document;
                System.out.println("Номер СНИЛС: " + snilsDocument.getDocumentNumber());
            } else {
                System.out.println("Неизвестный тип документа");
            }
        }
    }
}

interface Document{
    public String getDocumentNumber();
}

class RussianPassport implements Document{
    private final String series;
    private final String number;

    public RussianPassport(String series, String number){
        this.series = series;
        this.number = number;
    }

    @Override
    public String getDocumentNumber() {
        return series + " " + number;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }
}

class Snils implements Document{
    private final String number;

    public Snils(String number){
        this.number = number;
    }

    @Override
    public String getDocumentNumber() {
        return  number;
    }
    public String getNumber() {
        return number;
    }
}

