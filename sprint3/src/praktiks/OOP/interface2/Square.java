package praktiks.OOP.interface2;

public class Square implements Figure{
    // Длина стороны квадрата
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }
}
