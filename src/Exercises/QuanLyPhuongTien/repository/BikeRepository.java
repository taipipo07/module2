package Exercises.QuanLyPhuongTien.repository;

import Exercises.QuanLyPhuongTien.entity.Bike;
import java.util.ArrayList;
import java.util.List;

public class BikeRepository implements IBikeRepository {

    private final List<Bike> Bikes = new ArrayList<>();

    @Override
    public List<Bike> getAll() {
        return Bikes;
    }

    @Override
    public void add(Bike Bike) {
        Bikes.add(Bike);
    }

    @Override
    public Bike findByLicensePlate(String licensePlate) {
        for (Bike Bike : Bikes) {
            if (Bike.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return Bike;
            }
        }
        return null;
    }

    @Override
    public boolean removeByLicensePlate(String licensePlate) {
        Bike Bike = findByLicensePlate(licensePlate);
        if (Bike != null) {
            Bikes.remove(Bike);
            return true;
        }
        return false;
    }
}