package ss3_array_and_method;

import java.util.Scanner;

public class MergeArray {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] table1 = new int[5];
        table1[0] = 13;
        table1[1] = 21;
        table1[2] = 3;
        table1[3] = 43;
        table1[4] = 5;
        System.out.print("Gia tri cua ban 1 la: ");
        for (int i = 0; i < table1.length; i++) {
            System.out.print(table1[i] + " ");
        }
        int[] table2 = new int[5];
        table2[0] = 36;
        table2[1] = 2;
        table2[2] = 11;
        table2[3] = 65;
        table2[4] = 51;
        System.out.print("\nGia tri cua ban 2 la: ");
        for (int i = 0; i < table2.length; i++) {
            System.out.print(table2[i] + " ");
        }
        int[] table3 = new int[table1.length + table2.length];
        for (int i = 0; i < table1.length; i++) {
            table3[i] = table1[i];
            table3[i + table1.length] = table2[i];
        }
        System.out.print("\nGia tri cua ban 3 la: ");
        for (int i = 0; i < table3.length; i++) {
            System.out.print(table3[i] + " ");
        }
    }
}