package Slide3;

public class Rectangle implements Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    // Khoi tao hinh chu nhat tu tam ( hoac goc tren-trai ) voi chieu rong va chieu cao
    // O day khoi tao tu goc duoi-trai (x, y), chieu rong width, chieu cao height
    public Rectangle(Point bottomLeft, double width, double height) {
        double x = bottomLeft.getX();
        double y = bottomLeft.getY();
        this.a = new Point(x, y);
        this.b = new Point(x + width, y);
        this.c = new Point(x + width, y + height);
        this.d = new Point(x, y + height);
    }

    public Rectangle(double x, double y, double width, double height) {
        this(new Point(x, y), width, height);
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = new Point(d);
    }

    public double getWidth() {
        return a.distanceTo(b);
    }

    public double getHeight() {
        return b.distanceTo(c);
    }

    public Point getCenter() {
        return new Point(
                (a.getX() + c.getX()) / 2.0,
                (a.getY() + c.getY()) / 2.0
        );
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public double distance() {
        // Khoang cach tu tam hinh chu nhat den goc toa do O(0, 0)
        return getCenter().distance();
    }

    @Override
    public void move(double dx, double dy) {
        a.move(dx, dy);
        b.move(dx, dy);
        c.move(dx, dy);
        d.move(dx, dy);
    }

    @Override
    public void rotate(double angleDegrees) {
        // Quay 4 dinh quanh tam hinh chu nhat
        Point center = getCenter();
        a.rotateAround(center, angleDegrees);
        b.rotateAround(center, angleDegrees);
        c.rotateAround(center, angleDegrees);
        d.rotateAround(center, angleDegrees);
    }

    @Override
    public void zoom(double ratio) {
        // Phong to / thu nho 4 dinh so voi tam hinh chu nhat
        Point center = getCenter();
        a.zoomFrom(center, ratio);
        b.zoomFrom(center, ratio);
        c.zoomFrom(center, ratio);
        d.zoomFrom(center, ratio);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[A=%s, B=%s, C=%s, D=%s, width=%.2f, height=%.2f]",
                a, b, c, d, getWidth(), getHeight());
    }
}

