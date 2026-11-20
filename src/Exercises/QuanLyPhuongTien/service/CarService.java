package Exercises.QuanLyPhuongTien.service;

import Exercises.QuanLyPhuongTien.entity.Car;
import Exercises.QuanLyPhuongTien.repository.ICarRepository;
import java.util.List;

public class CarService implements ICarService {

    private final ICarRepository carRepository;

    public CarService(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAll() {
        return carRepository.getAll();
    }

    @Override
    public boolean add(Car car) {
        if (carRepository.findByLicensePlate(car.getLicensePlate()) != null) {
            return false; // trùng biển số
        }
        carRepository.add(car);
        return true;
    }

    @Override
    public Car findByLicensePlate(String licensePlate) {
        return carRepository.findByLicensePlate(licensePlate);
    }

    @Override
    public boolean removeByLicensePlate(String licensePlate) {
        return carRepository.removeByLicensePlate(licensePlate);
    }

}