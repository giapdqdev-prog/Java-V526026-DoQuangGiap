package Slide3;

public class Point implements Shape {
    private double x;
    private double y;

    public Point() {
        this(0.0, 0.0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this(other.x, other.y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Khoang cach den điểm khac
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Quay diem quanh mot tam (center) mot goc angleDegrees (do)
    public void rotateAround(Point center, double angleDegrees) {
        double rad = Math.toRadians(angleDegrees);
        double cos = Math.cos(rad);
        double sin = Math.sin(rad);

        double dx = this.x - center.x;
        double dy = this.y - center.y;

        this.x = center.x + (dx * cos - dy * sin);
        this.y = center.y + (dx * sin + dy * cos);
    }

    // Phong to / thu nho diem so voi mot tam (center) theo ti le ratio
    public void zoomFrom(Point center, double ratio) {
        this.x = center.x + (this.x - center.x) * ratio;
        this.y = center.y + (this.y - center.y) * ratio;
    }

    @Override
    public double area() {
        return 0.0;
    }

    @Override
    public double perimeter() {
        return 0.0;
    }

    @Override
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void rotate(double angleDegrees) {
        // Quay quanh goc toa do O(0, 0)
        rotateAround(new Point(0, 0), angleDegrees);
    }

    @Override
    public void zoom(double ratio) {
        // Zoom so voi goc toa do O(0, 0)
        this.x *= ratio;
        this.y *= ratio;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}

