package Exercises.QuanLyPhuongTien.service;

import Exercises.QuanLyPhuongTien.entity.Bike;
import java.util.List;

public interface IBikeService {
    List<Bike> getAll();
    boolean add(Bike Bike);
    Bike findByLicensePlate(String licensePlate);
    boolean removeByLicensePlate(String licensePlate);
}