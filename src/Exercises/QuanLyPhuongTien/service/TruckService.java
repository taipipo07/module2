package Exercises.QuanLyPhuongTien.service;

import Exercises.QuanLyPhuongTien.entity.Truck;
import Exercises.QuanLyPhuongTien.repository.ITruckRepository;
import java.util.List;

public class TruckService implements ITruckService {

    private final ITruckRepository TruckRepository;

    public TruckService(ITruckRepository TruckRepository) {
        this.TruckRepository = TruckRepository;
    }

    @Override
    public List<Truck> getAll() {
        return TruckRepository.getAll();
    }

    @Override
    public boolean add(Truck Truck) {
        if (TruckRepository.findByLicensePlate(Truck.getLicensePlate()) != null) {
            return false; // trùng biển số
        }
        TruckRepository.add(Truck);
        return true;
    }

    @Override
    public Truck findByLicensePlate(String licensePlate) {
        return TruckRepository.findByLicensePlate(licensePlate);
    }

    @Override
    public boolean removeByLicensePlate(String licensePlate) {
        return TruckRepository.removeByLicensePlate(licensePlate);
    }
}