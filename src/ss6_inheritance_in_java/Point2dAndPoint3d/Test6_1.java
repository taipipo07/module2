package ss6_inheritance_in_java.Point2dAndPoint3d;

public class Test6_1 {
    static void main(String[] args) {
        Point2d a = new Point2d();
        System.out.println("Lop 2d a:");
        System.out.println("X= " + a.getX());
        System.out.println("Y= " + a.getY());
        Point2d a1 = new Point2d(2.0f,3.6f);
        System.out.println("Lop 2d a1:");
        System.out.println("X= " + a1.getX());
        System.out.println("Y= " + a1.getY());
        Point3d b = new Point3d(3.7f,0.1f,2.3f);
        System.out.println("Lop 3d b:");
        System.out.println("X= " + b.getX());
        System.out.println("Y= " + b.getY());
        System.out.println("Y= " + b.getZ());
    }
}
