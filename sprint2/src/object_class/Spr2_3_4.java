package object_class;

//toString()
//Возврашает строку содержащую обьект в виде текста
//рекомендуется переопределять

import java.lang.reflect.Array;
import java.util.Arrays;

public class Spr2_3_4 {
    public static void main(String[] args) {
        Adress adress = new Adress("Moscow", "Pupina", 13,"");
        System.out.println(adress.toString());
    }


}

class Adress{
    public String city;
    public String street;
    public int houseNumber;
    public String extraInfo;
    public String[] resident;

    public Adress(String city, String street, int houseNumber, String extraInfo){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.extraInfo = extraInfo;
    }

    @Override
    public String toString() {
        String result = "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber ;
        if(extraInfo != null) {// проверяем что поле не содержит null
            result = result + ", extraInfo.length=" + extraInfo.length();
        } else {
            result = result + ", extraInfo=null";
        }
        return result + ", residents=" + Arrays.toString(resident) + "}";
    }
}