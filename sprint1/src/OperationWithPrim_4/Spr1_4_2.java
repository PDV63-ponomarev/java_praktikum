package OperationWithPrim_4;

public class Spr1_4_2 {
    static void main() {
        // Приведение типов в арифм выражениях

        double b = 120.75;
        double c = 50.25;
        b %= c;
        System.out.println(b); //20.25


        double d = 16.5 / 2.5;
        double a = 1.0;
        a = d / 2;
        System.out.println(++a);

        // при работе с целочесленными типами, результат будет целочисленным
        int e = 120;
        int g = 43;
        a = e / g; // ответ 2.0, если операнды целые то и ответ отбрасывается
        e /= g; // ответ 2. Округления не происходит, а отбрасываются
        System.out.println(a);
        System.out.println(e);

        //когда в арифм выражения есть дробное число, то результат всегда дробный
        double h = 120;
        int l = 43;
        double m = h / l;
        System.out.println(m);
        System.out.println(h - l);
        System.out.println(h + l);
        System.out.println(h * l);

        // если в операндах есть дробные числа, то привести ответ к int нельзя


        int i = 11;
        double u = 20.5;
        i /= 2;
        u %= i;
        System.out.println(u);

        broke();

    }

    static void broke(){
        int a = 13;
        int b = 3;

        a = ++a - a % b++;
        System.out.println(a + " и " + b);

        a = 13;
        b = 3;
        ++a;
        int d = a % b;
        a -= d;
        b++;
        System.out.println(a + " и " + b);

    }

}
