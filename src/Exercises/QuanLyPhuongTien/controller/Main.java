package Exercises.QuanLyPhuongTien.controller;

import Exercises.QuanLyPhuongTien.repository.BikeRepository;
import Exercises.QuanLyPhuongTien.repository.CarRepository;
import Exercises.QuanLyPhuongTien.repository.TruckRepository;
import Exercises.QuanLyPhuongTien.service.BikeService;
import Exercises.QuanLyPhuongTien.service.CarService;
import Exercises.QuanLyPhuongTien.service.TruckService;
import Exercises.QuanLyPhuongTien.view.BikeView;
import Exercises.QuanLyPhuongTien.view.CarView;
import Exercises.QuanLyPhuongTien.view.TruckView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarView carView = new CarView(new CarService(new CarRepository()));
        BikeView bikeView = new BikeView(new BikeService(new BikeRepository()));
        TruckView truckView = new TruckView(new TruckService(new TruckRepository()));

        boolean check = true;
        while (check) {
            System.out.println("----QUAN LY PHUONG TIEN----" +
                    "\n1.Quan ly Oto" +
                    "\n2.Quan ly Xe May" +
                    "\n3.Quan ly Xe Tai" +
                    "\n0.Thoat");
            System.out.print("Lua chon: ");
            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
                    carView.showMenu();
                    break;
                case "2":
                    bikeView.showMenu();
                    break;
                case "3":
                    truckView.showMenu();
                    break;
                case "0":
                    check = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
        System.out.println("----KET THUC CHUONG TRINH----");
    }
}