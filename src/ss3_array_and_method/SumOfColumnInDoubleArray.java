package ss3_array_and_method;

import java.util.Scanner;

public class SumOfColumnInDoubleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] doubleArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.print("Nhap cot muon tinh tong: ");
        int Column = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            sum = sum + doubleArray[i][Column-1];
        }
        System.out.print("Tong cua cot " + Column + " la: " + sum);
    }
}