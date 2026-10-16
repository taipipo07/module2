package ss2_loop_array;

public class DemSoNguyenTo {
    private static void main(String[] args) {
        int numbers = 20;

        int count = 0;

        for (int n = 2; count < numbers; n++) {
            boolean nguyenTo = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    nguyenTo = false;
                    break;
                }
            }

            if (nguyenTo) {
                System.out.print(n + " ");
                count++;
            }
        }
    }
}
