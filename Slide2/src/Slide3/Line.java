package Slide3;

public class Line implements Shape {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Line(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = new Point(start);
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = new Point(end);
    }

    public Point getMidPoint() {
        return new Point(
                (start.getX() + end.getX()) / 2.0,
                (start.getY() + end.getY()) / 2.0
        );
    }

    public double length() {
        return start.distanceTo(end);
    }

    @Override
    public double area() {
        return 0.0;
    }

    @Override
    public double perimeter() {
        // Do dai doan thang
        return length();
    }

    @Override
    public double distance() {
        // Khoang cach tu trung diem doan thang den goc toa do O(0, 0)
        return getMidPoint().distance();
    }

    @Override
    public void move(double dx, double dy) {
        start.move(dx, dy);
        end.move(dx, dy);
    }

    @Override
    public void rotate(double angleDegrees) {
        // Quay doan thang quanh trung diem cua no
        Point mid = getMidPoint();
        start.rotateAround(mid, angleDegrees);
        end.rotateAround(mid, angleDegrees);
    }

    @Override
    public void zoom(double ratio) {
        // Phong to / thu nho doan thang qua trung diem
        Point mid = getMidPoint();
        start.zoomFrom(mid, ratio);
        end.zoomFrom(mid, ratio);
    }

    @Override
    public String toString() {
        return String.format("Line[start=%s, end=%s, length=%.2f]", start, end, length());
    }
}

