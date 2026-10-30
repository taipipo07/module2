package ss5_static_access_modifier.StaticAccessModifier;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hình tròn 1:");
        System.out.println("Bán kính: " + c1.getRadius());
        System.out.println("Diện tích: " + c1.getArea());

        Circle c2 = new Circle(2.5);
        System.out.println("Hình tròn 2:");
        System.out.println("Bán kính: " + c2.getRadius());
        System.out.println("Diện tích: " + c2.getArea());
    }
}
