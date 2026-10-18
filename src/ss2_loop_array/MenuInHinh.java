package ss2_loop_array;

import java.util.Scanner;

public class MenuInHinh {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kiemTra = true;
        while (kiemTra) {
            System.out.println("-Kieu Hinh Muon IN-\n" +
                    "1.Hinh Chu Nhat \n" +
                    "2.In hình tam giác vuông, có cạnh góc vuông ở botton-left\n" +
                    "3.In hình tam giác vuông, có cạnh góc vuông ở top-left\n" +
                    "4.In hình tam giác cân.\n");
            System.out.println("END");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hinh Chu Nhat:");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 71; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Hinh Tam Giac(vuong duoi)");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hinh Tam Giac(vuong tren)");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Hinh Tam Giac Vuong Can");
                    break;
                default:
                    kiemTra = false;
            }
        }
    }
}
