package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float b1 = 50 * 1.678f;
        float b2 = b1 + 50 * 1.734f;
        float b3 = b2 + 100 * 2.014f;
        float b4 = b3 + 100 * 2.536f;
        float b5 = b4 + 100 * 2.834f;
        while (true) {
            System.out.print("Nhập số điện (nhập 0 để thoát): ");
            int sc = scanner.nextInt();

            if (sc == 0) {
                System.out.println("Kết thúc chương trình.");
                break;
            } else if (sc <= 0) {
                System.err.println("Nhập sai rồi, nhập lại đi.");
            } else if (sc > 400) {
                System.out.println("Giá tiền: " + (b5 + (sc - 400) * 2.927));
            } else if (sc > 300) {
                System.out.println("Giá tiền: " + (b4 + (sc - 300) * 2834));
            } else if (sc > 200) {
                System.out.println("Giá tiền: " + (b3 + (sc - 200) * 2.536));
            } else if (sc > 100) {
                System.out.println("Giá tiền: " + (b2 + (sc - 100) * 2.014));
            } else if (sc > 50) {
                System.out.println("Giá tiền: " + (b1 + (sc - 50) * 1.734));
            } else {
                System.out.println("Giá tiền: " + sc * 1.678);
            }
        }

        scanner.close();
    }
}