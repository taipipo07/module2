package ss3_array_and_method;

import java.util.Scanner;

public class DeleteElementInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] table = new int[10];
        table[0] = 13;
        table[1] = 21;
        table[2] = 3;
        table[3] = 43;
        table[4] = 5;
        table[5] = 61;
        table[6] = 7;
        int n = 7;

        for (int i = 0; i < n; i++) {
            System.out.print(table[i] + " ");
        }

        System.out.print("\nNhap phan tu muon them:");
        int added = sc.nextInt();
        System.out.print("Nhap vi tri muon them (0 -> " + n + "):");
        int index = sc.nextInt();

        if (n >= table.length) {
            System.out.println("Mang Da Day, Khong The Them Phan Tu!");
        } else if (index < 0 || index > n) {
            System.out.println("Vi Tri Them Khong Hop Le!");
        } else {
            System.out.print("Phan Tu Can Them La: " + added +
                    " \nSe Nam O Vi Tri: "
                    + index);
            System.out.print("\nMang Moi Sau Khi Them Phan Tu: " + added + "\n");
            for (int i = n; i > index; i--) {
                table[i] = table[i - 1];
            }
            table[index] = added;
            n++;
            for (int i = 0; i < n; i++) {
                System.out.print(table[i] + " ");
            }
        }
    }
}