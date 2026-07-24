package TipsOfJava_3;

public class Spr1_3_6 {
    static void main() {
//        Парсинг. Преобразование строки в число
        String input = "1000";
        Integer number = Integer.parseInt(input);

        Byte.parseByte("12");
        Short.parseShort("345");
        Integer.parseInt("99999");
        Long.parseLong("100000000000");
        Float.parseFloat("12.3");
        Double.parseDouble("456.789");
        Boolean.parseBoolean("true");

        long a = 124_324_444;
        long b = 7_535_343_443L;
        long maximum = Long.max(a,b);
        System.out.println("Maximum: " + maximum);
        long minimum = Long.min(a, b);
        System.out.println("Minimum: " + minimum);

        // привеление классов орберток к примитиву
        Long bigNumber = 10l;
        short smallNumber = bigNumber.shortValue();



        byte c = 10;
        byte d = 20;
        System.out.println(findMax(c,d));


        String firstNumber = "123.45";
        String secondNumber = "345.67";
        System.out.println(addNumber(firstNumber, secondNumber));

    }

    private static byte findMax(byte firstNumber, byte secondNumber){
        return (byte) Integer.max(firstNumber, secondNumber);
    }


    private static Float addNumber(String firstNumber, String secondNumber){
        return Float.parseFloat(firstNumber) + Float.parseFloat(secondNumber);
    }


}
