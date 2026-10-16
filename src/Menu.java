import java.util.Scanner;

public class Menu {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("----QUAN LY SINH VIEN----" +
                    "1.Danh Sach" +
                    "2.Xoa" +
                    "3.Them Moi" +
                    "4.Tim Kiem" +
                    "5.Thoat");
            System.out.println("----KET THUC----");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Danh Sach:");
                    break;
                case 2:
                    System.out.println("Xoa:");
                    break;
                case 3:
                    System.out.println("Them Moi:");
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
