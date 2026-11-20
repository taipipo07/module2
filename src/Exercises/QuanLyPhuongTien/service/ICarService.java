package Exercises.QuanLyPhuongTien.service;

import Exercises.QuanLyPhuongTien.entity.Car;
import java.util.List;

public interface ICarService {
    List<Car> getAll();
    boolean add(Car car);
    Car findByLicensePlate(String licensePlate);
    boolean removeByLicensePlate(String licensePlate);
}