package Exercises.QuanLyPhuongTien.Controller;

import Exercises.QuanLyPhuongTien.Repository.BikeRepository;
import Exercises.QuanLyPhuongTien.Service.BikeService;
import Exercises.QuanLyPhuongTien.View.BikeView;

public class MainBike {
    public static void main(String[] args) {
        new BikeView(new BikeService(new BikeRepository())).showMenu();
    }
}