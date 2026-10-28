package ss4_class_opject.exercises.Fan;

public class MainFan {
    static void main(String[] args) {
        Fan fan1= new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColours("yellow");
        fan1.setOn(true);
        System.out.println("Fan 1: " + fan1);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedium());
        fan2.setRadius(5);
        fan2.setColours("blue");
        fan2.setOn(false);
        System.out.println("Fan 2: " + fan2);
    }
}
