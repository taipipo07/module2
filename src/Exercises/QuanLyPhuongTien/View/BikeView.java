package Exercises.QuanLyPhuongTien.View;

import Exercises.QuanLyPhuongTien.Entity.Bike;
import Exercises.QuanLyPhuongTien.Service.IBikeService;

import java.util.List;
import java.util.Scanner;

public class BikeView {

    private final Scanner sc = new Scanner(System.in);
    private final IBikeService BikeService;

    public BikeView(IBikeService BikeService) {
        this.BikeService = BikeService;
    }
    public void showMenu() {
        boolean check = true;
        while (check) {
            System.out.println("----QUAN LY XE MAY----" +
                    "\n1.Danh Sach" +
                    "\n2.Them Moi" +
                    "\n3.Tim Xe" +
                    "\n4.Xoa" +
                    "\n5.Thoat");
            System.out.print("Lua chon: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so!");
                continue;
            }
            switch (choice) {
                case 1: {
                    List<Bike> Bikes = BikeService.getAll();
                    if (Bikes.isEmpty()) {
                        System.out.println("Danh sach trong!");
                    } else {
                        for (Bike c : Bikes) {
                            System.out.println(c);
                        }
                    }
                    break;
                }
                case 2: {
                    Bike Bike = inputBike();
                    if (BikeService.add(Bike)) {
                        System.out.println("Them thanh cong!");
                    } else {
                        System.out.println("Bien so da ton tai, them that bai!");
                    }
                    break;
                }
                case 3: {
                    String plate = inputLicensePlate();
                    Bike found = BikeService.findByLicensePlate(plate);
                    if (found == null) {
                        System.out.println("Khong tim thay xe!");
                    } else {
                        System.out.println(found);
                    }
                    break;
                }
                case 4: {
                    String plate = inputLicensePlate();
                    if (BikeService.removeByLicensePlate(plate)) {
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Khong tim thay xe de xoa!");
                    }
                    break;
                }
                case 5:
                    check = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
        System.out.println("----KET THUC----");
    }

    private Bike inputBike() {
        Bike bike = new Bike();
        bike.setLicensePlate(inputLicensePlate());

        System.out.print("Nhap hang xe: ");
        bike.setBrand(sc.nextLine().trim());

        bike.setProduction(inputInt("Nhap nam san xuat: "));

        System.out.print("Nhap chu so huu: ");
        bike.setOwner(sc.nextLine().trim());

        System.out.print("Nhap cong suat: ");
        bike.setPower(sc.nextLine().trim());
        return bike;
    }

    private String inputLicensePlate() {
        System.out.print("Nhap bien so: ");
        return sc.nextLine().trim();
    }

    private int inputInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen!");
            }
        }
    }
}