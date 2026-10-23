package ss3_array_and_method;

import java.util.Scanner;

public class BonusElementInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        int[] bang = new int[10];
        bang[0] = 13;
        bang[1] = 21;
        bang[2] = 3;
        bang[3] = 43;
        bang[4] = 5;
        bang[5] = 61;
        bang[6] = 7;
        for (int i = 0; i < bang.length; i++) {
            System.out.print(bang[i] + " ");
        }
        System.out.print("\nNhap phan tu muon them vao:");
        int bonus = sc.nextInt();
        System.out.println("\nNhap vi tri muon them phan tu");
        int locial = sca.nextInt();
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < bang.length; i++) {
            if (bang[i] == bonus) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.print("Phan Tu Can Xoa La: " + bonus + " \nNam O Vi Tri: " + index);
            System.out.print("\nMang Moi Sau Khi Xoa Phan Tu: " + bonus+"\n");
            for (int i = index; i < bang.length - 1; i++) {
                bang[i] = bang[i + 1];
            }
            for (int i = 0; i < bang.length; i++) {
                System.out.print(bang[i] + " ");
            }
        } else {
            System.out.println("Phan Tu Can Xoa La Khong Ton Tai Trong Mang!");
        }
    }
}
