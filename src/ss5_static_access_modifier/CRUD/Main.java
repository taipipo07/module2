package ss5_static_access_modifier.CRUD;

import java.util.Scanner;

public class Main {
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
}
