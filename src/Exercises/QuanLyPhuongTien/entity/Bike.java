package Exercises.QuanLyPhuongTien.entity;

public class Bike extends Vehicle  {
    private String power;

    public Bike() {
    }

    public Bike(String power) {
        this.power = power;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Cong Suat: " + getPower();
    }
}
