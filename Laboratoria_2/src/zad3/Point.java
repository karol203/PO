package zad3;
import java.lang.Math;
public class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(Point otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.x-x,2)+Math.pow(otherPoint.y-2,2));
    }

    public static void main(String[] args) {
        Point punkt1 = new Point(2,1);
        Point otherPoint = new Point(2,1);
        System.out.println(punkt1.distance(otherPoint));
        }
    }
