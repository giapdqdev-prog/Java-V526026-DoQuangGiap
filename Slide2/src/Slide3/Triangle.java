package Slide3;

public class Triangle implements Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = new Point(a);
        this.b = new Point(b);
        this.c = new Point(c);
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this(new Point(x1, y1), new Point(x2, y2), new Point(x3, y3));
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = new Point(a);
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = new Point(b);
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = new Point(c);
    }

    // Trong tam tam giac
    public Point getCentroid() {
        return new Point(
                (a.getX() + b.getX() + c.getX()) / 3.0,
                (a.getY() + b.getY() + c.getY()) / 3.0
        );
    }

    @Override
    public double area() {
        // Cong thuc Heron
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        double p = (ab + bc + ca) / 2.0;
        return Math.sqrt(Math.max(0.0, p * (p - ab) * (p - bc) * (p - ca)));
    }

    @Override
    public double perimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    @Override
    public double distance() {
        // Khoang cach tu trong tam den goc toa do O(0, 0)
        return getCentroid().distance();
    }

    @Override
    public void move(double dx, double dy) {
        a.move(dx, dy);
        b.move(dx, dy);
        c.move(dx, dy);
    }

    @Override
    public void rotate(double angleDegrees) {
        // Quay tam giac quanh trong tam
        Point G = getCentroid();
        a.rotateAround(G, angleDegrees);
        b.rotateAround(G, angleDegrees);
        c.rotateAround(G, angleDegrees);
    }

    @Override
    public void zoom(double ratio) {
        // Phong to / thu nho tam giac so voi trong tam
        Point G = getCentroid();
        a.zoomFrom(G, ratio);
        b.zoomFrom(G, ratio);
        c.zoomFrom(G, ratio);
    }

    @Override
    public String toString() {
        return String.format("Triangle[A=%s, B=%s, C=%s]", a, b, c);
    }
}

