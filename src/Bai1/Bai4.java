package Bai1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("+================================+\n" +
                    "1.Tính tiền điện\n" +
                    "2.Sắp xếp mảng\n" +
                    "3.Điểm sinh viên\n" +
                    "4.Kết thúc\n" +
                    "+================================+\n");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    tinhTienDien(scanner);
                    break;
                case 2:
                    sapXepMang(scanner);
                    break;
                case 3:
                    diemSinhVien(scanner);
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình đang chạy.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
    public static void tinhTienDien(Scanner scanner) {
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

    public static void sapXepMang(Scanner scanner) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }

        System.out.print("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void diemSinhVien(Scanner scanner){
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
