package ss4_class_opject.exercises.Fan;

public class Fan {
    private static final int Slow=1;
    private static final int Medium=2;
    private static final int Fast=3;
    private int speed= Slow;
    private boolean on = false;
    private double radius=5;
    private String colours= "Blue";

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }
    public String toString() {
        if (on) {
            return "speed: " + speed + ", color: " + colours + ", radius: " + radius + ", fan is on";
        } else {
            return "color: " + colours + ", radius: " + radius + ", fan is off";
        }
    }
}
