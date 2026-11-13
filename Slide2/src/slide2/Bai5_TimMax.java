package slide2;

import java.util.Scanner;

/**
 * Bài 5: Nhập mảng n số nguyên. Tìm và in ra phần tử lớn nhất.
 * Gợi ý: dùng Math.max()
 */
public class Bai5_TimMax {
    public static void main(String[] args) {
        // Bước 1: Nhập n, tạo mảng và nhập các phần tử
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu: ");
        n = sc.nextInt();
        int[] a = new int[n];

        // Bước 2: Gán max = a[0] (không nên gán 0 vì mảng có thể toàn số âm)

        // Bước 3: Duyệt từ phần tử thứ 1 đến cuối, cập nhật: max = Math.max(max, a[i])

        // Bước 4: In max
    }
}
