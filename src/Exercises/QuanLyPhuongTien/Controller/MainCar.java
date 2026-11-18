package Exercises.QuanLyPhuongTien.Controller;

import Exercises.QuanLyPhuongTien.Repository.CarRepository;
import Exercises.QuanLyPhuongTien.Service.CarService;
import Exercises.QuanLyPhuongTien.View.CarView;

public class MainCar {
    public static void main(String[] args) {
        new CarView(new CarService(new CarRepository())).showMenu();
    }
}