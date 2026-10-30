package ss5_static_access_modifier.StudenOnlyWrite;

public class Test {
    static void main(String[] args) {
        Student a1 = new Student();
        System.out.println("Hoc Sinh 1");
        System.out.println("Ten: " + a1.getName());
        System.out.println("Lop: " + a1.getClasses());
        Student a2 = new Student("Tai", "3C6");
        System.out.println("Hoc Sinh 2");
        System.out.println("Ten: " + a2.getName());
        System.out.println("Lop: " + a2.getClasses());
    }
}
