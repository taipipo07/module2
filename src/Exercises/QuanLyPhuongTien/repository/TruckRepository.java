package Exercises.QuanLyPhuongTien.repository;

import Exercises.QuanLyPhuongTien.entity.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {

    private final List<Truck> Trucks = new ArrayList<>();

    @Override
    public List<Truck> getAll() {
        return Trucks;
    }

    @Override
    public void add(Truck Truck) {
        Trucks.add(Truck);
    }

    @Override
    public Truck findByLicensePlate(String licensePlate) {
        for (Truck Truck : Trucks) {
            if (Truck.getLicensePlate().equalsIgnoreCase(licensePlate)) {
                return Truck;
            }
        }
        return null;
    }

    @Override
    public boolean removeByLicensePlate(String licensePlate) {
        Truck Truck = findByLicensePlate(licensePlate);
        if (Truck != null) {
            Trucks.remove(Truck);
            return true;
        }
        return false;
    }
}