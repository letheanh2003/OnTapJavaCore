package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm 1:");
        System.out.print("Tên sản phẩm: ");
        String tenSp1 = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double donGia1 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia1 = scanner.nextDouble();

        scanner.nextLine(); // Đọc dòng trống sau khi đọc số

        System.out.println("Nhập thông tin sản phẩm 2:");
        System.out.print("Tên sản phẩm: ");
        String tenSp2 = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double donGia2 = scanner.nextDouble();
        System.out.print("Giảm giá: ");
        double giamGia2 = scanner.nextDouble();

        sanPham sp1 = new sanPham(tenSp1, donGia1, giamGia1);
        sanPham sp2 = new sanPham(tenSp2, donGia2, giamGia2);

        System.out.println("Thông tin sản phẩm 1:");
        sp1.xuat();

        System.out.println("Thông tin sản phẩm 2:");
        sp2.xuat();
    }
}
