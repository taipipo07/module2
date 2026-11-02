package ss6_inheritance_in_java.PointAndMoveablePoint;

public class Test6_2 {
    static void main(String[] args) {
        MoveablePoint m= new MoveablePoint();
        Point p= new Point();
        System.out.println("MoveablePoint basic:"+m);
        System.out.println("Point basic:"+p);
        MoveablePoint m1= new MoveablePoint(3.6f,0.7f,3f,5f);
        Point p1= new Point(18f,36f);
        System.out.println("MoveablePoint new:"+m1);
        m1.move();
        System.out.println("MoveablePoint new speed:"+m1);
        System.out.println("Point new:"+p1);
    }
}
