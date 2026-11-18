package Exercises.QuanLyPhuongTien.Service;

import Exercises.QuanLyPhuongTien.Entity.Car;
import java.util.List;

public interface ICarService {
    List<Car> getAll();
    boolean add(Car car);
    Car findByLicensePlate(String licensePlate);
    boolean removeByLicensePlate(String licensePlate);
}