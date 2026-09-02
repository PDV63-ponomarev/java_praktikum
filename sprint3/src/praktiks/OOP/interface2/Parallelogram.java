package praktiks.OOP.interface2;

public class Parallelogram implements Figure{
    //Длина любой стороны
    private final double a;
    // высота основания
    private final double h;

    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getArea() {
        return a * h;
    }
}
