public class Spr1_5 {
    public static void main() {
        //класс обертка нужна для преврашения примитивов в обьекты

        int a = 15;
        int b = 3;
        int c = -7;
//        Integer[] numbers = new Integer[3];
//
//        numbers[0] = a;
//        numbers[1] = b;
//        numbers[2] = c;

        Integer[] numbers = new Integer[]{a, b, c};

        System.out.println("Сейчас в массиве числа: " + numbers[0]
                + ", " + numbers[1]
                + ", " + numbers[2]);


        //упаковка значения в класс-обертку boolean
        Boolean wrapper = true;
        boolean primitive = wrapper;

    }
}
