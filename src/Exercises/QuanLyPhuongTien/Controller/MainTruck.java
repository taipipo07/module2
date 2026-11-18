package Exercises.QuanLyPhuongTien.Controller;

import Exercises.QuanLyPhuongTien.Repository.TruckRepository;
import Exercises.QuanLyPhuongTien.Service.TruckService;
import Exercises.QuanLyPhuongTien.View.TruckView;

public class MainTruck {
    public static void main(String[] args) {
        new TruckView(new TruckService(new TruckRepository())).showMenu();
    }
}