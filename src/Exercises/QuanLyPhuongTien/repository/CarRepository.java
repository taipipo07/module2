package Exercises.QuanLyPhuongTien.repository;

import Exercises.QuanLyPhuongTien.entity.Car;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {

    private final List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public boolean removeByLicensePlate(String licensePlate) {
        Car car = findByLicensePlate(licensePlate);
        if (car != null) {
            cars.remove(car);
            return true;
        }
        return false;
    }
}