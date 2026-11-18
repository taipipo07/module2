package Exercises.QuanLyPhuongTien.Service;

import Exercises.QuanLyPhuongTien.Entity.Bike;
import Exercises.QuanLyPhuongTien.Repository.IBikeRepository;
import java.util.List;

public class BikeService implements IBikeService {

    private final IBikeRepository BikeRepository;

    public BikeService(IBikeRepository BikeRepository) {
        this.BikeRepository = BikeRepository;
    }

    @Override
    public List<Bike> getAll() {
        return BikeRepository.getAll();
    }

    @Override
    public boolean add(Bike Bike) {
        if (BikeRepository.findByLicensePlate(Bike.getLicensePlate()) != null) {
            return false; // trùng biển số
        }
        BikeRepository.add(Bike);
        return true;
    }

    @Override
    public Bike findByLicensePlate(String licensePlate) {
        return BikeRepository.findByLicensePlate(licensePlate);
    }

    @Override
    public boolean removeByLicensePlate(String licensePlate) {
        return BikeRepository.removeByLicensePlate(licensePlate);
    }
}