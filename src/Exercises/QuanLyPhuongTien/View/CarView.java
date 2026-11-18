package Exercises.QuanLyPhuongTien.View;

import Exercises.QuanLyPhuongTien.Entity.Car;
import Exercises.QuanLyPhuongTien.Entity.CarType;
import Exercises.QuanLyPhuongTien.Service.ICarService;

import java.util.List;
import java.util.Scanner;

public class CarView {

    private final Scanner sc = new Scanner(System.in);
    private final ICarService carService;

    public CarView(ICarService carService) {
        this.carService = carService;
    }
    public void showMenu() {
        boolean check = true;
        while (check) {
            System.out.println("----QUAN LY OTO----" +
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
                    List<Car> cars = carService.getAll();
                    if (cars.isEmpty()) {
                        System.out.println("Danh sach trong!");
                    } else {
                        for (Car c : cars) {
                            System.out.println(c);
                        }
                    }
                    break;
                }
                case 2: {
                    Car car = inputCar();
                    if (carService.add(car)) {
                        System.out.println("Them thanh cong!");
                    } else {
                        System.out.println("Bien so da ton tai, them that bai!");
                    }
                    break;
                }
                case 3: {
                    String plate = inputLicensePlate();
                    Car found = carService.findByLicensePlate(plate);
                    if (found == null) {
                        System.out.println("Khong tim thay xe!");
                    } else {
                        System.out.println(found);
                    }
                    break;
                }
                case 4: {
                    String plate = inputLicensePlate();
                    if (carService.removeByLicensePlate(plate)) {
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

    private Car inputCar() {
        Car car = new Car();
        car.setLicensePlate(inputLicensePlate());

        System.out.print("Nhap hang xe: ");
        car.setBrand(sc.nextLine().trim());

        car.setProduction(inputInt("Nhap nam san xuat: "));

        System.out.print("Nhap chu so huu: ");
        car.setOwner(sc.nextLine().trim());

        car.setchair(inputInt("Nhap so cho ngoi: "));
        car.setCarType(inputCarType());
        return car;
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

    private CarType inputCarType() {
        while (true) {
            System.out.println("Chon loai xe:" +
                    "\n1.Du lich" +
                    "\n2.Khach");
            System.out.print("Lua chon: ");
            String input = sc.nextLine().trim();
            if (input.equals("1")) {
                return CarType.DU_LICH;
            } else if (input.equals("2")) {
                return CarType.KHACH;
            }
            System.out.println("Khong hop le, nhap lai!");
        }
    }
}