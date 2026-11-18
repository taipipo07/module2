package Exercises.QuanLyPhuongTien.Entity;

public abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private int production = 0;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String brand, int production, String owner) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.production = production;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Phuong Tien{" +
                "Bien So='" + licensePlate + '\'' +
                ", Hang='" + brand + '\'' +
                ", Nam San Xuat=" + production +
                ", Chu So Huu='" + owner + '\'' +
                '}';
    }
}
