package ss1_all_about_java;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = 23000;
        double usd;
        System.out.print("Nhap so tien USD: ");
        usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.println("So tien VND la: " + vnd);
        sc.close();
    }
}