package ss6_inheritance_in_java.CircleAndCylinder;

import ss5_static_access_modifier.StaticAccessModifier.Circle;

public class Test6 {
    static void main(String[] args) {
        Circle a = new Circle();
        System.out.println("Hình tròn 1:");
        System.out.println("Bán kính: " + a.getRadius());
        System.out.println("Diện tích: " + a.getArea());
        Cylinder b = new Cylinder(3,"blue",6);
        System.out.println("Hình trụ 1:");
        System.out.println("Bán kính: " + b.getRadius());
        System.out.println("Diện tích: " + b.getVolume());
    }
}
