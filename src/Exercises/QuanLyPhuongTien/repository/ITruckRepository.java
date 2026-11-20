package Exercises.QuanLyPhuongTien.repository;

import Exercises.QuanLyPhuongTien.entity.Truck;
import java.util.List;

public interface ITruckRepository {
    List<Truck> getAll();
    void add(Truck Truck);
    Truck findByLicensePlate(String licensePlate);
    boolean removeByLicensePlate(String licensePlate);
}
