package Slide3;

import java.util.ArrayList;
import java.util.List;

public class Bai3_Shape {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Point(3, 4));
        shapes.add(new Circle(0, 0, 5));
        shapes.add(new Line(0, 0, 4, 0));
        shapes.add(new Triangle(0, 0, 4, 0, 0, 3));
        shapes.add(new Rectangle(0, 0, 6, 4));

        System.out.println("=== DANH SACH HINH BAN DAU ===");
        for (Shape s : shapes) {
            System.out.printf("%s%n  -> Dien tich: %.2f | Chu vi: %.2f | Khoang cach den O: %.2f%n",
                    s, s.area(), s.perimeter(), s.distance());
        }

        System.out.println("\n=== SAU KHI MOVE(2, 3), ROTATE(90), ZOOM(2.0) ===");
        for (Shape s : shapes) {
            s.move(2, 3);
            s.rotate(90);
            s.zoom(2.0);
            System.out.printf("%s%n  -> Dien tich: %.2f | Chu vi: %.2f | Khoang cach den O: %.2f%n",
                    s, s.area(), s.perimeter(), s.distance());
        }
    }
}

