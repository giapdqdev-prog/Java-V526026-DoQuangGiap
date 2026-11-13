package Slide3;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
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

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Point2D symmetric(){
        return new Point2D(- this.x,- this.y);
    }

    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public double distance(Point2D other){
        double dx = this.x - other.getX();
        double dy = this.y - other.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }
}
