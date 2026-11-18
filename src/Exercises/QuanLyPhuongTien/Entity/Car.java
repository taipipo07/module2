package Exercises.QuanLyPhuongTien.Entity;

public class Car extends Vehicle {
    private int chair = 4;
    private CarType carType;

    public Car() {
    }

    public Car(int chair, CarType carType) {
        this.chair = chair;
        this.carType = carType;
    }

    public int getchair() {
        return chair;
    }

    public void setchair(int chair) {
        this.chair = chair;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Thong tin:(So cho ngoi: " + getchair() + ",Kieu xe: " + getCarType().getname() + ")";
    }
}
