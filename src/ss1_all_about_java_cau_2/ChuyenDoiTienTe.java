package ss1_all_about_java_cau_2;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double rate = 23000;
        double usd;
        System.out.print("Nhap so tien USD: ");
        usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.println("So tien VND la: " + vnd);
        sc.close();
    }
}