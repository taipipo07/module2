package Exercises.QuanLyPhuongTien.Entity;

public class Truck extends Vehicle {
    private int Tonnage;

    public Truck() {
    }

    public Truck(int tonnage) {
        Tonnage = tonnage;
    }

    public int getTonnage() {
        return Tonnage;
    }

    public void setTonnage(int tonnage) {
        Tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTrong tai: " + getTonnage();
    }
}
