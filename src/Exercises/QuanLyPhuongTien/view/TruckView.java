package Exercises.QuanLyPhuongTien.view;

import Exercises.QuanLyPhuongTien.entity.Truck;
import Exercises.QuanLyPhuongTien.service.ITruckService;

import java.util.List;
import java.util.Scanner;

public class TruckView {

    private final Scanner sc = new Scanner(System.in);
    private final ITruckService TruckService;

    public TruckView(ITruckService TruckService) {
        this.TruckService = TruckService;
    }
    public void showMenu() {
        boolean check = true;
        while (check) {
            System.out.println("----QUAN LY XE TAI----" +
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
                    List<Truck> Trucks = TruckService.getAll();
                    if (Trucks.isEmpty()) {
                        System.out.println("Danh sach trong!");
                    } else {
                        for (Truck c : Trucks) {
                            System.out.println(c);
                        }
                    }
                    break;
                }
                case 2: {
                    Truck Truck = inputTruck();
                    if (TruckService.add(Truck)) {
                        System.out.println("Them thanh cong!");
                    } else {
                        System.out.println("Bien so da ton tai, them that bai!");
                    }
                    break;
                }
                case 3: {
                    String plate = inputLicensePlate();
                    Truck found = TruckService.findByLicensePlate(plate);
                    if (found == null) {
                        System.out.println("Khong tim thay xe!");
                    } else {
                        System.out.println(found);
                    }
                    break;
                }
                case 4: {
                    String plate = inputLicensePlate();
                    if (TruckService.removeByLicensePlate(plate)) {
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

    private Truck inputTruck() {
        Truck Truck = new Truck();
        Truck.setLicensePlate(inputLicensePlate());

        System.out.print("Nhap hang xe: ");
        Truck.setBrand(sc.nextLine().trim());

        Truck.setProduction(inputInt("Nhap nam san xuat: "));

        System.out.print("Nhap chu so huu: ");
        Truck.setOwner(sc.nextLine().trim());

        Truck.setTonnage(inputInt("Nhap Trong Tai: "));
        return Truck;
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