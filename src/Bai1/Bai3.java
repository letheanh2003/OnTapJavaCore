package Bai1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        String[] hoTen = new String[n];
        double[] diem = new double[n];
        String[] hocLuc = new String[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");

            System.out.print("Họ và tên: ");
            hoTen[i] = scanner.nextLine();

            System.out.print("Diem: ");
            diem[i] = scanner.nextDouble();

            if (diem[i] < 5) {
                hocLuc[i] = "Yeu";
            } else if (diem[i] < 6.5) {
                hocLuc[i] ="Trung Binh";
            } else if (diem[i] < 7.5) {
                hocLuc[i] ="Kha";
            } else if (diem[i] < 9) {
                hocLuc[i] ="Gioi";
            } else {
                hocLuc[i] ="Xuat sac";
            }
        }
        System.out.println("Danh sach sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (i + 1) + ":");
            System.out.println("Ho va ten " + hoTen[i]);
            System.out.println("Diem " + diem[i]);
            System.out.println("Hoc luc " + hocLuc[i]);
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    String tempHoTen = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = tempHoTen;

                    double tempDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempDiem;

                    String tempHocLuc = hocLuc[i];
                    hocLuc[i] = hocLuc[j];
                    hocLuc[j] = tempHocLuc;
                }
            }
        }
        System.out.println("Danh sach sinh vien da sap xep theo diem tang dan: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (i + 1) + ":");
            System.out.println("Ho va ten: " + hoTen[i]);
            System.out.println("Điem: " + diem[i]);
            System.out.println("Hoc luc: " + hocLuc[i]);
            System.out.println();

        }
    }
}
