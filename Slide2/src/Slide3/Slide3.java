package Slide3;

import java.util.ArrayList;
import java.util.List;

public class Slide3 {

    public static void main(String[] args) {
        List<Point2D> l_points = new ArrayList<Point2D>();
        Point2D p_2D_1 = new Point2D(1.0,5.0);
        Point2D p_2D_2 = new Point2D(3.0,7.0);

        l_points.add(p_2D_1);
        l_points.add(p_2D_2);

        for (Point2D point:l_points){
            System.out.println(point.toString());
        }

        double sum = 0.0;

        for (Point2D point:l_points){
            sum += point.distance();
        }

        System.out.println(sum);
    }
}
