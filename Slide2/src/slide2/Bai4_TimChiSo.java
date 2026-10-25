package slide2;

import java.util.Scanner;

/**
 * Bài 4: Nhập mảng n số nguyên, sau đó nhập thêm số nguyên x.
 * Tìm và in ra vị trí (chỉ số) của x trong mảng.
 */
public class Bai4_TimChiSo {
    public static void main(String[] args) {
        // Bước 1: Nhập n, tạo mảng int[] a = new int[n], nhập các phần tử
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }

        // Bước 2: Nhập x cần tìm
        System.out.print("Nhap so can tim: ");
        int x = sc.nextInt();

        // Bước 3: Duyệt mảng bằng for, so sánh a[i] với x
        boolean found = false; // Cờ hiệu: đã tìm thấy x hay chưa

        System.out.print("Vi tri cua x la: ");
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.print(i + " ");
                found = true;
            }
        }

        // Bước 4: In kết quả (nhớ xử lý trường hợp không tìm thấy)
        if (!found) {
            System.out.print("khong tim thay");
        }
        System.out.println();
    }
}
