package ss5_static_access_modifier.CRUD;

import java.util.Scanner;

public class Manager {
    private Product[] products = new Product[100];
    private int count = 0;
    Scanner scanner = new Scanner(System.in);

    void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("---Quan Ly San Pham----" +
                    "\n1.Them" +
                    "\n2.Sua" +
                    "\n3.Xoa" +
                    "\n4.Tim Kiem");
            System.out.println("Lua chon cua ban:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("---Them Moi San Pham----");
                    manager.add();
                    break;
                case 2:
                    System.out.println("---Chinh Sua san Pham----");
                    manager.edit();
                    break;
                case 3:
                    System.out.println("---Xoa San Pham----");
                    manager.delete();
                    break;
                case 4:
                    System.out.println("---Tim Kiem San Pham----");
                    manager.search();
                    break;
                default:
                    check = false;
                    break;
            }
        }
    }

    public void add() {
        if (count == products.length) {
            System.out.println("Mang da day!");
            return;
        }
        System.out.println("Nhap id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Nhap gia:");
        double price = Double.parseDouble(scanner.nextLine());
        products[count] = new Product(id, name, price);
        count++;
        System.out.println("Them thanh cong!");
    }

    public void edit() {
        System.out.println("Nhap id can sua:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findIndexById(id);
        if (index == -1) {
            System.out.println("Khong tim thay san pham!");
            return;
        }
        System.out.println("Nhap ten moi:");
        products[index].setName(scanner.nextLine());
        System.out.println("Nhap gia moi:");
        products[index].setPrice(Double.parseDouble(scanner.nextLine()));
        System.out.println("Sua thanh cong!");
    }
    public void delete(){
        System.out.println("Nhap id can xoa:");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findIndexById(id);

        if (index == -1) {
            System.out.println("Khong tim thay san pham!");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            products[i] = products[i + 1];
        }
        products[count - 1] = null;
        count--;
        System.out.println("Xoa thanh cong!");
    }
    public void search() {
        System.out.println("Nhap ten can tim:");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (products[i].getName().toLowerCase().contains(keyword)) {
                System.out.println(products[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay san pham!");
        }
    }
    private int findIndexById(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }
}