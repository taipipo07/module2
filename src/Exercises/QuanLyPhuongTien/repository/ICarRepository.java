package Exercises.QuanLyPhuongTien.repository;

import Exercises.QuanLyPhuongTien.entity.Car;
import java.util.List;

public interface ICarRepository {
    List<Car> getAll();
    void add(Car car);
    Car findByLicensePlate(String licensePlate);
    boolean removeByLicensePlate(String licensePlate);
}