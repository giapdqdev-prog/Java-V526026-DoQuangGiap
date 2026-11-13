package Slide3;

public class Circle implements Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = new Point(center);
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this(new Point(x, y), radius);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = new Point(center);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double distance() {
        // Khoang cach tu tam hinh tron den goc toa do O(0, 0)
        return center.distance();
    }

    @Override
    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

    @Override
    public void rotate(double angleDegrees) {
        // Hinh tron quay quanh tam cua chinh no thi khong thay doi hinh dang/vi tri
        // Neu quay quanh goc toa do O(0,0):
        center.rotate(angleDegrees);
    }

    @Override
    public void zoom(double ratio) {
        if (ratio > 0) {
            this.radius *= ratio;
        }
    }

    @Override
    public String toString() {
        return String.format("Circle[center=%s, radius=%.2f]", center, radius);
    }
}

