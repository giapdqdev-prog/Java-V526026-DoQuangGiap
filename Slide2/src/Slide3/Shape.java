package Slide3;

public interface Shape {
    // Nhom tinh toan
    double area();
    double perimeter();
    double distance();

    // Nhom bien doi
    void move(double dx, double dy);
    void rotate(double angleDegrees);
    void zoom(double ratio);
}

