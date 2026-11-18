package Exercises.QuanLyPhuongTien.Controller;

import Exercises.QuanLyPhuongTien.Repository.BikeRepository;
import Exercises.QuanLyPhuongTien.Repository.CarRepository;
import Exercises.QuanLyPhuongTien.Repository.TruckRepository;
import Exercises.QuanLyPhuongTien.Service.BikeService;
import Exercises.QuanLyPhuongTien.Service.CarService;
import Exercises.QuanLyPhuongTien.Service.TruckService;
import Exercises.QuanLyPhuongTien.View.BikeView;
import Exercises.QuanLyPhuongTien.View.CarView;
import Exercises.QuanLyPhuongTien.View.TruckView;

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