package Exercises.QuanLyPhuongTien.Service;

import Exercises.QuanLyPhuongTien.Entity.Truck;
import java.util.List;

public interface ITruckService {
    List<Truck> getAll();
    boolean add(Truck Truck);
    Truck findByLicensePlate(String licensePlate);
    boolean removeByLicensePlate(String licensePlate);
}