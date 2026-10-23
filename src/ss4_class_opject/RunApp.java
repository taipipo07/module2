package ss4_class_opject;

import java.util.Scanner;

public class RunApp {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        boolean check = true;
        while (check) {
            System.out.println("----QUAN LY SINH VIEN----" +
                    "\n1.Danh Sach" +
                    "\n2.Xoa" +
                    "\n3.Them Moi" +
                    "\n4.Tim Kiem" +
                    "\n5.Thoat");
            System.out.println("----KET THUC----");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh Sach:");
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("Xoa:");
                    break;
                case 3:
                    System.out.println("Them Moi:");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Tim Kiem:");
                    break;
                default:
                    check = false;
            }
        }
    }
    }
