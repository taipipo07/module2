package Exercises.QuanLyPhuongTien.Repository;

import Exercises.QuanLyPhuongTien.Entity.Bike;
import java.util.List;

public interface IBikeRepository {
    List<Bike> getAll();
    void add(Bike bike);
    Bike findByLicensePlate(String licensePlate);
    boolean removeByLicensePlate(String licensePlate);
}
